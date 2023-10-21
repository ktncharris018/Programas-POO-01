
package modelo;

public abstract class Habitacion {
    protected String tipoH;
    protected String idHabitacion;
    protected String descripcion;
    protected String estado;
    protected int cantCamas;
    protected int cantBaños;
    protected int maxPersonas;
    protected double precio;
    
    public Habitacion(){
        
    }

    public Habitacion(String tipoH, String idHabitacion, String descripcion, int cantCamas, int cantBaños, int maxPersonas, double precio) {
        this.tipoH = tipoH;
        this.idHabitacion = idHabitacion;
        this.descripcion = descripcion;
        this.estado = "Disponible";
        this.cantCamas = cantCamas;
        this.cantBaños = cantBaños;
        this.maxPersonas = maxPersonas;
        this.precio = precio;
    }

    public String getTipoH() {
        return tipoH;
    }

    public void setTipoH(String tipoH) {
        this.tipoH = tipoH;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Tipo Habitacion = "+tipoH+"\nIdHabitacion = "+idHabitacion+"\nDescripcion = "+descripcion+"\nEstado = "+estado+
                "\nCantidad de Camas = "+cantCamas+"\nCantidad de Baños = "+cantBaños+"\nMaximo de Personas = "+maxPersonas+"\nPrecio = "+precio;
    }
    
    
}
