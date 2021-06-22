package com.example.proyectodam_1.Classes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Rol")
public class tb_Rol {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "idRol")
    private int id;

    @ColumnInfo(name= "descripcion")
    private String descrip_Rol;





    public tb_Rol() {
    }

    @Override
    public String toString() {
        return "tb_Rol{" +
                "id=" + id +
                ", descrip_Rol='" + descrip_Rol + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrip_Rol() {
        return descrip_Rol;
    }

    public void setDescrip_Rol(String descrip_Rol) {
        this.descrip_Rol = descrip_Rol;
    }
}
