package com.example.proyectodam_1.daoClass;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class IniciadorBd {

    private static Context C;

    private static  SQLiteDatabase sql;

    private static String BD = "BDalumnos";

    private static String sqlTablaProfesor = "create table if not exists profesor(id integer primary key autoincrement," +
            "prof text, nomb text, apell text, contra text)";

    private  static  String sqlTablaCarrera ="create table if not exists carrera(codigo integer primary key autoincrement" +
            ", nombCarrera text" +
            ", estado text)";

    private  static String sqlTablaAlumno = "create table if not exists alumno(id integer primary key autoincrement, " +
            "alum text, " +
            "nomb text, " +
            "ape text, " +
            "pass text, direcc text, estado tex, edad int, celular int, codcarrera int)";

    private static String sqlTablaAdministrador = "create table if not exists administrador(id integer primary key autoincrement," +
            "admins text, nomb text, apell text, contra text)";

    private static String sqlCrearUsuarioAdmin = "insert into administrador (admins, nomb, apell, contra) values (\"Admin\", \"Omar\", \"Reyna\", \"12345\")";

    private IniciadorBd() {
    }

    public static void crearDB(Context C) {
        IniciadorBd.C = C;
        sql = C.openOrCreateDatabase(BD, C.MODE_PRIVATE, null);
        sql.execSQL(sqlTablaProfesor);
        sql.execSQL(sqlTablaAlumno);
        sql.execSQL(sqlTablaCarrera);
        sql.execSQL(sqlTablaAdministrador);
        sql.execSQL(sqlCrearUsuarioAdmin);
    }




}
