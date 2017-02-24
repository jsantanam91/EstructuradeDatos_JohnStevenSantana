/*
 * Fecha:23/2/2017
 * Descripción: Clase Vehiculo, primera estructura de datos, una clase es una plantilla 
                de donde puedo instanciar objetosde tipo Persona. Una instancia es una
                variable o un lugar en la memoria del computador y almacena los atributos y
                metodos que tiene el objeto.
 * Autor: John Steven Santana Muñoz
 */
package vehiculo;

/**
 *
 * @author xXxJHoNSaxXx
 */
public class vehiculo {
    private String placa;
    private String modelo;
    private String numerosoat;
    private String color;

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the numerosoat
     */
    public String getNumerosoat() {
        return numerosoat;
    }

    /**
     * @param numerosoat the numerosoat to set
     */
    public void setNumerosoat(String numerosoat) {
        this.numerosoat = numerosoat;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    
}
