package com.example.proyectodam_1.Classes;

public class tb_Carrera {
    private int Codigo;
    private String Descripcion;
    private String Estado;

    public tb_Carrera() {
    }

    public tb_Carrera(String descripcion, String estado) {
        Descripcion = descripcion;
        Estado = estado;
    }

    @Override
    public String toString() {
        return "tb_Carrera{" +
                "Codigo=" + Codigo +
                ", Descripcion='" + Descripcion + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
