
package modelo;

import java.time.LocalDate;

public class Reserva {

    private int idReserva ;
    private String fechaEntrada;
    private String fechaSalida;
    private Huesped huesped;
    private Habitacion habitacion;
    
    public Reserva(){
        
    }

    public Reserva(String fechaEntrada,String fechaSalida) {
        this.idReserva = +1;
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
    
    

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public String toString() {
        return "Id Reserva = "+idReserva+"\nHuesped = "+huesped+"\nHabitacion = "+habitacion+"\nFecha Entrada = "+
                fechaEntrada+"\nFecha Salida = "+fechaSalida;
    }
    
    
}
