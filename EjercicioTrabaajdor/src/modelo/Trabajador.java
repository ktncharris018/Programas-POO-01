/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Trabajador {
    public int tarifa = 30000;
    public int newTarifa = 1;
    private int hTrabajo;

    public Trabajador(int newTarifa, int hTrabajo) {
        this.newTarifa = newTarifa;
        this.hTrabajo = hTrabajo;
    }

    public void sethTrabajo(int hTrabajo) {
        this.hTrabajo = hTrabajo;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public void setNewTarifa(int newTarifa) {
        this.newTarifa = newTarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public int getNewTarifa() {
        return newTarifa;
    }

    public int gethTrabajo() {
        return hTrabajo;
    }
    
    public int calcularSueldo(){
        int sueldo;
         sueldo = tarifa * hTrabajo * newTarifa  ;
        if(newTarifa!=1){
            tarifa = 1;
            sueldo = tarifa * hTrabajo * newTarifa  ;
            
        }  
            return sueldo;
    }
    
   
   
   
   
    
}
