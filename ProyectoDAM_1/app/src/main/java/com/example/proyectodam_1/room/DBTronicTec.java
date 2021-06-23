package com.example.proyectodam_1.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.proyectodam_1.room.dao.AsistenciaDao;
import com.example.proyectodam_1.room.dao.ClaseDao;
import com.example.proyectodam_1.room.dao.CursoDao;
import com.example.proyectodam_1.room.dao.RolDao;
import com.example.proyectodam_1.room.dao.SeccionDao;
import com.example.proyectodam_1.room.dao.UsuarioDao;
import com.example.proyectodam_1.room.entity.Asistencia;
import com.example.proyectodam_1.room.entity.Carrera;
import com.example.proyectodam_1.room.entity.Clase;
import com.example.proyectodam_1.room.entity.Curso;
import com.example.proyectodam_1.room.entity.Rol;
import com.example.proyectodam_1.room.entity.Seccion;
import com.example.proyectodam_1.room.entity.Usuario;

@Database( entities =
        {
            Rol.class,
            Usuario.class,
            Asistencia.class,
            Carrera.class,
            Clase.class,
            Curso.class,
            Seccion.class
        },
        version = 9)
public abstract  class DBTronicTec extends RoomDatabase {

    private  static DBTronicTec INSTANCE;




    public static DBTronicTec getInstance(Context context) {
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context, DBTronicTec.class, "DBTRONICTEC")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return INSTANCE;

    }


    public abstract RolDao getRolDao();

    public abstract AsistenciaDao getAsistenciaDao();

    public abstract CursoDao getCursoDao();

    public abstract SeccionDao getSeccionDao();

    public abstract ClaseDao getClaseDao();

    public abstract UsuarioDao getUsuarioDao();
}
