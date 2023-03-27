
package modelo;

import java.time.LocalDate;

public class Factura {
    
    // Atributos
    private LocalDate fechaFactura;
    private double otrosCargos;
    private String descripcion;

    // Constructores
    public Factura() {
    }

    public Factura(LocalDate fechaFactura, double otrosCargos, String descripcion) {
        this.fechaFactura = fechaFactura;
        this.otrosCargos = otrosCargos;
        this.descripcion = descripcion;
    }
    
    // Metodos getter y setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getOtrosCargos() {
        return otrosCargos;
    }

    public void setOtrosCargos(double otrosCargos) {
        this.otrosCargos = otrosCargos;
    }
    
    
    
}
