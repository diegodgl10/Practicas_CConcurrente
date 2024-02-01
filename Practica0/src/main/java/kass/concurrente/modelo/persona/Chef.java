package kass.concurrente.modelo.persona;

import kass.concurrente.modelo.cuchillo.Cuchillo;

public class Chef extends Persona{

    // Cuchillo del chef
    Cuchillo cuchillo;

    /**
     * Constructor vacio de Chef.
     */
    public Chef(){ }

    /**
     * Constructor que recibe nombre, edad y el cuchillo del Chef
     * @param nombre el nombre del Chef.
     * @param edad el edad del Chef.
     * @param cuchillo el cuchillo del Chef.
     */
    public Chef(String nombre, Integer edad, Cuchillo cuchillo){
        super(nombre, edad);
        this.cuchillo = cuchillo;
    }

    /**
     * Regresa el cuchillo del Chef.
     * @return el cuchillo del Chef.
     */
    public Cuchillo getCuchillo(){
        return this.cuchillo;
    }

    /**
     * Define el nuevo cuchillo del Chef.
     * @param cuchillo el nuevo cuchillo del Chef.
     */
    public void setCuchillo(Cuchillo cuchillo){
        this.cuchillo = cuchillo;
    }
    
}
