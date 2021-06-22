package com.example.proyectodam_1.room.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class SeccionesConClases {
    @Embedded
    public Seccion seccion;

    @Relation(
            parentColumn = "codigoSeccion",
            entityColumn = "codigoSeccion"
    )
    public List<Clase> clases;

}
