package ClasesBases;

public class Comprobante {
    
    private String codComprobante;
    private String nombreHotel;
    private String dniCliente;
    private String codRegistro;
    private int nroHabitacion;

    public Comprobante() {}

    public Comprobante(String codComprobante, String nombreHotel, String dniCliente, String codRegistro, int nroHabitacion) {
        this.codComprobante = codComprobante;
        this.nombreHotel = nombreHotel;
        this.dniCliente = dniCliente;
        this.codRegistro = codRegistro;
        this.nroHabitacion = nroHabitacion;
    }

    public String getCodComprobante() {
        return codComprobante;
    }

    public void setCodComprobante(String codComprobante) {
        this.codComprobante = codComprobante;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(String codRegistro) {
        this.codRegistro = codRegistro;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }
    
    public String toString(){
        return this.codComprobante+" "+this.nombreHotel+" "+this.dniCliente+" "+this.codRegistro+" "+this.nroHabitacion;
    }
}
