/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Coche {
    private String color ;
    private String marca ;
    private String modelo ;
    private String matricula ;
    private int numeroCaballos;
    private int numeroPuertas;
    
    // metodo constructor
    public Coche(String color, String marca, String modelo, String matricula, int numeroCaballos, int numeroPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.numeroCaballos = numeroCaballos;
        this.numeroPuertas = numeroPuertas;
    }
    
    // metodo setter

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNumeroCaballos(int numeroCaballos) {
        this.numeroCaballos = numeroCaballos;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    // metodo getter

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNumeroCaballos() {
        return numeroCaballos;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    // metodo toString

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", numeroCaballos=" + numeroCaballos + ", numeroPuertas=" + numeroPuertas + '}';
    }
    
    
    
    
    
    
}
