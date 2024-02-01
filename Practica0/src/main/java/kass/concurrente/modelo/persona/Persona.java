package kass.concurrente.modelo.persona;

/**
 * Clase que modela una persona
 * @author Kassandra Mirael
 */
public class Persona {
    
    // Nombre de la Persona
    protected String nombre;
    // Edad de la Persona
    protected Integer edad; 

    /**
     * Constructor vacio de Persona.
     */
    public Persona(){ }
    
    /**
     * Constructor que recibe el nombre de la Persona.
     * @param nombre el nombre de la Persona.
     */
    public Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Regresa el nombre de la Persona.
     * @return el nombre de la Persona.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Define el nuevo nombre de la Persona.
     * @param nombre el nuevo nombre de la Persona.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Regresa el edad de la Persona.
     * @return el edad de la Persona.
     */
    public Integer getEdad(){
        return this.edad;
    }

    /**
     * Define el nuevo edad de la Persona.
     * @param edad el nuevo edad de la Persona.
     */
    public void setEdad(Integer edad){
        this.edad = edad;
    }
}
