/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Cuenta {
    private int nuCuenta;
    private String nombreCliente;
    private double saldo = 0;
    
    // metodo constructor

    public Cuenta(int nuCuenta, String nombreCliente, double saldo) {
        this.nuCuenta = nuCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    
    // metodo setter

    public void setNuCuenta(int nuCuenta) {
        this.nuCuenta = nuCuenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // metodo getter

    public int getNuCuenta() {
        return nuCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double consignar(double monto){
        ///double monto = monto;
        //saldo = 0;
        saldo = saldo + monto;
        System.out.println("C O N S I G N A C I O N ");
        System.out.println("                         ");
        System.out.println("numero de cuenta:"+nuCuenta);
        System.out.println("cliente :"+nombreCliente);
        System.out.println("valor de consigacion : "+monto);
        System.out.println("saldo de cuenta;"+saldo);
        System.out.println("consignacion exitosa!");
        System.out.println("                        ");
        
        //double newSaldo = saldo;
        
        return saldo;
        
    }
    
    public double retirar(double monto1){
    
        //double saldos = consignar();
        //System.out.println("saldo:"+saldo);
        
        
        if(monto1<saldo){
            //System.out.println("error: su retiro supera su saldo");
            saldo = saldo - monto1;
            System.out.println("R E T I R O");
            System.out.println("                                 ");
            System.out.println("valor del retiro : "+monto1);
            System.out.println("retiro exitoso!");
            System.out.println("su saldo es actual es de :"+saldo);
        
        }else{
            System.out.println("R E T I R O");
            System.out.println("                                 ");
            System.out.println("valor del retiro : "+monto1);
            System.out.println("error: su retiro supera su saldo");
            }
        return saldo;
        
    }
    
}
