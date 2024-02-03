package kass.concurrente.modelo.persona;

import java.util.List;

import kass.concurrente.modelo.producto.Platillo;

/**
 * Clase que modela a un Cliente.
 * @author Zamora Cruz Diego Arturo.
 * @version 1.0
 */
public class Cliente extends Persona {

    // La lista de la orden que pidio el Cliente
    private List<Object> orden;
    
    public Cliente(){ }

    /**
     * Constructor que recibe nombre, edad y la orden.
     * @param nombre la nombre del Cliente.
     * @param edad la edad del Cliente.
     * @param orden a lista de la orden que pidio el Cliente.
     */
    public Cliente(String nombre, Integer edad, List<Object> orden){
        super(nombre, edad);
        this.orden = orden;
    }

    /**
     * Regresa la lista de la orden que pidio el Cliente.
     * @return la lista de la orden que pidio el Cliente.
     */
    public List<Object> getOrden(){
        return this.orden;
    }
}
