package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.proyectodam_1.room.entity.Asistencia;

@Dao
public interface AsistenciaDao {

    @Insert
    public long insertarAsistencia(Asistencia asistencia);

}
