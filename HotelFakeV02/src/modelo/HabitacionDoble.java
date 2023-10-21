
package modelo;

public class HabitacionDoble extends Habitacion{
    
    private int numMuebles;
    private String tipoCama;
    private String tipoBaño;
    
    public HabitacionDoble(){
        
    }

    public HabitacionDoble(int numMuebles, String tipoCama, String tipoBaño,String tipoH, String idHabitacion,
           String descripcion, int cantCamas, int cantBaños, int maxPersonas, double precio) {
        super(tipoH, idHabitacion, descripcion, cantCamas, cantBaños, maxPersonas, precio);
        this.numMuebles = numMuebles;
        this.tipoCama = tipoCama;
        this.tipoBaño = tipoBaño;
    }

    public String getTipoBaño() {
        return tipoBaño;
    }

    public void setTipoBaño(String tipoBaño) {
        this.tipoBaño = tipoBaño;
    }

    public int getNumMuebles() {
        return numMuebles;
    }

    public void setNumMuebles(int numMuebles) {
        this.numMuebles = numMuebles;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    @Override
    public double calcularPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNumero de Muebles = "+numMuebles+"\nTipo de Cama = "+tipoCama+"\nTipo de Baño = "+tipoBaño;
    }

 
    
    
    
    
    
}
