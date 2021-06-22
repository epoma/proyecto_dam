package com.example.proyectodam_1.Classes;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(primaryKeys= {"cod_usuario", "codigoCarrera"} )
public class R_MaM_Usu_Carr {
    public int cod_usuario;
    public int codigoCarrera;

}
