
package modelo;

public class Administrador {
    
    // Atributos
    private String nombreAdmin;
    private String apellidoAdmin;

    // Constructores
    public Administrador() {
    }

    public Administrador(String nombreAdmin, String apellidoAdmin) {
        this.nombreAdmin = nombreAdmin;
        this.apellidoAdmin = apellidoAdmin;
    }
    
    // Getter y setter

    public String getNombreAdmin() {
        return nombreAdmin;
    }

    public void setNombreAdmin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    public String getApellidoAdmin() {
        return apellidoAdmin;
    }

    public void setApellidoAdmin(String apellidoAdmin) {
        this.apellidoAdmin = apellidoAdmin;
    }
    
    
}
