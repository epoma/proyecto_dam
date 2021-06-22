package com.example.proyectodam_1.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "carrera")
public class Carrera {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "codigo")
    private int codigo;

    @ColumnInfo (name = "descripcion")
    private String descripcion;

    @ColumnInfo(name = "estado")
    private String estado;
}
