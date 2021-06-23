package com.example.proyectodam_1.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.proyectodam_1.room.entity.Curso;

import java.util.List;

@Dao
public interface CursoDao {

    @Insert
    public long insertarCurso(Curso curso);

    @Query("SELECT * FROM curso")
    public List<Curso> listarCurso();

    @Query("SELECT * FROM curso WHERE descripcion = :descripcion")
    public Curso buscarCursoPorDescripcion(String descripcion);

    @Query("SELECT * FROM curso WHERE codigoCurso = :codigoCurso")
    public Curso buscarCursoPorCodigo(int codigoCurso);


}
