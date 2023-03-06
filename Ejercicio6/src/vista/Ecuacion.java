/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Cuadratica;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Ecuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadratica e1 = new Cuadratica(2,7,-15);
        e1.mostrarEcuacion();
        e1.raicesEcuacion();
        
        
        
    }
    
}
