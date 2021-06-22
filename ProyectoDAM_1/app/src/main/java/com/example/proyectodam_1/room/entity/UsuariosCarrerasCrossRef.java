package com.example.proyectodam_1.room.entity;

import androidx.room.Entity;

@Entity(primaryKeys = {"codigoCarrera", "codigoUsuario"})
public class UsuariosCarrerasCrossRef {
    public int codigoCarrera;
    public int codigoUsuario;
}
