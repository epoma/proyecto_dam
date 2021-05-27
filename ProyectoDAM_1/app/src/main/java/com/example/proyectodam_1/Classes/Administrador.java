package com.example.proyectodam_1.Classes;


public class Administrador {
    private int codigo;
    private String Administrador, nombre, apellido, contraseña;

    public Administrador() {
    }

    public Administrador(String administrador, String nombre, String apellido, String contraseña) {
        Administrador = administrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "Administrador{" +
                "codigo=" + codigo +
                ", Administrador='" + Administrador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(String administrador) {
        Administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
