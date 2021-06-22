package com.example.proyectodam_1.Classes;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;
import java.util.List;


public class R_MM_Carr_Usu {
    @Embedded public tb_Carrera tbCarrera;
    @Relation(
            parentColumn = "codigoCarrera",
            entityColumn = "cod_usuario",
            associateBy = @Junction(R_MaM_Usu_Carr.class)

    )
    public List<tb_Usuario> ListaUsuario;
}
