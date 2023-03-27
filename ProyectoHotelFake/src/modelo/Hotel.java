
package modelo;

import java.util.ArrayList;

public class Hotel {
    // Atributos
    private String nombreHotel;
    private String direccionHotel;
    private ArrayList<Habitacion>habitaciones;
    
    // Construcotres
    public Hotel(){
        
    }

    public Hotel(String nombreHotel, String direccionHotel) {
        this.nombreHotel = nombreHotel;
        this.direccionHotel = direccionHotel;
        this.habitaciones = new ArrayList();
    }
    
    // metodos getter y setter

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }
    
    public void crearHabitaciones(int numeroHabitacion, String tipoHabitacion, String tipoCama, String estado, double precio){
        
        Habitacion habitacion = new Habitacion(numeroHabitacion, tipoHabitacion, tipoCama, estado, precio);
        this.habitaciones.add(habitacion);
        
    }
}
