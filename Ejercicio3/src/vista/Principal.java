/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Informe;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        double[] report = {50000, 60000, 40000, 55000, 20000, 70000, 30000, 45000, 90000, 80000, 120000, 100000};
        
        Informe informe = new Informe(report);
        
        // TODO code application logic heresout
        System.out.println("el promedio de ventas anual es de :"+informe.promedioVentas());
        //System.out.println(informe.mesMayor());
        
        //informe.mesMayor(reporte);
        //informe.mesMayor(reporte);
    }
    
}
