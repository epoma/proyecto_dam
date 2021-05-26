package com.example.proyectodam_1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSqliteHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="cibertec.db";
    private static final String Table_profesor="t_profesor";
    private static final String Table_alumno="t_alumno";


    public AdminSqliteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase DB) {

        DB.execSQL("create table " +Table_profesor+ "(" +
                "codigo integer primary key," +
                "nombre text not null," +
                "apellido text not null," +
                "contraseña text not null)");

        DB.execSQL("create table" +Table_alumno+ "(" +
                "codigo integer primary key," +
                "nombre text not null," +
                "apellido text not null," +
                "contraseña text not null)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase BD, int oldVersion, int newVersion) {

        BD.execSQL("drop table"+Table_profesor);
        onCreate(BD);

    }
}
