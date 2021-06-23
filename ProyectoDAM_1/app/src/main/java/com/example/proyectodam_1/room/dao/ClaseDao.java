package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.proyectodam_1.room.entity.Clase;

import java.util.List;

@Dao
public interface ClaseDao {

    @Query("SELECT * FROM clase")
    public List<Clase> listarClases();

    @Insert
    public long insertarClase(Clase clase);


}
