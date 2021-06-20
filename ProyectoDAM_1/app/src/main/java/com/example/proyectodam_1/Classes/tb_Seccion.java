package com.example.proyectodam_1.Classes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Seccion")
public class tb_Seccion {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "idSeccion")
    private int id_Seccion;

    @ColumnInfo(name= "descripcionSecion")
    public String desc_Seccion;

    @ColumnInfo(name="descrpcionCurso")
    public String descrip_Curso;

    @ColumnInfo(name= "codProfesor")
    public int codigo_Profesor;

    @ColumnInfo(name="codHorario")
    public int codigo_Horario;

    @ColumnInfo(name="estadSeccion")
    public String estado_Seccion;

    public tb_Seccion() {
    }

    @Override
    public String toString() {
        return "tb_Seccion{" +
                "id_Seccion=" + id_Seccion +
                ", desc_Seccion='" + desc_Seccion + '\'' +
                ", descrip_Curso='" + descrip_Curso + '\'' +
                ", codigo_Profesor=" + codigo_Profesor +
                ", codigo_Horario=" + codigo_Horario +
                ", estado_Seccion='" + estado_Seccion + '\'' +
                '}';
    }

    public int getId_Seccion() {
        return id_Seccion;
    }

    public void setId_Seccion(int id_Seccion) {
        this.id_Seccion = id_Seccion;
    }

    public String getDesc_Seccion() {
        return desc_Seccion;
    }

    public void setDesc_Seccion(String desc_Seccion) {
        this.desc_Seccion = desc_Seccion;
    }

    public String getDescrip_Curso() {
        return descrip_Curso;
    }

    public void setDescrip_Curso(String descrip_Curso) {
        this.descrip_Curso = descrip_Curso;
    }

    public int getCodigo_Profesor() {
        return codigo_Profesor;
    }

    public void setCodigo_Profesor(int codigo_Profesor) {
        this.codigo_Profesor = codigo_Profesor;
    }

    public int getCodigo_Horario() {
        return codigo_Horario;
    }

    public void setCodigo_Horario(int codigo_Horario) {
        this.codigo_Horario = codigo_Horario;
    }

    public String getEstado_Seccion() {
        return estado_Seccion;
    }

    public void setEstado_Seccion(String estado_Seccion) {
        this.estado_Seccion = estado_Seccion;
    }
}
