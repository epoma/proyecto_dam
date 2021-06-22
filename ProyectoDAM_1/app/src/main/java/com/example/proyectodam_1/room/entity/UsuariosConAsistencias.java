package com.example.proyectodam_1.room.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class UsuariosConAsistencias {

    @Embedded
    public Usuario usuario;

    @Relation(
            parentColumn = "codigoUsuario",
            entityColumn = "codigoUsuario"
    )
    public List<Asistencia> asistencias;

}
