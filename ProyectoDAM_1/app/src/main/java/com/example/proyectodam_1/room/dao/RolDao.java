package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.proyectodam_1.room.entity.Rol;

import java.util.List;

@Dao
public interface RolDao {

    @Query("SELECT * FROM rol")
    public List<Rol> listarRoles();

    @Insert
    public long insertarRol(Rol rol);

    @Query("SELECT * FROM rol WHERE descripcion = :descripcion")
    public Rol buscarRolPorDescripcion(String descripcion);

    @Query("SELECT * FROM rol where codigoRol = :codigo")
    public Rol buscarRolPorId(int codigo);
}
