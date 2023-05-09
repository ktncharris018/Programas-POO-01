
package modelo;

import static modelo.Hotel.*;

public class Recepcionista extends Usuario{
    
    static Usuario p = new Usuario();
    
    public Recepcionista(){
        
    }

    public Recepcionista(String userName, String password, int cedula, String user, String roll) {
        super(userName, password, cedula, user, roll);
    }
    
    public static void menu(){
        
        int op;
        
        do{
            
            System.out.println("\nBIENVENIDO RECEPCIONISTA");
            System.out.println("1. Hacer reserva");
            System.out.println("2. Buscar habitacion");
            System.out.println("3. Registrar huesped");
            System.out.println("4. Consultar huesped");
            System.out.println("5. informe de huespedes");
            System.out.println("6. Cerrar sesion");
            System.out.println("7. Salir del programa");
            op = Entrada.leerInt("Digite una opcion: ");
            
            switch(op){
                case 1: registrarReserva();
                        break;
                case 2: consultarHabitacion();
                        break;
                case 3: registrarHuesped();
                        break;
                case 4: consultarHuesped();
                        break;
                case 5: informeHuespedes();
                        break;
                case 6: System.out.println("sesion finalizada");
                        p.login();
                        break;
                case 7: System.out.println("programa finalizado ");
                        break;
                default: System.out.println("Opcion no valida");        
            }
            
        }while(op != 7);
        
    }
    
    public static void hacerReserva(){
        System.out.println("Realizar reserva");
    }
    
  
    
 
    
}
