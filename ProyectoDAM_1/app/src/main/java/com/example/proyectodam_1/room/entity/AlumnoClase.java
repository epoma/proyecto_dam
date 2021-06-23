package com.example.proyectodam_1.room.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

@Entity(tableName = "alumnoclase", primaryKeys = {"codigoAlumno", "codigoClase"})
public class AlumnoClase {

    @ColumnInfo(name = "codigoAlumno")
    public int codigoAlumno;

    @ColumnInfo(name = "codigoClase")
    public int codigoClase;

    @Ignore
    public Usuario alumno;

    @Ignore
    public Clase clase;

}
