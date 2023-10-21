
package modelo;

public class Transporte extends Servicio{
    
    private double distancia;
    private final double tarifaKm = 2000;
    private boolean chofer;
    
    public Transporte(){
        
    }

    public Transporte(double distancia,boolean chofer, String nombreServicio, String descripcion, double total) {
        super(nombreServicio, descripcion, total);
        this.distancia = distancia;
        this.chofer = chofer;
    }
    
    public Transporte(double total){
        super(total);
    }

    public boolean isChofer() {
        return chofer;
    }

    public void setChofer(boolean chofer) {
        this.chofer = chofer;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTarifaKm() {
        return tarifaKm;
    }

    @Override
    public double calcularPrecio() {
        double precio = this.distancia * this.tarifaKm;
        double tarifaChofer;
        if(this.isChofer()){
            tarifaChofer = precio*0.1;
            return precio + tarifaChofer;
        }else{
            return precio;
        }
    }

    @Override
    public String info() {
        return "\nDistancia = "+this.distancia+"\nTarifa Km = "+this.tarifaKm+"\nChofer = "+this.chofer+"\nTotal a pagar = "+this.calcularPrecio();
    }
    
    
    
}
