
package persistencia;

import java.util.ArrayList;
import modelo.*;

public interface IHotel {
 
    void registraUsuario(Usuario u, int cedula);
    Usuario buscarUsuario (int cedula);
    ArrayList<Usuario> informeUsuario();
    boolean validarUsuario(String usuario, String contraseña);
    
    void registrarHabitacion(Habitacion h);
    Habitacion buscarHabitacion(String idHabitacion);
    ArrayList<Habitacion> informeHabitacion();
    
    
    void registrarHuesped(Huesped h);
    Huesped buscarHuesped(int identificacion);
    ArrayList<Huesped> informeHuespedes();
    
    void registrarReserva(Reserva r);
    ArrayList<Reserva> informeReservas();
}
