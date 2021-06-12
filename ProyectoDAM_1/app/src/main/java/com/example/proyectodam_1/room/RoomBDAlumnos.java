package com.example.proyectodam_1.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.proyectodam_1.room.dao.AlumnoDao;
import com.example.proyectodam_1.room.entidades.Alumno;

@Database(entities = {Alumno.class}, version = 2)
public abstract class RoomBDAlumnos extends RoomDatabase {


    public abstract AlumnoDao alumnoDao();

    private static RoomBDAlumnos CN_DBALUMNOS;

    public static RoomBDAlumnos getDB(Context context) {

        if(CN_DBALUMNOS == null) {

            CN_DBALUMNOS = Room.databaseBuilder(context, RoomBDAlumnos.class, "RoomDBAlumnos")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();

        }

        return CN_DBALUMNOS;

    }
}
