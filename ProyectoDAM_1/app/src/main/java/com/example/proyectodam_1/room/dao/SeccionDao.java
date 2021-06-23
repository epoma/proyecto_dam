package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.proyectodam_1.room.entity.Seccion;

import java.util.List;

@Dao
public interface SeccionDao {

    @Insert
    public long insertarSeccion(Seccion seccion);

    @Query("SELECT * FROM seccion")
    public List<Seccion> listarSeccion();

    @Query("SELECT * FROM seccion WHERE descripcion = :descripcion")
    public Seccion buscarSeccionPorDescripcion(String descripcion);
}
