package kass.concurrente.modelo.cuchillo;

/**
 * Clase que implementa la interfaz Cuchillo para representar un cuchillo de hierro.
 * @author Zamora Cruz Diego Arturo
 */
public class CuchilloHierro implements Cuchillo {

    /**
     * Regresa el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de hierro.
     * @return el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de hierro.
     */
    @Override
    public Integer corta() {
        return 3;
    }
    
}
