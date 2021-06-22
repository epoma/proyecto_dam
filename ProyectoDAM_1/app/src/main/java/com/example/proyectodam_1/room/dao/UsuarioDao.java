package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.proyectodam_1.room.entity.Usuario;

import java.util.List;

@Dao
public interface UsuarioDao {

    @Query("SELECT * FROM usuario WHERE estado = 'activo'")
    public List<Usuario> listarUsuarios();

    @Query("SELECT * FROM usuario WHERE dni = :dni AND contrasenia = :contrasenia")
    public Usuario loginUsuario(String dni, String contrasenia);

    @Insert
    public long insertarUsuario(Usuario usuario);

    @Update
    public int actualizarUsuario(Usuario usuario);

    @Query("UPDATE usuario SET estado = 'inactivo' where codigoUsuario = :codigoUsuario")
    public void eliminarUsuario(int codigoUsuario);

}
