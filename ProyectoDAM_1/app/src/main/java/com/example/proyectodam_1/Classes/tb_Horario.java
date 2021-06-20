package com.example.proyectodam_1.Classes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.DateTimeException;

@Entity
public class tb_Horario {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "idHorario")
    private int id_Horario;

    @ColumnInfo(name = "descHorario")
    private DateTimeException horario;

    public tb_Horario() {
    }

    @Override
    public String toString() {
        return "tb_Horario{" +
                "id_Horario=" + id_Horario +
                ", horario=" + horario +
                '}';
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public DateTimeException getHorario() {
        return horario;
    }

    public void setHorario(DateTimeException horario) {
        this.horario = horario;
    }
}
