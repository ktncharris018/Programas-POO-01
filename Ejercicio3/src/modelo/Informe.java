/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Informe {
    private double[] reporte = reporte = new double[12] ;
    //reporte = new double[12];
    
    
    //double[] reporte = {50000, 60000, 40000, 55000, 20000, 70000, 30000, 45000, 90000, 80000, 120000, 100000};
    
    //metodo constructor
    public Informe(double[] reporte) {
        this.reporte = reporte;
    }
    
    //metodo setter
    public void setReporte(double[] reporte) {
        this.reporte = reporte;
    }
    
    //metodo getter

    public double[] getReporte() {
        return reporte;
    }
    
    public double promedioVentas(){
        double suma = 0;
        //double promedio;
        
        for(int i=0 ; i<reporte.length; i++){
            suma += reporte[i];
            
        }
        
        return suma / reporte.length;
        //return promedio;
        
    }
    
    /*public void mesMayor(){
       int  mesNumber =0;
       //String mes;
       for(int i=0; i<reporte.length;i++){
           if(reporte[i]>reporte[mesNumber]){
               mesNumber = i;
           }
              
       }
       switch(mesNumber){
           case 1:
               System.out.println("el mes con mayor ventas es Enero ");
               break;
           case 2:
               System.out.println("el mes con mayor ventas es Febrero ");
               break;
           case 3:
               System.out.println("el mes con mayor ventas es Marzo ");
               break;
           case 4:
               System.out.println("el mes con mayor ventas es Abril ");
               break;
           case 5:
               System.out.println("el mes con mayor ventas es Mayo ");
               break;
           case 6:
               System.out.println("el mes con mayor ventas es Junio ");
               break;
           case 7:
               System.out.println("el mes con mayor ventas es Julio ");
               break;
           case 8:
               System.out.println("el mes con mayor ventas es Agosto ");
               break;
           case 9:
               System.out.println("el mes con mayor ventas es Septiembre ");
               break;
           case 10:
               System.out.println("el mes con mayor ventas es Octubre ");
               break;
           case 11:
               System.out.println("el mes con mayor ventas es Noviembre ");
               break;
           case 12:
               System.out.println("el mes con mayor ventas es Diciembre ");
               break;
              
       }
           
        
                
        
        //return reporte;
    }
    
    public void mesMenor(double[] reporte){
        int  mesNumber =0;
       //String mes;
       for(int i=0; i<reporte.length;i++){
           if(reporte[i]<reporte[mesNumber]){
               mesNumber = i;
           }
              
       }
       switch(mesNumber){
           case 1:
               System.out.println("el mes con menor ventas es Enero ");
               break;
           case 2:
               System.out.println("el mes con menor ventas es Febrero ");
               break;
           case 3:
               System.out.println("el mes con menor ventas es Marzo ");
               break;
           case 4:
               System.out.println("el mes con menor ventas es Abril ");
               break;
           case 5:
               System.out.println("el mes con menor ventas es Mayo ");
               break;
           case 6:
               System.out.println("el mes con menor ventas es Junio ");
               break;
           case 7:
               System.out.println("el mes con menor ventas es Julio ");
               break;
           case 8:
               System.out.println("el mes con menor ventas es Agosto ");
               break;
           case 9:
               System.out.println("el mes con menor ventas es Septiembre ");
               break;
           case 10:
               System.out.println("el mes con menor ventas es Octubre ");
               break;
           case 11:
               System.out.println("el mes con menor ventas es Noviembre ");
               break;
           case 12:
               System.out.println("el mes con menor ventas es Diciembre ");
               break;
              
       }
        
    }*/
    

   

   

    
   
   
   
   
   

   
   
   
    
    
    
}
