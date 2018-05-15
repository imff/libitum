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
        descEsc1.add("Bienvenido *NOMBRE DEL ROBOT*. \nHas despertado después de 4 años, te encuentras en un almacén que está completamente oscuro, recuerda que cuentas con visión nocturna");
        descEsc1.add("¡Bien! Ahora puedes observar... A la derecha hay varias cosas que puedes explorar, pero a la izquierda hay una puerta."); // En caso de que antes de inpeccionar vaya directamente a la puerta, se deberá considerar como acción inválida ya quela puerta está cerrada
        
        //descEsc1.add("¡Hey! JAJA ¿En verdad creíste que sería tan fácil salir de aquí? Está cerrada.\n ");
        
        descEsc1.add("Por la derecha hay un montón de robots colgados casi igual de destartalados que tú y frente a ellos hay un escritorio."):
        descEsc1.add("El escritorio tiene un cajón");
        descEsc1.add("Dentro de él hay varios documentos y dos llaves... ¡Hay una llave con tu nombre!"); //Podríamos recomendarle que guarde la llave?
        descEsc1.add("Parece que no hay algo más para observar"); //Debería validar que ahora vaya hacia la puerta y salga
        

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
