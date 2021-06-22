package com.example.proyectodam_1.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "seccion")
public class Seccion {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "codigoSeccion")
    public int codigoSeccion;

    @ColumnInfo(name = "descripcion")
    public String descripcion;

    @ColumnInfo(name = "estado")
    public String estado;
}
