package kass.concurrente.modelo.cuchillo;

/**
 * Clase que implementa la interfaz Cuchillo para representar un cuchillo de hierro.
 * @author Zamora Cruz Diego Arturo
 * @version 1.0
 */
public class CuchilloHierro implements Cuchillo {

    // Nivel de corte (segundos que ahorra al utilizar el uchillo de hierro).
    private Integer corte = 2;
    // Material del cuchillo
    private String material = "Hierro";

    /**
     * Regresa el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de hierro.
     * @return el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de hierro.
     */
    @Override
    public Integer corta() {
        return this.corte;
    }

    /**
     * Regresa el material del que esta formado.
     * @return el material del que esta formado.
     */
    @Override
    public String material() {
        return this.material;
    }
}
