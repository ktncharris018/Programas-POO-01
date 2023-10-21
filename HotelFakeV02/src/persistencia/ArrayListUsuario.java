
package persistencia;

import java.util.ArrayList;
import modelo.*;

public class ArrayListUsuario implements IHotel{
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Huesped> huespedes;
    private ArrayList<Reserva> reservas;
    private ArrayList<Servicio> servicios;
    private ArrayList<Facturacion> facturas;
    
    public ArrayListUsuario() {
        this.usuarios = new ArrayList();
        this.habitaciones = new ArrayList();
        this.huespedes = new ArrayList();
        this.reservas = new ArrayList();
        this.servicios = new ArrayList();
        this.facturas = new ArrayList();
    }

    @Override
    public void registraUsuario(Usuario u, int cedula) {
     
        if(buscarUsuario(u.getCedula()) == null){
            this.usuarios.add(u);
            System.out.println("Usuario guardado\n");
           // System.out.println("U = "+u.getUser()+" C = "+u.getPassword());
        }else{
            System.out.println("Este usuario ya existe");
        }
  
    }

    @Override
    public Usuario buscarUsuario(int cedula) {
        if(this.usuarios == null){
            return null;
        }  
        else{
            for(Usuario u: this.usuarios){
                if(u.getCedula() == cedula){
                return u;
                }
            }
        }

        return null;
    }

    @Override
    public ArrayList<Usuario> informeUsuario() {
        for(Usuario u: this.usuarios ){
            System.out.println(u);
            System.out.println("---------------");
        }
        return this.usuarios;   
    }

    @Override
    public Usuario validarUsuario(String usuario, String contraseña) {
       // int d;
        for(Usuario u: this.usuarios){
            if((u.getUser().equalsIgnoreCase(usuario)) && (u.getPassword().equals(contraseña))){
                //System.out.println("user = "+u.getUser()+" usuario = "+usuario+" uC = "+u.getPassword()+" contraseña = "+contraseña);
                //return true;
                //d = 0;
                //System.out.println(d);
                return u;
            }
        }
        return null;

        
    }

    @Override
    public void registrarHabitacion(Habitacion h) {
        if(buscarHabitacion(h.getIdHabitacion()) == null){
            this.habitaciones.add(h);
            System.out.println("Habitacion registrada");
        }else{
            System.out.println("Esta habitacion ya exite");
        }
    }

    @Override
    public Habitacion buscarHabitacion(String idHabitacion) {
    
        for(Habitacion h: this.habitaciones){
            if(h.getIdHabitacion().equalsIgnoreCase(idHabitacion)){
                return h;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Habitacion> informeHabitacion() {
        
        for(Habitacion h: this.habitaciones){
            System.out.println(h);
            System.out.println("---------------");
        }
        return this.habitaciones;
    }

    @Override
    public void registrarHuesped(Huesped h) {
        if(buscarHuesped(h.getIdentificacion())== null){
            this.huespedes.add(h);
            System.out.println("Huesped registrado");
        }else{
            System.out.println("Este huesped ya se encuentra registrado");
        }
        
    }

    @Override
    public Huesped buscarHuesped(int identificacion) {
        
        for(Huesped h: this.huespedes){
            if(h.getIdentificacion() == identificacion){
                return h;
            }
        }
        return null;
    }
    

    @Override
    public ArrayList<Huesped> informeHuespedes() {
        
        for(Huesped h: this.huespedes){
            System.out.println(h);
            System.out.println("-------------------");
        }
        return this.huespedes;
    }

    @Override
    public void registrarReserva(Reserva r) {
        this.reservas.add(r);
    }

    @Override
    public ArrayList<Reserva> informeReservas() {
        for(Reserva r: this.reservas){
            System.out.println(r);
            System.out.println("------------------");
        }
        return this.reservas;
    }

    @Override
    public void registrarServicio(Servicio s) {
        this.servicios.add(s);
        System.out.println("Servicio registrado \n");
    }

    @Override
    public void registrarFactura(Facturacion f) {
        this.facturas.add(f);
        System.out.println("Factura generada\n");
    }

    @Override
    public Reserva buscarReserva(int cedula) {
        for(Reserva r: this.reservas){
            if(r.getHuesped().getIdentificacion() == cedula){
                return r;
            }
        }
        return null;
    }
           
    
}
