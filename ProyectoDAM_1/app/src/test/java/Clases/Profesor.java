package Clases;

public class Profesor {

    private String codigo;
    private String nombre;
    private String apellido;
    private String contraseña;

    public Profesor() {
    }

    public Profesor(String codigo, String nombre, String apellido, String contraseña) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }


    public boolean ValidarCampos(){
            if(codigo.equals("") && nombre.equals("") && apellido.equals("") && contraseña.equals("")){
                return true;
            }else {
                return false;
            }
    }


    @Override
    public String toString() {
        return "Profesor{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
