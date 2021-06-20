package com.example.proyectodam_1.daoClass;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import java.util.ArrayList;

public class daoProfesor {
    Context C;
    Profesor profesorclase;
    ArrayList<Profesor> lista;
    SQLiteDatabase sql;
    String BD = "BDalumnos";

    public daoProfesor(Context C) {
        this.C = C;
        sql = C.openOrCreateDatabase(BD, C.MODE_PRIVATE, null);
        profesorclase = new Profesor();

    }


    public ArrayList<Profesor> seleccionarProfesor() {
        ArrayList<Profesor> lista = new ArrayList<>();
        lista.clear();
        Cursor cr = sql.rawQuery("Select * from profesor", null);
        if (cr != null && cr.moveToFirst()) {
            do {
                Profesor pro = new Profesor();
                pro.setCodigo(cr.getInt(0));
                pro.setProfesor(cr.getString(1));
                pro.setNombre(cr.getString(2));
                pro.setApellido(cr.getString(3));
                pro.setContraseña(cr.getString(4));
                lista.add(pro);
            } while (cr.moveToNext());
        }
        return lista;
    }


    public int buscarprof(String find) {
        int b = 0;
        lista = seleccionarProfesor();
        for (Profesor profe : lista) {
            if (profe.getProfesor().equals(find)) {
                b++;
            }
        }
        return b;
    }


    public boolean insertarProfesor(Profesor profesor){
        if (buscarprof(profesor.getProfesor())==0){
            ContentValues cv = new ContentValues();
            cv.put("alum", profesor.getProfesor());
            cv.put("nomb", profesor.getNombre());
            cv.put("ape", profesor.getApellido());
            cv.put("pass", profesor.getContraseña());
            return (sql.insert("profesor", null, cv)>0);
        }else{
            return false;
        }
    }



    public int Login(String teacher, String password) {
        int l = 0;
        Cursor cr = sql.rawQuery("Select prof, contra from profesor", null);
        if (cr != null && cr.moveToFirst()) {
            do {
                String prof =cr.getString(0);
                String passd = cr.getString(1);
                if (cr.getString(0).equals(teacher) && cr.getString(1).equals(password)) {
                    l++;
                    break;
                }
            } while (cr.moveToNext());
        }
        return l;
    }


    public Profesor getprofesor(String teacher, String pass) {
        lista = seleccionarProfesor();
        for (Profesor pro : lista) {
            if (pro.getProfesor().equals(teacher) && pro.getContraseña().equals(pass)) {
                return pro;
            }
        }
        return null;
    }


    public Profesor getProfesorbyId(int id){
        lista = seleccionarProfesor();
        for (Profesor pro:lista) {
            if(pro.getCodigo()==id){
                return  pro;
            }
        }
        return null;

    }





}
