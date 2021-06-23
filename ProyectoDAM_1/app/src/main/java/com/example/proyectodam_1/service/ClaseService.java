package com.example.proyectodam_1.service;

import com.example.proyectodam_1.room.DBTronicTec;
import com.example.proyectodam_1.room.dao.AlumnoClaseDao;
import com.example.proyectodam_1.room.dao.ClaseDao;
import com.example.proyectodam_1.room.dao.CursoDao;
import com.example.proyectodam_1.room.dao.SeccionDao;
import com.example.proyectodam_1.room.entity.AlumnoClase;
import com.example.proyectodam_1.room.entity.Clase;
import com.example.proyectodam_1.room.entity.Curso;

import java.util.ArrayList;
import java.util.List;

public class ClaseService {

    private ClaseDao claseDao;
    private AlumnoClaseDao alumnoClaseDao;
    private CursoDao cursoDao;
    private SeccionDao seccionDao;

    public ClaseService(DBTronicTec db) {
        this.claseDao = db.getClaseDao();
        this.cursoDao = db.getCursoDao();
        this.seccionDao = db.getSeccionDao();
        this.alumnoClaseDao = db.getAlumnoClaseDao();
    }


    private List<Clase> rellenarClasesConDependencias(List<Clase> clasesARellenar){


        for(Clase clase : clasesARellenar){
            clase.seccion = seccionDao.buscarSeccionPorCodigo(clase.codigoSeccion);
            clase.curso = cursoDao.buscarCursoPorCodigo(clase.codigoCurso);
        }

        return clasesARellenar;
    }

    public List<Clase> buscarClasesPorAlumno (int codigoUsuario) {

        List<Clase> clases = new ArrayList<>();

        List<AlumnoClase> clasesPorAlumno = alumnoClaseDao.buscarClasesPorAlumno(codigoUsuario);

        List<Integer> codigosClases = new ArrayList<>();

        for(AlumnoClase alumnoClase : clasesPorAlumno) {
            codigosClases.add(alumnoClase.codigoClase);
        }

        clases = claseDao.listarClasesPorCodigos(codigosClases);

        return clases;
    }
}
