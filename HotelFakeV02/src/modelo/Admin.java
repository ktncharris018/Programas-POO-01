
package modelo;

import static modelo.Hotel.*;

public class Admin extends Usuario{

    static Usuario p = new Usuario("aaa","fa",100,"fa","recepcion");
    
    
    public Admin() {
    }

    public Admin(String userName, String password, int cedula, String user, String roll) {
        super(userName, password, cedula, user,roll);
    }
    
   
    
    public static void menu(){
        int op ;
        
        do{
            
            System.out.println("\nBIENVENIDO ADMIN");
            System.out.println("1. Crear habitaciones");
            System.out.println("2. Informe habitaciones");
            System.out.println("3. Buscar habitacion");
            System.out.println("4. Crear usuarios");
            System.out.println("5. Consultar usuario");
            System.out.println("6. Lista usuarios");
            System.out.println("7. Cerrar sesion");
            System.out.println("8. Salir del programa");
            op = Entrada.leerInt("\nDigite una opcion: ");
            
            switch(op){
                case 1: registrarHabitacion();
                        break;
                case 2: informeHabitaciones();
                        break;
                case 3: consultarHabitacion();
                        break;
                case 4: registrarUsuario();
                        break;
                case 5: consultarUsuario();
                        break;
                case 6: listaUsuario();
                        break;
                case 7: System.out.println("Sesion finalizada\n");
                        login();
                        break;
                case 8: System.out.println("programa finalizado");
                        System.exit(0);
                        break;
                default: System.out.println("Opcion no valida");        
            }
            
            
        }while(op !=8);

        
        
    }
   
   
}
