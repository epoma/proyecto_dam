package com.example.proyectodam_1.daoClass;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.proyectodam_1.Classes.tb_Carrera;

import java.util.ArrayList;


public class daoCarrera {
    Context C;
    tb_Carrera Race;
    ArrayList<tb_Carrera> listaCarrera;
    SQLiteDatabase sql;
    String BD= "BDalumnos";



    public daoCarrera(Context c){
        this.C=c;
        sql = c.openOrCreateDatabase(BD, c.MODE_PRIVATE, null);
        Race = new tb_Carrera();

    }

        public ArrayList<tb_Carrera> selectCarrera(){
            ArrayList<tb_Carrera> lista = new ArrayList<>();
            listaCarrera.clear();
            Cursor cr = sql.rawQuery("select * from carrera", null);
            if(cr !=null && cr.moveToFirst()){
                do { tb_Carrera ca = new tb_Carrera();
                    ca.setCodigo(cr.getInt(0));
                    ca.setDescripcion(cr.getString(1));
                    ca.setEstado(cr.getString(2));
                    lista.add(ca);
                }while (cr.moveToNext());
            }
            return  lista;
        }


        public int buscar(String c){
            int x=0;
            listaCarrera= selectCarrera();
            for (tb_Carrera carera: listaCarrera){
                if(carera.getDescripcion().equals(c)){
                    x++;
                }
            }
            return x;
        }

        public boolean insertarCarrera(tb_Carrera race){
            if(buscar(race.getDescripcion())==0){
                ContentValues cv = new ContentValues();
                cv.put("nombCarrera", race.getDescripcion());
                cv.put("estado", race.getEstado());
                return (sql.insert("carrera", null, cv)>0);
            }else{
                return false;
            }
        }




}
