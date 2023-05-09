
package modelo;

public class Huesped {
    
    private String tipoIdentificacion;
    private int identificacion;
    private String pais;
    private String nombreHuesped;
    private String apellidoHuesped;
    private String emial;
    private Long telefono;
    private String estado;
    public Huesped(){
        
    }

    public Huesped(String tipoIdentificacion,int identificacion,String pais,String nombreHuesped,String apellidoHuesped,String emial,Long telefono) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.pais = pais;
        this.nombreHuesped = nombreHuesped;
        this.apellidoHuesped = apellidoHuesped;
        this.emial = emial;
        this.telefono = telefono;
        this.estado = "NO hospedado";
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tipo Identificacion = "+tipoIdentificacion+"\nIdentificacion = "+identificacion+"\nPais = "+pais+
                "\nNombre Huesped = "+nombreHuesped+"\nApellido Huesped = "+apellidoHuesped+"\nEmail = "+emial+"\nTelefono = "+telefono+
                "\nEstado = "+estado;
    }
    
    
    
}
