/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Cuadratica {
    private int a ;
    private int b;
    private int c;
    
    //metodo constructor 

    public Cuadratica(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //metodo setter

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    //metood getter

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    
    public void mostrarEcuacion (){
        System.out.println(a+"X^2 + "+b+"X + "+c+" = 0 ");
        
    }
    
    public void raicesEcuacion (){
      double condicion = b * b - 4 * a * c;

      if (condicion > 0) {
         double x1 = (-b + Math.sqrt(condicion)) / (2 * a);
         double x2 = (-b - Math.sqrt(condicion)) / (2 * a);
         System.out.println("Las raíces son: " + x1 + " y " + x2);
      } else if (condicion == 0) {
         double x = -b / (2 * a);
         System.out.println("La única raíz es: " + x);
      } else {
         System.out.println("La ecuación no tiene solución real");
      }
    }
    
    public void resolverEcuacion(){
        System.out.println("no entiendo el ultimo metodo ");
        
    }
    
}
