package com.example.proyectodam_1.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "asistencia")
public class Asistencia {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name= "codigoAsistencia")
    private int codigoAsistencia;

    @ColumnInfo(name="codigoUsuario")
    private int codigoUsuario;

    @ColumnInfo(name="estado")
    private String estado;

    @ColumnInfo(name="codigoClase")
    private int codigoClase;


}
