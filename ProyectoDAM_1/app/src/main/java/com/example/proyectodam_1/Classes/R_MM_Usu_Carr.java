package com.example.proyectodam_1.Classes;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;
import java.util.List;

public class R_MM_Usu_Carr {
    @Embedded public tb_Usuario tbUsuario;
    @Relation(

            parentColumn = "cod_usuario",
            entityColumn = "codigoCarrera",
            associateBy = @Junction(R_MaM_Usu_Carr.class)
    )
    public List<tb_Carrera> carreraList;
}
