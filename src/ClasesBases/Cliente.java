package ClasesBases;

public class Cliente {
    
    private String dni;
    private String nombres;
    private String apellidos;
    private String celular;
    private String correo;

    public Cliente() {}

    public Cliente(String dni, String nombres, String apellidos, String celular, String correo) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {    
        this.correo = correo;
    }
    
    public String toString(){
        return this.dni+" "+this.nombres+" "+this.apellidos+" "+this.celular+" "+this.correo;
    }
}
