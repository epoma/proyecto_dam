package com.example.proyectodam_1.room.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class ProfesoresConClases {
    @Embedded
    public Usuario profesor;

    @Relation(
            parentColumn = "codigoUsuario",
            entityColumn = "codigoProfesor"
    )
    public List<Clase> clases;

}
