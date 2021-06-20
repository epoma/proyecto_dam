package com.example.proyectodam_1.Classes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Fts4;
import androidx.room.PrimaryKey;

@Fts4
@Entity (tableName = "Usuario")
public class tb_Usuario {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "rowid")
    public int cod_usuario;

    @ColumnInfo(name = "dni_usuario")
    public int dniUsuario;

    @ColumnInfo (name = "nombre_usuario")
    public String nombreUsuario;

    @ColumnInfo (name = "apellido_usuario")
    public  String apellidoUsuario;

    @ColumnInfo (name = "password")
    public String contraseña;

    @ColumnInfo (name = "codigo_rol")
    public int codigoRolusuario;

    @ColumnInfo (name = "estado_usuario")
    public String estadoUsuario;

    public tb_Usuario() {
    }

    @Override
    public String toString() {
        return "tb_Usuario{" +
                "cod_usuario=" + cod_usuario +
                ", dniUsuario=" + dniUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", apellidoUsuario='" + apellidoUsuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", codigoRolusuario=" + codigoRolusuario +
                ", estadoUsuario='" + estadoUsuario + '\'' +
                '}';
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public int getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(int dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCodigoRolusuario() {
        return codigoRolusuario;
    }

    public void setCodigoRolusuario(int codigoRolusuario) {
        this.codigoRolusuario = codigoRolusuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
}
