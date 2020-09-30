package ClasesBases;

public class Registro {
    
    private String codRegistro;
    private int nroDias;
    private double total;
    private String nroHabitacion; 
    private String dniCliente;

    public Registro() {}

    public Registro(String codRegistro, int nroDias, double total, String nroHabitacion, String dniCliente) {
        this.codRegistro = codRegistro;
        this.nroDias = nroDias;
        this.total = total;
        this.nroHabitacion = nroHabitacion;
        this.dniCliente = dniCliente;
    }

    public String getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(String codRegistro) {
        this.codRegistro = codRegistro;
    }

    public int getNroDias() {
        return nroDias;
    }

    public void setNroDias(int nroDias) {
        this.nroDias = nroDias;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(String nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }
    
    public String toString(){
        return this.codRegistro+" "+this.nroDias+" "+this.nroHabitacion+" "+this.total+" "+this.dniCliente;
    }
}
