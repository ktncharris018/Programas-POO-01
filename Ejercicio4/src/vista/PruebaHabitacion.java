/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Habitacion;

/**
 *
 * @author KRISTAL DEL MAR
 */
public class PruebaHabitacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion(2,3,4);
        
        System.out.println("la altura de la habitacion es :"+habitacion.getAlto());
        System.out.println("el largo de la habitacion es :"+habitacion.getLargo());
        System.out.println("el ancho de la habitacion es :"+ habitacion.getAncho());
        System.out.println("                                                    ");
        System.out.println("se necesitan para tapizar la paerd: "+habitacion.tapizarPared()+" m2");
        System.out.println("senecita para chapar el piso :"+habitacion.chaparPiso()+" m2");
        // TODO code application logic here
    }
    
}
