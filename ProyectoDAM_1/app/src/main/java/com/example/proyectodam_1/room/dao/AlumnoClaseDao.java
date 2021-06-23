package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.proyectodam_1.room.entity.AlumnoClase;

import java.util.List;

@Dao
public interface AlumnoClaseDao {

    @Query("SELECT * FROM alumnoclase WHERE codigoAlumno = :codigoAlumno")
    public List<AlumnoClase> buscarClasesPorAlumno(int codigoAlumno);

}
