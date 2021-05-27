package com.example.proyectodam_1.daoClass;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import com.example.proyectodam_1.Classes.Administrador;



public class daoAdministrador {
    Context C;
    Administrador Administradorclase;
    ArrayList<Administrador> lista;
    SQLiteDatabase sql;
    String BD = "BDalumnos";
    String tablaAdmin = "create table if not exists administrador(id integer primary key autoincrement," +
            "admins text, nomb text, apell text, contra text)";


    public daoAdministrador(Context C) {
        this.C = C;
        sql = C.openOrCreateDatabase(BD, C.MODE_PRIVATE, null);
        sql.execSQL(tablaAdmin);
        Administradorclase = new Administrador();

    }


    public ArrayList<Administrador> seleccionarAdmin() {
        ArrayList<Administrador> lista = new ArrayList<>();
        lista.clear();
        Cursor cr = sql.rawQuery("Select * from administrador", null);
        if (cr != null && cr.moveToFirst()) {
            do {Administrador ad = new Administrador();
                ad.setCodigo(cr.getInt(0));
                ad.setAdministrador(cr.getString(1));
                ad.setNombre(cr.getString(2));
                ad.setApellido(cr.getString(3));
                ad.setContraseña(cr.getString(4));
                lista.add(ad);
            } while (cr.moveToNext());
        }
        return lista;
    }



    public boolean insertarAdministrador(Administrador admin){
        if (buscarAdmin(admin.getAdministrador())==0){
            ContentValues cv = new ContentValues();
            cv.put("admins", admin.getAdministrador());
            cv.put("nomb", admin.getNombre());
            cv.put("apell", admin.getApellido());
            cv.put("contra", admin.getContraseña());
            return (sql.insert("administrador", null, cv)>0);
        }else{
            return false;
        }
    }

    public int buscarAdmin(String a){
        int x=0;
        lista=seleccionarAdmin();
        for (Administrador admin: lista){
            if (admin.getAdministrador().equals(a)){
                x++;
            }
        }
        return x;
    }


    public int loginAdmin (String admin, String pass) {
        int b = 0;
        Cursor cr = sql.rawQuery("select admins, contra from administrador", null);
        if (cr != null && cr.moveToFirst()) {
            do {
                if (cr.getString(1).equals(admin) && cr.getString(4).equals(pass)) {
                    b++;
                    break;
                }
            } while (cr.moveToNext());
        }
        return b;
    }


    public Administrador getAdministrado(String admin, String contra){
        lista = seleccionarAdmin();
        for (Administrador al:lista) {
            if(al.getAdministrador().equals(admin) && al.getContraseña().equals(contra)){
                return  al;
            }
        }
        return null;

    }

    public Administrador getAdminbyId(int id){
        lista = seleccionarAdmin();
        for (Administrador al:lista) {
            if(al.getCodigo()==id){
                return  al;
            }
        }
        return null;

    }






}


