package com.example.proyectodam_1.room.util;

import com.example.proyectodam_1.room.DBTronicTec;
import com.example.proyectodam_1.room.dao.CursoDao;
import com.example.proyectodam_1.room.dao.RolDao;
import com.example.proyectodam_1.room.dao.SeccionDao;
import com.example.proyectodam_1.room.dao.UsuarioDao;
import com.example.proyectodam_1.room.entity.Clase;
import com.example.proyectodam_1.room.entity.Curso;
import com.example.proyectodam_1.room.entity.Rol;
import com.example.proyectodam_1.room.entity.Seccion;
import com.example.proyectodam_1.room.entity.Usuario;

public class DBInitializer {

    private DBTronicTec db;
    private RolDao rolDao;
    private UsuarioDao usuarioDao;
    private CursoDao cursoDao;
    private SeccionDao seccionDao;

    public DBInitializer(DBTronicTec db) {
        this.db = db;
        rolDao = this.db.getRolDao();
        usuarioDao = this.db.getUsuarioDao();
        cursoDao = this.db.getCursoDao();
        seccionDao = this.db.getSeccionDao();
    }

    public void init() {
        crearRoles();
        crearAdministrador();
        crearAlumno();
        crearProfesor();
        crearCursos();
        crearSecciones();
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

    private void crearAdministrador() {

        Rol rolAdministrador = rolDao.buscarRolPorDescripcion("Administrador");

        Usuario administrador = new Usuario();
        administrador.nombre = "Omar";
        administrador.apellido = "Reina";
        administrador.dni = "45930578";
        administrador.contrasenia = "123456";
        administrador.codigoRol = rolAdministrador.codigoRol;
        administrador.estado = "activo";

        usuarioDao.insertarUsuario(administrador);

    }

    private void crearAlumno(){
        Rol rolAlumno = rolDao.buscarRolPorDescripcion("Alumno");

        Usuario alumno = new Usuario();
        alumno.nombre = "John";
        alumno.apellido = "Doe";
        alumno.dni = "00000001";
        alumno.contrasenia = "alu1234";
        alumno.codigoRol = rolAlumno.codigoRol;
        alumno.estado = "activo";

        usuarioDao.insertarUsuario(alumno);
    }

    private void crearProfesor(){
        Rol rolProfesor = rolDao.buscarRolPorDescripcion("Profesor");

        Usuario profesor = new Usuario();
        profesor.nombre = "Jane";
        profesor.apellido = "Doe";
        profesor.dni = "00000002";
        profesor.contrasenia = "profe1234";
        profesor.codigoRol = rolProfesor.codigoRol;
        profesor.estado = "activo";

        usuarioDao.insertarUsuario(profesor);
    }

    private void crearCursos(){
        Curso cursoMoviles = new Curso();
        cursoMoviles.descripcion = "Aplicaciones móviles 1";
        Curso cursoWeb = new Curso();
        cursoWeb.descripcion = "Aplicaciones Web 2";

        cursoDao.insertarCurso(cursoMoviles);
        cursoDao.insertarCurso(cursoWeb);
    }

    private void crearSecciones(){
        Seccion seccionTarde = new Seccion();
        seccionTarde.descripcion = "T6AB";
        seccionTarde.estado = "activo";

        Seccion seccionNoche = new Seccion();
        seccionNoche.descripcion = "T6CB";
        seccionNoche.estado = "activo";

        seccionDao.insertarSeccion(seccionTarde);
        seccionDao.insertarSeccion(seccionNoche);
    }

    private void crearClases(){
        
    }
}
