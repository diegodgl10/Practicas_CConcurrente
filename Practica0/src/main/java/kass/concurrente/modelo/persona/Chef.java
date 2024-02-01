package kass.concurrente.modelo.persona;

import kass.concurrente.modelo.cuchillo.Cuchillo;

public class Chef extends Persona{

    // Algo del chef
    Integer algo;
    // Cuchillo del chef
    Cuchillo cuchillo;

    /**
     * Constructor vacio de Chef.
     */
    public Chef(){ }

    /**
     * Constructor que recibe nombre, algo y el cuchillo del Chef
     * @param nombre el nombre del Chef.
     * @param algo el algo del Chef.
     * @param cuchillo el cuchillo del Chef.
     */
    public Chef(String nombre, Integer algo, Cuchillo cuchillo){
        this.nombre = nombre;
        this.algo = algo;
        this.cuchillo = cuchillo;
    }
    
}
