package com.example.proyectodam_1.room.entity;


import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class CursosConClases {

    @Embedded
    public Curso curso;

    @Relation(
            parentColumn = "codigoCurso",
            entityColumn = "codigoCurso"
    )
    public List<Clase> clases;
}
