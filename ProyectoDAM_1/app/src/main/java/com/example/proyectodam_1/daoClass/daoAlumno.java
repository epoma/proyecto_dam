package com.example.proyectodam_1.daoClass;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import java.util.ArrayList;

public class daoAlumno extends DaoGenerico<Alumno> {
    Alumno a;
    //ArrayList<Alumno> lista;
    //SQLiteDatabase sql;
    String DB= "BDalumnos";
        //para crear o abrir la base de datos
    public daoAlumno(Context C){
        super(C);
        //sql = C.openOrCreateDatabase(DB, C.MODE_PRIVATE, null);
        a= new Alumno();
    }

    @Override
    protected Alumno iniciarEntidad() {
        return new Alumno();
    }

    @Override
    protected ContentValues contentValuesDesdeEntidad(Alumno entidad) {

        ContentValues cv = new ContentValues();
        cv.put("alum", entidad.getAlumno());
        cv.put("nomb", entidad.getNombre());
        cv.put("ape", entidad.getApellido());
        cv.put("pass", entidad.getPassword());
        cv.put("direcc", entidad.getDireccion());
        cv.put("estado", entidad.getEstado());
        cv.put("edad", entidad.getEdad());
        cv.put("celular",entidad.getCelular());
        cv.put("codcarrera",entidad.getCodcarrera());

        return cv;
    }

    public boolean insertarAlumno(Alumno a){
        if (buscar(a.getAlumno())==0){
            return this.insertarEntidad(a);
    }else{
        return false;
        }
    }

    public int buscar(String a){
           return this.buscarEntidad(a);
   }



    public ArrayList<Alumno> selectAlumno(){
        return this.selectEntidad("alumno");
    }

    @Override
    protected Alumno entidadDesdeCursor(Cursor cursor) {
        Alumno a = new Alumno();
            a.setCodigo(cursor.getInt(0));
            a.setAlumno(cursor.getString(1));
            a.setNombre(cursor.getString(2));
            a.setApellido(cursor.getString(3));
            a.setPassword(cursor.getString(4));
            a.setDireccion(cursor.getString(5));
            a.setEstado(cursor.getString(6));
            a.setEdad(cursor.getInt(7));
            a.setCelular(cursor.getInt(8));
            a.setCodcarrera(cursor.getInt(9));
            return a;
    }

    public int login (String a, String p) {
        int b = 0;
        Cursor cr = sql.rawQuery("select alum, pass from alumno", null);
        if (cr != null && cr.moveToFirst()) {
            do {
                String alumx = cr.getString(0);
                String pass = cr.getString(1);
                if (cr.getString(0).equals(a) && cr.getString(1).equals(p)) {
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
