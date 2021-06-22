package com.example.proyectodam_1.Classes;

import androidx.room.Embedded;
import androidx.room.Relation;
import java.util.List;

public class R_Usuario_Asistencia {
    @Embedded public tb_Usuario usuario;
    @Relation(
            parentColumn = "cod_usuario",
            entityColumn = "cod_Usu_Asis"
    )
    public List<tb_asistencia> ListaAsistencia;
}

