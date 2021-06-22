package com.example.proyectodam_1.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "clase")
public class Clase {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "codigoClase")
    public int codigoClase;

    @ColumnInfo(name = "codigoProfesor")
    public int codigoProfesor;

    @ColumnInfo(name = "hora")
    public String hora;

    @ColumnInfo(name = "codigoCurso")
    public int codigoCurso;

    @ColumnInfo(name = "codigoSeccion")
    public int codigoSeccion;

    @ColumnInfo(name = "estado")
    public String estado;

}
