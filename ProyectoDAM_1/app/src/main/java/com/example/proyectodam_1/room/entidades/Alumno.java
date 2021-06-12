package com.example.proyectodam_1.room.entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "alumno")
public class Alumno {

    @PrimaryKey(autoGenerate = true)
    public int codigo;
    @ColumnInfo(name = "edad")
    public  int edad;
    @ColumnInfo(name = "celular")
    public  String celular;
    @ColumnInfo(name = "cod_carrera")
    public  int codcarrera;
    @ColumnInfo(name = "nombre")
    public String nombre;
    @ColumnInfo(name = "apellido")
    public String apellido;
    @ColumnInfo(name = "alumno")
    public  String alumno;
    @ColumnInfo(name = "password")
    public String password;
    @ColumnInfo(name = "direccion")
    public  String direccion;
    @ColumnInfo(name = "estado")
    public  String estado;

}
