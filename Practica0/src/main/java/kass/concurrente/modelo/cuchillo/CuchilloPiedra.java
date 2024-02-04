package kass.concurrente.modelo.cuchillo;

/**
 * Clase que implementa la interfaz Cuchillo para representar un cuchillo de piedra.
 * @author Zamora Cruz Diego Arturo
 * @version 1.0
 */
public class CuchilloPiedra implements Cuchillo{

    // Nivel de corte (segundos que ahorra al utilizar el uchillo de piedra).
    private Integer corte = 1;
    // Material del cuchillo
    private String material = "Piedra";

    /**
     * Regresa el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de piedra.
     * @return el valor de tiempo que reduce el Chef
     * al cocinar usando un cuchillo de piedra.
     */
    @Override
    public Integer corta() {
        return corte;
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
