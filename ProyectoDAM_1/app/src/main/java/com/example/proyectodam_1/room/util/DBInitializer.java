package com.example.proyectodam_1.room.util;

import com.example.proyectodam_1.room.DBTronicTec;
import com.example.proyectodam_1.room.dao.RolDao;
import com.example.proyectodam_1.room.dao.UsuarioDao;
import com.example.proyectodam_1.room.entity.Rol;

public class DBInitializer {

    private DBTronicTec db;
    private RolDao rolDao;
    private UsuarioDao usuarioDao;

    public DBInitializer(DBTronicTec db) {
        this.db = db;
        rolDao = this.db.getRolDao();

    }

    public void init() {
        crearRoles();
    }


    private void crearRoles() {

        Rol[] rolesAInsertar = new Rol[]{
          new Rol("Administrador"),
          new Rol("Profesor"),
          new Rol("Alumno")
        };

        for(Rol rol : rolesAInsertar) {
            rolDao.insertarRol(rol);
        }

    }

    private void crearUsuario() {

    }
}
