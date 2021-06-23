package com.example.proyectodam_1.service;

import com.example.proyectodam_1.room.DBTronicTec;
import com.example.proyectodam_1.room.dao.AsistenciaDao;
import com.example.proyectodam_1.room.entity.Asistencia;

public class AsistenciaService {

    private AsistenciaDao asistenciaDao;

    public AsistenciaService(DBTronicTec db) {
        asistenciaDao = db.getAsistenciaDao();
    }


    public void insertarAsistencia(Asistencia asistencia) {
        asistenciaDao.insertarAsistencia(asistencia);
    }
    

}
