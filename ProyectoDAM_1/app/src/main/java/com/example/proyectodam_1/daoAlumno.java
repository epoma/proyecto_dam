package com.example.proyectodam_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class daoAlumno {
    Context C;
    Alumno a;
    ArrayList<Alumno> lista;
    SQLiteDatabase sql;
    String DB= "BDalumnos";
    String tabla= "create table if not exists alumno(id integer primary key autoincrement, alum text, nomb text, ape text, pass text)";

        //para crear o abrir la base de datos
    public daoAlumno(Context C){
        this.C=C;
        sql = C.openOrCreateDatabase(DB, C.MODE_PRIVATE, null);
        sql.execSQL(tabla);
        a= new Alumno();

    }

    public boolean insertarAlumno(Alumno a){
        if (buscar(a.getAlumno())==0){
            ContentValues cv = new ContentValues();
            cv.put("alum", a.getAlumno());
            cv.put("nomb", a.getNombre());
            cv.put("ape", a.getApellido());
            cv.put("pass", a.getPassword());
        return (sql.insert("alumno", null, cv)>0);
    }else{
        return false;
        }
    }

    public int buscar(String a){
            int x=0;
            lista=selectAlumno();
            for (Alumno alum: lista){
                if (alum.getAlumno().equals(a)){
                    x++;
                }
            }
           return x;
   }

    public ArrayList<Alumno> selectAlumno(){
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
        lista.clear();
        Cursor cr=sql.rawQuery("select * from alumno", null);
        if (cr!=null&& cr.moveToFirst()){
            do{ Alumno a = new Alumno();
            a.setCodigo(cr.getInt(0));
            a.setAlumno(cr.getString(1));
            a.setNombre(cr.getString(2));
            a.setApellido(cr.getString(3));
            a.setPassword(cr.getString(4));
            lista.add(a);
            }while(cr.moveToNext());

        }
        return lista;
    }


    public int login (String a, String p) {
        int b = 0;
        Cursor cr = sql.rawQuery("select * from alumno", null);
        if (cr != null && cr.moveToFirst()) {
            do {
                if (cr.getString(1).equals(a) && cr.getString(4).equals(p)) {
                    b++;
                    break;
                }
            } while (cr.moveToNext());
        }
        return b;
    }


    public Alumno getAlumno(String a, String p){
        lista = selectAlumno();
        for (Alumno al:lista) {
            if(al.getAlumno().equals(a) && al.getPassword().equals(p)){
                return  al;
            }
        }
        return null;

    }

    public Alumno getAlumnobyId(int id){
        lista = selectAlumno();
        for (Alumno al:lista) {
            if(al.getCodigo()==id){
                return  al;
            }
        }
        return null;

    }



}
