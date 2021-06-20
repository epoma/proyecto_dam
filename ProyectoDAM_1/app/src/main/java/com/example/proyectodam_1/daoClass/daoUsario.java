package com.example.proyectodam_1.daoClass;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.proyectodam_1.Classes.tb_Usuario;
import java.util.ArrayList;
import java.util.List;
import com.example.proyectodam_1.Lista_alumnos;

@Dao
public interface daoUsario {

   @Insert(onConflict = OnConflictStrategy.REPLACE)
    void InsertarUsuario(tb_Usuario Usuario);

   @Update
    void ActualizarUsuario(tb_Usuario Usuario);

   @Delete
    void BorrarUsuario(tb_Usuario Usuario);

    @Query("SELECT * FROM Usuario")
    tb_Usuario[] TodosLosUsuarios();

    @Query("SELECT * FROM Usuario WHERE dni_usuario LIKE :DNIUsu AND password like :pass")
    tb_Usuario[] LoginUsuario(int DNIUsu, String pass);

    @Query("SELECT nombre_usuario, apellido_usuario FROM Usuario")
    public List<tb_Usuario> Listado();

}
