package kass.concurrente.modelo.cuchillo;

/**
 * Clase que implementa la interfaz Cuchillo para representar un cuchillo de piedra.
 * @author Zamora Cruz Diego Arturo
 */
public class CuchilloPiedra implements Cuchillo{

    /**
     * Regresa el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de piedra.
     * @return el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de piedra.
     */
    @Override
    public Integer corta() {
        return 2;
    }
    
}
