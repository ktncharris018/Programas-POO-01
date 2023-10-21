
package modelo;

public abstract class Servicio {
    
    protected String nombreServicio;
    protected String descripcion;
    protected double total;
    protected Reserva reserva;
    public Servicio(){
        
    }

    public Servicio(String nombreServicio, String descripcion, double total) {
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
        this.total = total;
        
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    
    public Servicio(double total){
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }
    
    public abstract double calcularPrecio();
    public abstract String info();
    
    public void d(){
        reserva.getHuesped();
    }
    

    @Override
    public String toString() {
        return "Nombre Servicio = "+nombreServicio+"\nDescripcion = "+descripcion+this.info();
    }
    
    
}
