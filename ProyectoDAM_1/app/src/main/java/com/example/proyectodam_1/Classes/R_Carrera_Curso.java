package com.example.proyectodam_1.Classes;

import androidx.room.Embedded;
import androidx.room.Relation;
import java.util.List;

public class R_Carrera_Curso {
    @Embedded tb_Carrera carrera;
    @Relation(
            parentColumn = "codigoCarrera",
            entityColumn = "id_carrera"
    )
    public List<tb_Curso> cursos;


}
