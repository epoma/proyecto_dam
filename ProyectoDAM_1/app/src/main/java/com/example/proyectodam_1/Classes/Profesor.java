package com.example.proyectodam_1.Classes;

public class Profesor {

    private int Codigo;
    private String Profesor;
    private String Nombre;
    private String Apellido;
    private String Contraseña;

    public Profesor() {
    }

    public Profesor(String profesor, String nombre, String apellido, String contraseña) {
        Profesor = profesor;
        Nombre = nombre;
        Apellido = apellido;
        Contraseña = contraseña;
    }

    public boolean EstaVacio(){
        if(Profesor.equals("") && Nombre.equals("") && Apellido.equals("") & Contraseña.equals("")){
            return true;
            }else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Profesor{" +
                "Codigo=" + Codigo +
                ", Profesor='" + Profesor + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                '}';
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String profesor) {
        Profesor = profesor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
