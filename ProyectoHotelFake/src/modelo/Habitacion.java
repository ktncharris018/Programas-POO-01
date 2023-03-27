
package modelo;

import java.util.ArrayList;

public class Habitacion {
    
    // Atributos
    private int numeroHabitacion;
    private String tipoHabitacion;
    private String tipoCama;
    private String estado;
    private double precio;
    private ArrayList<Huesped>huespedes;
    
    // Constructores
    public Habitacion(){
        
    }

    public Habitacion(int numeroHabitacion, String tipoHabitacion, String tipoCama, String estado, double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoCama = tipoCama;
        this.estado = estado;
        this.precio = precio;
    }

    // Metodos getter y setter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
