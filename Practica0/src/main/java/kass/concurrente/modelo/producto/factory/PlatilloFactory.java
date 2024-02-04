package kass.concurrente.modelo.producto.factory;

import kass.concurrente.modelo.producto.Platillo;

/**
 * Interfaz para fabrica de platillos.
 * @author Zamora Cruz Diego Arturo.
 * @version 1.0
 */
public interface PlatilloFactory {

    /**
     * Regresa un platillo.
     * @return un platillo.
     */
    public Platillo creaPlatillo();
}
