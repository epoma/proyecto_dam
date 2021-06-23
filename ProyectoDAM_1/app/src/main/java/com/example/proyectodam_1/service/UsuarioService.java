package com.example.proyectodam_1.service;

import com.example.proyectodam_1.room.DBTronicTec;
import com.example.proyectodam_1.room.dao.RolDao;
import com.example.proyectodam_1.room.dao.UsuarioDao;
import com.example.proyectodam_1.room.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private UsuarioDao usuarioDao;
    private RolDao rolDao;

    public UsuarioService(DBTronicTec db) {
        this.rolDao = db.getRolDao();
        this.usuarioDao = db.getUsuarioDao();
    }


    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        usuarios = usuarioDao.listarUsuarios();

        for(Usuario usuario : usuarios) {
            usuario.rol = rolDao.buscarRolPorId(usuario.codigoRol);
        }

        return  usuarios;
    }

    public void insertarUsuario(Usuario usuario) {
        usuarioDao.insertarUsuario(usuario);
    }

    public void actualizarUsuario(Usuario usuario) {
        usuarioDao.actualizarUsuario(usuario);
    }

    public void eliminarUsuario(int codigoUsuario) {
        usuarioDao.eliminarUsuario(codigoUsuario);
    }

    public Usuario login(String dni, String contrasenia) {
        Usuario usuario = new Usuario();

        usuario = usuarioDao.loginUsuario(dni, contrasenia);

        usuario.rol = rolDao.buscarRolPorId(usuario.codigoRol);

        return  usuario;
    }
}
