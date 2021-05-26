package com.example.proyectodam_1;

public class Alumno {
    int codigo;
    String Nombre, Apellido, Alumno, Password;

    public Alumno() {

    }

    //Constructor  sin saber aûn porque
    public Alumno(String nombre, String apellido, String alumno, String password) {
        Nombre = nombre;
        Apellido = apellido;
        Alumno = alumno;
        Password = password;
    }

    //Metodo para validar los campos
    public boolean isNull() {
        if (Nombre.equals("") && Apellido.equals("") && Alumno.equals("") && Password.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo=" + codigo +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Alumno='" + Alumno + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String alumno) {
        Alumno = alumno;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
