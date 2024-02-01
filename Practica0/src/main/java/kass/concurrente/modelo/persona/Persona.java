package kass.concurrente.modelo.persona;

/**
 * Clase que modela una persona
 * @author Kassandra Mirael
 */
public class Persona {
    
    // Nombre de la persona
    protected String nombre;

    /**
     * Constructor vacio de Persona.
     */
    public Persona(){ }
    
    /**
     * Constructor que recibe el nombre de la Persona.
     * @param nombre el nombre de la Persona.
     */
    public Persona(String nombre){
        this.nombre = nombre;
    }
}
