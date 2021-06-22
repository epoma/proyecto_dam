package com.example.proyectodam_1.Classes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "carrera")
public class tb_Carrera {

    @PrimaryKey
    @NonNull
    @ColumnInfo (name = "rowidC")
    private int codigoCarrera;

    @ColumnInfo (name = "descripcion")
    private String des_carrera;

    @ColumnInfo(name = "estado")
    private String estado_carrera;



    public tb_Carrera() {
    }

    @Override
    public String toString() {
        return "tb_Carrera{" +
                "codigoCarrera=" + codigoCarrera +
                ", des_carrera='" + des_carrera + '\'' +
                ", estado_carrera='" + estado_carrera + '\'' +
                '}';
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getDes_carrera() {
        return des_carrera;
    }

    public void setDes_carrera(String des_carrera) {
        this.des_carrera = des_carrera;
    }

    public String getEstado_carrera() {
        return estado_carrera;
    }

    public void setEstado_carrera(String estado_carrera) {
        this.estado_carrera = estado_carrera;
    }
}
