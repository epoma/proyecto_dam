package com.example.proyectodam_1.room.entity;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class CarrerasConUsuarios {

    @Embedded
    public Carrera carrera;

    @Relation(
            parentColumn = "codigoCarrera",
            entityColumn = "codigoCarrera",
            associateBy = @Junction(UsuariosCarrerasCrossRef.class)
    )
    public List<Usuario> usuarios;
}
