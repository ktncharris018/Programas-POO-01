
package modelo;

public class Estacionamiento extends Servicio{
    
    
    private final double valorHora = 1000;
    private int cantHoras;
    
    public Estacionamiento(){
        
    }

    public Estacionamiento(int cantHoras, String nombreServicio, String descripcion, double total) {
        super(nombreServicio, descripcion, total);
        this.cantHoras = cantHoras;
    }
    
    public Estacionamiento(double total){
        super(total);
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularPrecio() {
        return this.cantHoras * this.valorHora;
    }

    @Override
    public String info() {
        return "\nValor por Hora = "+this.valorHora+"\nCantidad de horas = "+this.cantHoras+"\nTotal a pagar = "+this.calcularPrecio();
    }
    
    
}
