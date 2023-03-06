/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Cuenta;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Cuenta cliente1 = new Cuenta(12775677, "persona 1",0);
        
        
        cliente1.consignar(30000);
        cliente1.retirar(40000);
        
        
    }
    
}
