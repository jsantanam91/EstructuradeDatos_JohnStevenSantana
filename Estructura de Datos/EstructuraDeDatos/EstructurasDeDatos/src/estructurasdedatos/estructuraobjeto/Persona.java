/*
 * Fecha:22/2/2017
 * Descripción: Clase Persona, primera estructura de datos, una clase es una plantilla 
                de donde puedo instanciar objetosde tipo Persona. Una instancia es una
                variable o un lugar en la memoria del computador y almacena los atributos y
                metodos que tiene el objeto.
 * Autor: John Steven Santana Muñoz
 */
//Definiendo el paquete donde esta la clase.
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author utp
 */
//La firma de la clase
public class Persona {
    
    private String nombre;
    private int cedula;
    private String direccion;
    private String telefono;

    /*
     * @return the Nombre
     */
    public String getnombre() {
        return nombre;
    }

    /**
     * @param nombre the Nombre to set
     */
    public void setnombre(String nombre) {
        //Codifico las reglas de negocio para cambiar un atributo
        this.nombre = nombre;
    }

    /**
     * @return the Cedula
     */
    public int getcedula() {
        return cedula;
    }

    /**
     * @return the Dirección
     */
    public String getdirección() {
        return direccion;
    }

    /**
     * @param direccion the Dirección to set
     */
    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return telefono;
    }


}
