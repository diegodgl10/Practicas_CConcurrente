package kass.concurrente.modelo.cuchillo;

/**
 * Clase que implementa la interfaz Cuchillo para representar un cuchillo de madera.
 * @author Zamora Cruz Diego Arturo
 * @version 1.0
 */
public class CuchilloMadera implements Cuchillo{

    // Nivel de corte (segundos que ahorra al utilizar el uchillo de madera).
    private Integer corte = 0;
    // Material del cuchillo
    private String material = "Madera";

    /**
     * Regresa el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de madera.
     * @return el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de madera.
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
