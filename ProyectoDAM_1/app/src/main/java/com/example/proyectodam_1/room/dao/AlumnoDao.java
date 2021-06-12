package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.proyectodam_1.room.entidades.Alumno;

import java.util.List;

@Dao
public interface AlumnoDao {

    @Query("SELECT * FROM alumno")
    List<Alumno> listarAlumnos();

    @Insert
    long agregarAlumnos(Alumno alumno);

    @Update
    long actualizarAlumno(Alumno alumno);

    @Query("SELECT * FROM alumno WHERE codigo = :codigo")
    int buscarAlumno(int codigo);

    @Query("SELECT * FROM alumno WHERE alumno = :alumno AND password = :password")
    Alumno login(String alumno, String password);



}
