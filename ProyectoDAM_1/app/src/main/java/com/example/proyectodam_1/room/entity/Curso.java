package com.example.proyectodam_1.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "curso")
public class Curso {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "codigoCurso")
    public int codigoCurso;

    @ColumnInfo(name = "descripcion")
    public String descripcion;
}
