/*
 * Esta clase es la clase principal generada automaticamente al iniciar un proyecto desde netbeans
 */
package estructurasdedatos;

import estructurasdedatos.estructuraobjeto.Persona;

/**
 *
 * @author utp
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona juan = new Persona();
        
        juan.setnombre("Juan Perez");
        juan.setdireccion("Cra 4 BIS # 36 B 28");

      
        System.out.println(" Nombre: " + juan.getnombre() + " Direccion: " + juan.getdirección());

        System.out.println("Hola Mundo");
        

    }

}
