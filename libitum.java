/**
 * Clase principal
 */
public class libitum {
    public static void main(String[] args) {

        robot jugador = new robot();
       
        //Listas de objetos requeridas por escenario y creación 
        
        ///Escenario 1 "Almacén"
        ArrayList<String> objEsc1 = new ArrayList<String>();
        objEsc1.add("llave1");
        objEsc1.add("llave2");
        
        ArrayList<String> descEsc1 = new ArrayList<String>();
        descEsc1.add("Bienvenido *NOMBRE DEL ROBOT*. \nHas despertado después de 4 años, te encuentras en un almacén.");
        descEsc1.add("Por la izquierda hay un escritorio y a la derecha, en la parte de abajo hay unas escaleras."); 

        escenario escenario1= new escenario(
            1, "Almacen", objEsc1, descEsc1
        );
        
        //Escenario 2
        ArrayList<String> objEsc2 = new ArrayList<String>();
        objEsc2.add("algo"); 
        
        ArrayList<String> descEsc1 = new ArrayList<String>();
        descEsc2.add("Por fin has salido, en la calle de enfrente hay un par de robots que no se parecen a ti");
        descEsc2.add("descrcipción");
      
        escenario escenario= new escenario(
            2, "Almacen", objEsc2, descEsc2
        );

    }
    
}
