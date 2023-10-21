
package modelo;

import java.time.Duration;
import java.time.LocalDate;

public class Reserva {

    private int idReserva ;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Huesped huesped;
    private Habitacion habitacion;
    
    private static int contId = 0;
    
   
    public Reserva(){
        
    }

    public Reserva(LocalDate fechaEntrada,LocalDate fechaSalida, Huesped huesped, Habitacion habitacion) {
        this.idReserva = ++contId;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int duracion(){
        
        Duration duracion = Duration.between(fechaSalida.atStartOfDay(),this.fechaEntrada.atStartOfDay());
        int dias = (int)duracion.toDays();
        return dias;
    }
    
    public double calcularTotal(){
        
         return habitacion.getPrecio()* duracion();
    }
    
    
    @Override
    public String toString() {
        return "Id Reserva = "+idReserva+"\nHuesped = "+huesped.getIdentificacion()+"\nHabitacion = "+habitacion.getIdHabitacion()+"\nFecha Entrada = "+
                fechaEntrada+"\nFecha Salida = "+fechaSalida;
    }
    
    
}
