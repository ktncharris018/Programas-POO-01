
package modelo;

import java.time.LocalDate;

public class Reserva {
    
    // Atributos
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private int numPersonas;
    private String tipoHabitacion;

    // Constructores
    public Reserva() {
    }

    public Reserva(LocalDate fechaIngreso, LocalDate fechaSalida, int numPersonas, String tipoHabitacion) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.numPersonas = numPersonas;
        this.tipoHabitacion = tipoHabitacion;
    }

    // Metodos getter y setter
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }
    
    
}
