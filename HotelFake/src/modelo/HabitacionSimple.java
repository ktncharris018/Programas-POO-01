
package modelo;

public class HabitacionSimple extends Habitacion{
    
    public HabitacionSimple(){
        
    }

    public HabitacionSimple(String tipoH, String idHabitacion, String descripcion, int cantCamas, int cantBaños, int maxPersonas, double precio) {
        super(tipoH, idHabitacion, descripcion, cantCamas, cantBaños, maxPersonas, precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
    
    
}
