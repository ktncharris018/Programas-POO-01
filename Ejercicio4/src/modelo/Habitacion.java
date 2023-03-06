/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Habitacion {
    final int DOS = 2;
    private double largo;
    private double alto;
    private double ancho;
    
    //metodo constructor

    public Habitacion(double largo, double alto, double ancho) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
    }
    
    //metodo setter

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    //metodo getter

    public double getLargo() {
        return largo;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
    
    public double tapizarPared(){
        //final static DOS = 2;
        return  alto*DOS*(ancho+largo);
       // return papelTapizar;
        
    }
    public double chaparPiso(){
        return largo * ancho ;
        
    }
    
    
}
