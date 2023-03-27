
package modelo;

public class Huesped {
    
    // Atributos
    private int identificacion;
    private String nombreHuesped;
    private String apellidoHuesped;
    private String email;
    private Long telefono;
    private String direccion;

    // Constructores
    public Huesped() {
    }

    public Huesped(int identificacion, String nombreHuesped, String apellidoHuesped, String email, Long telefono, String direccion) {
        this.identificacion = identificacion;
        this.nombreHuesped = nombreHuesped;
        this.apellidoHuesped = apellidoHuesped;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    // Metodo getter y setter
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public String getApellidoHuesped() {
        return apellidoHuesped;
    }

    public void setApellidoHuesped(String apellidoHuesped) {
        this.apellidoHuesped = apellidoHuesped;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    
}
