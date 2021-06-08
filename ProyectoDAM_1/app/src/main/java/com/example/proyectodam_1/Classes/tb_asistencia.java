package com.example.proyectodam_1.Classes;

public class tb_asistencia {
    private int codigoAsistencia, codigoClase;
    private String codigoAlumno, estado_asis;

    public tb_asistencia() {
    }

    public tb_asistencia(int codigoClase, String codigoAlumno, String estado_asis) {
        this.codigoClase = codigoClase;
        this.codigoAlumno = codigoAlumno;
        this.estado_asis = estado_asis;
    }


    @Override
    public String toString() {
        return "tb_asistencia{" +
                "codigoAsistencia=" + codigoAsistencia +
                ", codigoClase=" + codigoClase +
                ", codigoAlumno='" + codigoAlumno + '\'' +
                ", estado_asis='" + estado_asis + '\'' +
                '}';
    }

    public int getCodigoAsistencia() {
        return codigoAsistencia;
    }

    public void setCodigoAsistencia(int codigoAsistencia) {
        this.codigoAsistencia = codigoAsistencia;
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getEstado_asis() {
        return estado_asis;
    }

    public void setEstado_asis(String estado_asis) {
        this.estado_asis = estado_asis;
    }
}
