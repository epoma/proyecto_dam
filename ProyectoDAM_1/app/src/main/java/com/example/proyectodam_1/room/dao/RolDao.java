package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.proyectodam_1.room.entity.Rol;

import java.util.List;

@Dao
public interface RolDao {

    @Query("SELECT * FROM rol")
    public List<Rol> getRoles();
}
