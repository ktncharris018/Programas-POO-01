/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Isosceles {
    private double base ;
    private double altura;
    
    //metodo constructor

    public Isosceles(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //metodo setter

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //metood getetr

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public double lados(){
        double ladoIgual;
        ladoIgual = Math.sqrt((altura * altura) + ((base/2) * (base/2)));
        
        return ladoIgual;
        
    }
    
    public double perimetro(){
        double lado = lados();
        double perimetro = lado + lado + base ;
        
        return perimetro;
        
    }
    
    public double area(){
        double area;
        area = (base * altura)/ 2;
        
        return area ;
    }
    
    
}
