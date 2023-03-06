/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Trabajador;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador(20000,8);
        
        Trabajador t2 = new Trabajador(20000,10);
        
        System.out.println("el sueldo del trabajor 1 es de :"+ t1.calcularSueldo());
        System.out.println("el sueldo del trabajor 2 es de :"+ t2.calcularSueldo());
        
        // TODO code application logic here
    }
    
}
