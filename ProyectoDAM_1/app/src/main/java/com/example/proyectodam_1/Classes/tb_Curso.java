package com.example.proyectodam_1.Classes;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "curso")
public class tb_Curso {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name= "idCurso")
    public int id_Curso;

    @ColumnInfo(name= "descrip_curso")
    public String descripcionCurso;

    @ColumnInfo(name="estadoCurso")
    public String estado_curso;

    public tb_Curso() {
    }

    @Override
    public String toString() {
        return "tb_Curso{" +
                "id_Curso=" + id_Curso +
                ", descripcionCurso='" + descripcionCurso + '\'' +
                ", estado_curso='" + estado_curso + '\'' +
                '}';
    }

    public int getId_Curso() {
        return id_Curso;
    }

    public void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

    public String getEstado_curso() {
        return estado_curso;
    }

    public void setEstado_curso(String estado_curso) {
        this.estado_curso = estado_curso;
    }
}
