
package modelo;


import java.time.LocalDate;
import logica.Coleccion;
 
public class Hotel {
    
    static Coleccion c = new Coleccion();
      
    public Hotel(){
       
    }
  
    public static void imprimirUsuario (Usuario u){
        System.out.println(u);
    }
    
       
    public static Usuario consultarUsuario(){
        int cedula;
        cedula = Entrada.leerInt("Digite la cedula: ");
        
        if(c.buscar(cedula) == null){
            System.out.println("Este usuario No existe");
            return null;
        }else{
            System.out.println("Usuario encontrado");
            imprimirUsuario(c.buscar(cedula));
            return c.buscar(cedula);
            
        }
      
    }
   
    
    public static Usuario registrarUsuario(){
        
        System.out.println("--------------------------------------");
        Usuario u;
        String nombre = Entrada.leerString("Nombre: ");
        int cedula = Entrada.leerInt("Cedula: ");
        int tipoUsuario = Entrada.leerInt("Tipo Usuario \n1. Administrador \n2. Recepcionista: ");
        String user = Entrada.leerString("Usuario: ");
        String contraseña = Entrada.leerString("Constraseña: ");
        
        if(tipoUsuario == 1){
            u = new Usuario(nombre,contraseña,cedula, user, "admin");
            c.registrarUsuario(u,cedula);
            return u; 
        }else{
            u = new Usuario(nombre, contraseña,cedula,user, "recepcion");
            c.registrarUsuario(u,cedula);
            return u;
        }
             
    }
   
    public static void listaUsuario(){
        System.out.println("** Lista Usuarios **");
        c.informe();
        
    }
    
    public static Usuario validar(String usuario, String contraseña){
        
        return c.validar(usuario, contraseña);
        
    }
   
    ////////////////////// HABITACIONES ////////////////////////////////////////
    
    public static void registrarHabitacion(){
        System.out.println("-----------------------------");
        Habitacion h;
        int tipo = Entrada.leerInt("tipo de Habitacion \n1. Simple \n2.Doble: ");
        String idHabitacion = Entrada.leerString("Id habitacion: ");
        String descripcion = Entrada.leerString("Descripcion: ");
        int cantCamas = Entrada.leerInt("Cantidad camas: ");
        int cantBaños = Entrada.leerInt("Cantidad baños: ");
        int maxPersonas = Entrada.leerInt("Personas maximas: ");
        double precio = Entrada.leerDouble("Precio por dia: ");
        
        if(tipo == 1){
            h = new HabitacionSimple("simple",idHabitacion,descripcion,cantCamas,cantBaños,maxPersonas,precio);
            c.registrarHabitacion(h);
        }else{
            int cantMuebles = Entrada.leerInt("Cantidad de muebles: ");
            String tipoCama = Entrada.leerString("Tipo de cama: ");
            String tipoBaño = Entrada.leerString("Tipo de Baño: ");
            h = new HabitacionDoble(cantMuebles, tipoCama, tipoBaño, "Doble", idHabitacion, descripcion, cantCamas, cantBaños, maxPersonas, precio);
            c.registrarHabitacion(h);
        }
        
    }
    
    public static void imprimirHabitacion(Habitacion h){
        System.out.println(h);
    }
    
    public static void consultarHabitacion(){
        String idHabitacion = Entrada.leerString("Id de habitacion a buscar: ");
        if(c.buscarH(idHabitacion) == null){
            System.out.println("Esta habitacion no existe");
        }else{
            System.out.println("Habitacion encontrada\n");
            imprimirHabitacion(c.buscarH(idHabitacion));
        }
    }
    
    public static void informeHabitaciones(){
        System.out.println("**** Informe de habitaciones ***");
        c.informeHabitacion();
    }
    
  ///////////////////////// HUESPEDES /////////////////////////////////////////
    
    
    public static void registrarHuesped(){
        System.out.println("---------------------------");
        Huesped h;
        
        String tipoIdentificacion = Entrada.leerString("Tipo de identificaion: ");
        int identificacion = Entrada.leerInt("Identificacion: ");
        String pais = Entrada.leerString("Pais: ");
        String nombre = Entrada.leerString("Nombre: ");
        String apellido = Entrada.leerString("Apellido: ");
        String email = Entrada.leerString("Email: ");
        long telefonfo = Entrada.leerLong("Telefono: ");

        h = new Huesped(tipoIdentificacion, identificacion, pais, nombre, apellido, email, telefonfo);
        c.registrarHuesped(h);
    }
    
    public static void imprimirHuesped(Huesped h){
        System.out.println(h);
    }
    
    public static void consultarHuesped(){
        int identificacion = Entrada.leerInt("Identificacion del huesped: ");
        if(c.buscarHuesped(identificacion)== null){
            System.out.println("Este Huesped no se encuentra registrado");
        }else{
            System.out.println("Huesped encontrado\n");
            imprimirHuesped(c.buscarHuesped(identificacion));
        }
    }
    
    public static void informeHuespedes(){
        System.out.println("**** informe Huespedes *****");
        c.informeHuespedes();
    }
    
    ///////////////////// RESERVAS ////////////////////////////////////////
    public static void registrarReserva(){
        System.out.println("-------------------------");
        Reserva r;
        
        LocalDate fechaIn = LocalDate.parse(Entrada.leerString("Fecha llegada(aaaa-mm-dd): "));
        LocalDate fechaOut = LocalDate.parse(Entrada.leerString("Fecha salida(aaaa-mm-dd): "));
        int identificacion = Entrada.leerInt("Identificacion del huespes: ");
        String idHabitacion = Entrada.leerString("Id de Habitacion: ");
        
        if((c.buscarHuesped(identificacion) == null) || (c.buscarH(idHabitacion) == null)){
            System.out.println("No se pudo realizar la reserva por inconsistencia en los datos");
        }else if((c.buscarHuesped(identificacion).getEstado().equals("Hospedado")) || (c.buscarH(idHabitacion).getEstado().equals("No disponible"))){
            System.out.println("No se pudo realizar la reserva por el estado");
        }
        else{
            r = new Reserva(fechaOut, fechaIn,c.buscarHuesped(identificacion),c.buscarH(idHabitacion));
            c.registrarReserva(r);
            c.buscarHuesped(identificacion).setEstado("Hospedado");
            c.buscarH(idHabitacion).setEstado("No disponible");
            System.out.println("Reserva realizada con exito");
        }     
    }
    
    public static void informeReserva(){
        System.out.println("**** informe Reservas *****");
        c.informeReserva();
    }
    
    public static void registrarServicio(){
        Servicio s;
        int identificacion = Entrada.leerInt("identificacion del huesped: ");
        if(c.buscarHuesped(identificacion) == null){
            System.out.println("Este usuario no se encuentra registrado");
        }
        else if((c.buscarHuesped(identificacion).getEstado().equals("Hospedado"))){
            int op = Entrada.leerInt("\n1.Lavado \n2.Transporte \n3.Estacionamiento \nQue servicio desea elegir: ");
            if(op == 1){
                String descrpcion = Entrada.leerString("Descripcion: ");
                int cant = Entrada.leerInt("Cantidad de prendas: ");
                int tipo = Entrada.leerInt("Tipo de prenda \n1.normal(2000) \n2.Fina(5000) : ");
                double precio;
                if(tipo == 1){
                    precio = 2000;
                }else{
                    precio = 5000;
                }
                
                s = new Lavado(precio,cant,"Lavado",descrpcion,0);
                s.setTotal(s.calcularPrecio());
                System.out.println("Total a pagar = "+s.calcularPrecio());
               
                System.out.println("En serivicios llevas un total de = "+c.buscarHuesped(identificacion).totalPagarServicio(s.calcularPrecio()));
                c.registrarServicio(s);
                
            }
            else if(op == 2){
                String descripcion = Entrada.leerString("Descripcion: ");
                double distancia = Entrada.leerDouble("Distancia recorrida: ");
                int chofer = Entrada.leerInt("Va a llevar chofer \n1.Si \n2.No :");
                if(chofer == 1){
                    s = new Transporte(distancia,true,"Transporte",descripcion,0);
                    s.setTotal(s.calcularPrecio());
                    System.out.println("Total a pagar = "+s.calcularPrecio());
                    
                    System.out.println("En servicios llevas un total de = "+c.buscarHuesped(identificacion).totalPagarServicio(s.calcularPrecio()));
                    c.registrarServicio(s);
                }else{
                    s = new Transporte(distancia,false,"Transporte",descripcion,0);
                    s.setTotal(s.calcularPrecio());
                    System.out.println("Total a pagar = "+s.calcularPrecio());
                    
                    System.out.println("En servicios llevas un total de = "+c.buscarHuesped(identificacion).totalPagarServicio(s.calcularPrecio()));
                    c.registrarServicio(s);
                }
            }
            else if(op == 3){
                String descripcion = Entrada.leerString("Descripcion: ");
                int horas = Entrada.leerInt("cantidad de horas: ");
                s = new Estacionamiento(horas,"Estacionamiento",descripcion,0);
                s.setTotal(s.calcularPrecio());
                System.out.println("Total a pagar = "+s.calcularPrecio());
                
                System.out.println("En servicios llevas un total de = "+c.buscarHuesped(identificacion).totalPagarServicio(s.calcularPrecio()));
                c.registrarServicio(s);
            }
            else {
                System.out.println("opcion invalida");
            }
        }else{
            System.out.println("Este usuario no se encuentra hospedad");
        }
        
    }
    
    public static void registrarFactura(){
        System.out.println("-----------------------------");
        Facturacion f;
        int identificacion = Entrada.leerInt("Digite la identifiacion del huesped: ");
        if(c.buscarReserva(identificacion) == null){
            System.out.println("Este usuario no se encuentra registrado ");
        }else if(c.buscarHuesped(identificacion).getEstado().equalsIgnoreCase("Hospedado")){
            f = new Facturacion(LocalDate.now(),c.buscarReserva(identificacion));
            c.buscarHuesped(identificacion).setEstado("No hospedado");
            c.buscarReserva(identificacion).getHabitacion().setEstado("Disponible");
            c.registrarFactura(f);
            System.out.println(f);
        }
        else{
            System.out.println("Este usuario No se encuentra hospedado");
        }
    }
}
    
    

    
  
