package com.example.proyectodam_1.Classes;

public class tb_clase {
    private int codigoClase, codigoSeccion;
    private String codigoAlumno, estado_c;

    public tb_clase() {
    }

    public tb_clase(int codigoSeccion, String codigoAlumno, String estado_c) {
        this.codigoSeccion = codigoSeccion;
        this.codigoAlumno = codigoAlumno;
        this.estado_c = estado_c;
    }

    @Override
    public String toString() {
        return "tb_clase{" +
                "codigoClase=" + codigoClase +
                ", codigoSeccion=" + codigoSeccion +
                ", codigoAlumno='" + codigoAlumno + '\'' +
                ", estado_c='" + estado_c + '\'' +
                '}';
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }

    public int getCodigoSeccion() {
        return codigoSeccion;
    }

    public void setCodigoSeccion(int codigoSeccion) {
        this.codigoSeccion = codigoSeccion;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getEstado_c() {
        return estado_c;
    }

    public void setEstado_c(String estado_c) {
        this.estado_c = estado_c;
    }
}
