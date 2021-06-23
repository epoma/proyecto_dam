package com.example.proyectodam_1.room.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

@Entity(primaryKeys = {"codigoCarrera", "codigoUsuario"})
public class UsuarioCarrera {

    @ColumnInfo(name = "codigoCarrera")
    public int codigoCarrera;

    @ColumnInfo(name = "codigoUsuario")
    public int codigoUsuario;

    @Ignore
    public Usuario alumno;
    @Ignore
    public Carrera carrera;

}
