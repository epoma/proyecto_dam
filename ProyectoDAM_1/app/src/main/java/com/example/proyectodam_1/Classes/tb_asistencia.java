package com.example.proyectodam_1.Classes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "t_asistencia")
public class tb_asistencia {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name= "id")
    public int idAsistencia;

    @ColumnInfo(name="dniUsuario")
    public String dni_Usuario_Asi;

    @ColumnInfo(name="estado")
    public String estado_Asistencia;

    public tb_asistencia() {
    }

    @Override
    public String toString() {
        return "tb_asistencia{" +
                "idAsistencia=" + idAsistencia +
                ", dni_Usuario_Asi='" + dni_Usuario_Asi + '\'' +
                ", estado_Asistencia='" + estado_Asistencia + '\'' +
                '}';
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public String getDni_Usuario_Asi() {
        return dni_Usuario_Asi;
    }

    public void setDni_Usuario_Asi(String dni_Usuario_Asi) {
        this.dni_Usuario_Asi = dni_Usuario_Asi;
    }

    public String getEstado_Asistencia() {
        return estado_Asistencia;
    }

    public void setEstado_Asistencia(String estado_Asistencia) {
        this.estado_Asistencia = estado_Asistencia;
    }
}
