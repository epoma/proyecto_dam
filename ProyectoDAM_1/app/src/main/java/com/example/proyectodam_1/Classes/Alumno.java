package com.example.proyectodam_1.Classes;

public class Alumno {
    private int codigo, edad, celular, codcarrera ;
    private String Nombre, Apellido, Alumno, Password, direccion, estado;

    public Alumno() {

    }

    //Constructor  sin saber aûn porque


    public Alumno(int edad, int celular, int codcarrera, String nombre, String apellido, String alumno, String password, String direccion, String estado) {
        this.edad = edad;
        this.celular = celular;
        this.codcarrera = codcarrera;
        Nombre = nombre;
        Apellido = apellido;
        Alumno = alumno;
        Password = password;
        this.direccion = direccion;
        this.estado = estado;
    }

    //Metodo para validar los campos
    public boolean isNull() {
        if (Nombre.equals("") && Apellido.equals("") && Alumno.equals("") && Password.equals("") ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo=" + codigo +
                ", edad=" + edad +
                ", celular=" + celular +
                ", codcarrera=" + codcarrera +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Alumno='" + Alumno + '\'' +
                ", Password='" + Password + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estado='" + estado + '\'' +
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

    public int getEdad() {
        return edad;
    }

    public int getCelular() {
        return celular;
    }


    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void setCelular(int celular) {
        this.celular = celular;
    }




    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodcarrera() {
        return codcarrera;
    }

    public void setCodcarrera(int codcarrera) {
        this.codcarrera = codcarrera;
    }




}
