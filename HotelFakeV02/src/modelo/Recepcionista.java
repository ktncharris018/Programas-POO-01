
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
            System.out.println("2. informe reservas");
            System.out.println("3. Registrar servicio");
            System.out.println("4. Buscar habitacion");
            System.out.println("5. Registrar huesped");
            System.out.println("6. Consultar huesped");
            System.out.println("7. informe de huespedes");
            System.out.println("8. Generar facturar");
            System.out.println("9. Cerrar sesion");
            System.out.println("10.Salir del programa");
            op = Entrada.leerInt("\nDigite una opcion: ");
            
            switch(op){
                case 1: registrarReserva();
                        break;
                case 2: informeReserva();
                        break;
                case 3: registrarServicio();
                        break;
                case 4: consultarHabitacion();
                        break;
                case 5: registrarHuesped();
                        break;
                case 6: consultarHuesped();
                        break;
                case 7: informeHuespedes();
                        break;
                case 8: registrarFactura();
                        break;
                case 9: System.out.println("sesion finalizada\n");
                        login();
                        break;
                case 10: System.out.println("programa finalizado ");
                        System.exit(0);
                        break;
                default: System.out.println("Opcion no valida");        
            }
            
        }while(op != 9);
        
    }
    
    public static void hacerReserva(){
        System.out.println("Realizar reserva");
    }
    
  
    
 
    
}
