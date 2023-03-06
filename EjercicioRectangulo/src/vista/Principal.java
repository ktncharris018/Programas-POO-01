/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Rectangulo;

/**
 *
 * @author Jairo F
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo r = new Rectangulo();
        System.out.println("Area:"+ r.calcularArea());
       imprimirRectangulo(r);
        
        System.out.println("-------------------------------");
        
        Rectangulo a = new Rectangulo();
        a.setAltura(50);
        a.setBase(30);
        imprimirRectangulo(a);
    }
    
    public static void imprimirRectangulo(Rectangulo r){
        System.out.println("Area:"+ r.calcularArea());
        System.out.println("Perimetro:"+ r.calcularPerimetro());
    }
    
}
