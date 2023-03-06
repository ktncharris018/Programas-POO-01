/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Isosceles;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Isosceles t1 = new Isosceles(20,30);
        
        System.out.println("I S O S C E L E S ");
        System.out.println("                   ");
        System.out.println("la base del triangulo es: "+t1.getBase());
        System.out.println("la altuta del triangulo es : "+t1.getAltura());
        System.out.println("                                             ");
        System.out.println("los lados iguales miden : "+ t1.lados());
        System.out.println("el perimetro del triangulo es :"+t1.perimetro());
        System.out.println("el area del trisngulo es : "+ t1.area());
        
        
        
        // TODO code application logic here
    }
    
}
