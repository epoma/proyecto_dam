package com.example.proyectodam_1.Classes;
import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class R_Rol_Usuario {
    @Embedded public tb_Rol tbRol;
    @Relation(
            parentColumn = "id",
            entityColumn = "codigoRolusuario"
    )
    public List<tb_Usuario> tb_usuarioList;

}
