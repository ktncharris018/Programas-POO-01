
package logica;

import java.util.ArrayList;
import modelo.*;
import persistencia.ArrayListUsuario;
import persistencia.IHotel;

public class Coleccion {
    
    IHotel datos;

    public Coleccion() {
        this.datos = new ArrayListUsuario();
       
    }
    
    public void registrarUsuario(Usuario u, int cedula){
        this.datos.registraUsuario(u,cedula);
    }
    
    public Usuario buscar(int cedula){
        return this.datos.buscarUsuario(cedula);
    }
    
    public ArrayList<Usuario> informe(){ 
        return this.datos.informeUsuario();
    }
    
    public boolean validar(String usuario, String contraseña){
        return this.datos.validarUsuario(usuario, contraseña);
    }
    
    //////////////////////////////////////////////////////////////7
    
    public void registrarHabitacion(Habitacion h){
        this.datos.registrarHabitacion(h);
    }
    
    public Habitacion buscarH(String idHabitacion){
        return this.datos.buscarHabitacion(idHabitacion);
    }
    
    public ArrayList<Habitacion> informeHabitacion(){
        return this.datos.informeHabitacion();
    }
    
    //////////////////////////////////////////////////////////////
    
    public void registrarHuesped(Huesped h){
        this.datos.registrarHuesped(h);
    }
    
    public Huesped buscarHuesped(int identificacion){
        return this.datos.buscarHuesped(identificacion);
    }
    
    public ArrayList<Huesped> informeHuespedes(){
        return this.datos.informeHuespedes();
    }
    
    ////////////////////////////////////////////////////////////////
    
    public void registrarReserva(Reserva r){
        this.datos.registrarReserva(r);
    }
    
    public ArrayList<Reserva> informeReserva(){
        return this.datos.informeReservas();
    }
    
}
