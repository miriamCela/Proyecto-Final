package ClasesBases;

public class Hotel {
    
    private String nomHotel;
    private String direccion;
    private String contacto;

    public Hotel() {}

    public Hotel(String nomHotel, String direccion, String contacto) {
        this.nomHotel = nomHotel;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    public String toString(){
        return this.nomHotel+" "+this.direccion+" "+this.contacto;
    }
}
