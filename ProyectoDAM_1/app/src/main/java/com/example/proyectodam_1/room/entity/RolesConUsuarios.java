package com.example.proyectodam_1.room.entity;


import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.proyectodam_1.Classes.tb_Rol;
import com.example.proyectodam_1.Classes.tb_Usuario;

import java.util.List;

public class RolesConUsuarios {

    @Embedded
    public Rol rol;
    @Relation(
            parentColumn = "codigoRol",
            entityColumn = "codigoRol"
    )
    public List<Usuario> usuarios;

}
