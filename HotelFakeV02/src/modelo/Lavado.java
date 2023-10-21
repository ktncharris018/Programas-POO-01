
package modelo;


public class Lavado extends Servicio{
    
    
    private double valorPrenda;
    private int cantPrenda;
    private String tipo;
    
    public Lavado(){
        
    }

    public Lavado(double valorPrenda, int cantPrenda,String nombreServicio, String descripcion, double total) {
        super(nombreServicio, descripcion, total);
        this.cantPrenda = cantPrenda;
        this.valorPrenda = valorPrenda;
    }
    public Lavado(double total){
        super(total);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorPrenda() {
        return valorPrenda;
    }

    public void setValorPrenda(double valorPrenda) {
        this.valorPrenda = valorPrenda;
    }

    public int getCantPrenda() {
        return cantPrenda;
    }

    public void setCantPrenda(int cantPrenda) {
        this.cantPrenda = cantPrenda;
    }

    @Override
    public double calcularPrecio() {
        return this.valorPrenda * this.cantPrenda;
    }

    @Override
    public String info() {
        return "\nValor Prenda = "+this.valorPrenda+"\ncantidad de prendas = "+this.cantPrenda + "\nTotal a pagar = "+this.calcularPrecio();
    }
    
    
}
