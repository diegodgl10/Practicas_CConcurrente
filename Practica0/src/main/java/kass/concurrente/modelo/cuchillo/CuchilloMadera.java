package kass.concurrente.modelo.cuchillo;

/**
 * Clase que implementa la interfaz Cuchillo para representar un cuchillo de madera.
 * @author Zamora Cruz Diego Arturo
 */
public class CuchilloMadera implements Cuchillo{

    /**
     * Regresa el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de madera.
     * @return el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de madera.
     */
    @Override
    public Integer corta() {
        return 1;
    }
    
}
