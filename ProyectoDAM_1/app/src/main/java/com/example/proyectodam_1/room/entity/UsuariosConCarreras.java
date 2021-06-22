package com.example.proyectodam_1.room.entity;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class UsuariosConCarreras {
    @Embedded
    public Usuario usuario;

    @Relation(
            parentColumn = "codigoUsuario",
            entityColumn = "codigoUsuario",
            associateBy = @Junction(UsuariosCarrerasCrossRef.class)
    )
    public List<Carrera> carreras;
}
