
package modelo;

public class Usuario {
    
    protected String userName;
    protected String password;
    protected String estado;
    protected int cedula;
    protected String user;
    protected String roll;
    
    Hotel hotel = new Hotel();
    public Usuario(){
        
    }

    public Usuario(String userName, String password, int cedula, String user, String roll) {
        this.userName = userName;
        this.password = password;
        this.estado = "Activo";
        this.cedula = cedula;
        this.user = user;
        this.roll = roll;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void login(){
        System.out.println("**** HOTEL FAKE ******");
        String usuario = Entrada.leerString("Usuario: ");
        String contraseña = Entrada.leerString("Contraseña: ");
        
        if(hotel.validar(usuario, contraseña) == false){
            if(this.roll.equalsIgnoreCase("admin")){

                Admin.menu();

            }else if(this.roll.equalsIgnoreCase("recepcion")){

                Recepcionista.menu();
            }
            else{
                System.out.println("Este usuario no existe");
            }
        }else{
            System.out.println("Algo salio mal");
        }
       
        
    }
    
    @Override
    public String toString() {
        return "Nombre = "+userName+"\nCedula = "+cedula+"\nUsuario = "+user+"\nTipo usuario = "+roll;
    }
    
    

              
    
}
