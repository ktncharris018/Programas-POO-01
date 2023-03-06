/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Coche;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class PuebaCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche auto1 = new Coche("rojo","Chevrolet","2017","4gt-007",65,7);
        Coche auto2 = new Coche("blanco","mercedes benz","2022","wvp-567",362,6);
        Coche auto3 = new Coche("azul","nissan","2020","utw-954n",168,4);
       
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
    }
    
}
