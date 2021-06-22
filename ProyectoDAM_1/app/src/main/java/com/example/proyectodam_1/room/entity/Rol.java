package com.example.proyectodam_1.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "rol")
public class Rol {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "codigoRol")
    public int codigoRol;

    @ColumnInfo(name= "descripcion")
    public String descripcion;

    public Rol(){

    }

    @Ignore
    public Rol(String descripcion) {
        this.descripcion = descripcion;
    }
}
