/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Constructor {
    final double TARIFA = 200;
    private double newTarifa = 1 ;
    private double msCuadrados ; 

    public Constructor(double newTarifa, double msCuadrados) {
        this.msCuadrados = msCuadrados;
        this.newTarifa = newTarifa;
    }

    public void setNewTarifa(double newTarifa) {
        this.newTarifa = newTarifa;
    }

    public void setMsCuadrados(double msCuadrados) {
        this.msCuadrados = msCuadrados;
    }

    public double getTARIFA() {
        return TARIFA;
    }

    public double getNewTarifa() {
        return newTarifa;
    }

    public double getMsCuadrados() {
        return msCuadrados;
    }
    
    public double calcularSueldo(){
        
        double sueldo = TARIFA * msCuadrados * newTarifa  ;
        if(newTarifa!=1){
            sueldo =  msCuadrados * newTarifa  ;
            
        }  
            return sueldo;
    }
    
     

    
    

    
    
    
    
    
    
    
}
