 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Constructor;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Constructor c1 = new Constructor(400,20);
        Constructor c2 = new Constructor(400,40);
        Constructor c3 = new Constructor(400,80);
        
        System.out.println("el sueldo del maestro de obra 1 es :" +c1.calcularSueldo());
        System.out.println("el sueldo del maestro de obra 2 es :" +c2.calcularSueldo());
        System.out.println("el sueldo del maestro de obra 3 es :" +c3.calcularSueldo());
        
        
        // TODO code application logic here
    }
    
}
