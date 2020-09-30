package ClasesBases;

public class Habitacion {
    
    private int numHabitacion;
    private String tipoHabitacion;
    private String descripcion;
    private String capacidad;
    private double costo;
    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int numHabitacion, String tipoHabitacion, String descripcion, String capacidad, double costo, boolean estado) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.costo = costo;
        this.estado = estado;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String toString(){
        return this.numHabitacion+" "+this.tipoHabitacion+" "+this.descripcion+" "+this.capacidad+" "+this.costo+" "+this.estado;
    }
}
