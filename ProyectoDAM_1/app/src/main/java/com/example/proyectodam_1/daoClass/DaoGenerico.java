package com.example.proyectodam_1.daoClass;

import android.content.ContentValues;
import android.content.Context;
import android.content.Entity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.proyectodam_1.Classes.Alumno;
import com.example.proyectodam_1.Classes.Profesor;

import java.util.ArrayList;
import java.util.Map;

public abstract class DaoGenerico<T> {

    Context C;
    T entidad;
    ArrayList<T> lista;
    SQLiteDatabase sql;
    String BD = "BDalumnos";
    protected String nombreTabla;

    public DaoGenerico(Context c) {
        C = c;
        sql = C.openOrCreateDatabase(BD, C.MODE_PRIVATE, null);
        this.entidad = this.iniciarEntidad();
    }

    protected abstract T iniciarEntidad();

    protected boolean insertarEntidad(T entidad) {
            ContentValues contentValues = contentValuesDesdeEntidad(entidad);
            return (sql.insert("alumno", null, contentValues)>0);
    }

    protected abstract ContentValues contentValuesDesdeEntidad(T entidad);

    public ArrayList<T> selectEntidad(String nombreEntidad){
        this.lista = new ArrayList<T>();
        lista.clear();
        Cursor cr=sql.rawQuery("select * from " + nombreEntidad, null);
        if (cr!=null&& cr.moveToFirst()){
            do{
                T entidad = entidadDesdeCursor(cr);
                lista.add(entidad);
            }while(cr.moveToNext());

        }
        return lista;
    }

    protected T entidadDesdeCursor(Cursor cursor) {
        return  this.entidad;
    }

    public int buscarEntidad(String a, String nombreEntidad){
        int x=0;
        lista=selectEntidad(nombreEntidad);
        for (T entidad : lista){
            if (entidadExiste(entidad)){
                x++;
                break;
            }
        }
        return x;
    }

    protected int entidadExiste(Map<String, Object> filtros) {

        String clausulaWhere = "";

        int existe = 0;
        Cursor cr=sql.rawQuery("select * from " + nombreTabla + " where ", null);
        return  existe;
    }

    private String contruirWhere(Map<String, Object> filtros) {
        String clausulaWhere = " ";

        for(String clave : filtros.keySet()) {
            clausulaWhere += clave + " = ? AND ";
        }


        return clausulaWhere;
    }
}
