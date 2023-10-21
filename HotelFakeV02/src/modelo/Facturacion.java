
package modelo;

import java.time.LocalDate;

public class Facturacion {
    
    private int idFactutacion;
    private LocalDate fecha;
    private Reserva reserva;
    
    private static int contId = 0;
    
    public Facturacion(){
        
    }
    
    public Facturacion(LocalDate fecha, Reserva reserva){
        this.idFactutacion = ++contId;
        this.fecha = fecha;
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getIdFactutacion() {
        return idFactutacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public double totalPagar(){
        return reserva.calcularTotal() + reserva.getHuesped().getCuenta();
    }

    @Override
    public String toString() {
        return "id Factutacion = "+idFactutacion+"\nFecha = "+fecha+"\nReserva = "+reserva.getIdReserva()+"\nNumero dias = "+reserva.duracion()+
                "\nTotal por dias = "+reserva.calcularTotal()+"\nTotal por servicios = "+reserva.getHuesped().getCuenta()+"\nTotal a pagar = "+totalPagar() ;
    }
    
    
}
