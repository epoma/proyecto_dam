package com.example.proyectodam_1.room.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "usuario")
public class Usuario {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "codigoUsuario")
    public int codigoUsuario;

    @ColumnInfo(name = "dni")
    public String dni;

    @ColumnInfo (name = "nombre")
    public String nombre;

    @ColumnInfo (name = "apellido")
    public  String apellido;

    @ColumnInfo (name = "contrasenia")
    public String contrasenia;

    @ColumnInfo (name = "codigoRol")
    public int codigoRol;

    @ColumnInfo (name = "estado")
    public String estado;


    @Ignore
    public Rol rol;
}
