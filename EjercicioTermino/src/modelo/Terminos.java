/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Terminos {
    final public int NUMERADOR= 1;
    public int numeroTerminos;

   
    
    public int mostrarTerminos(int numeroTerminos){
        //int numeroTermino;
        int iterador = 1;
        while(iterador< numeroTerminos){
            System.out.println(NUMERADOR);
            System.out.println("-");
            System.out.println(iterador);
            System.out.println("        ");
            iterador++;
        }
        return numeroTerminos;
    }
    
}
