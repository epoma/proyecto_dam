package com.example.proyectodam_1.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "asistencia")
public class Asistencia {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name= "codigoAsistencia")
    public int codigoAsistencia;

    @ColumnInfo(name="codigoUsuario")
    public int codigoUsuario;

    @ColumnInfo(name="estado")
    public String estado;

    @ColumnInfo(name="codigoClase")
    public int codigoClase;

    @Ignore
    public Clase clase;

    @Ignore
    public Usuario alumno;

}
