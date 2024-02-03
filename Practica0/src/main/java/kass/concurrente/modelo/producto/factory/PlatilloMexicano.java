package kass.concurrente.modelo.producto.factory;

import java.util.List;

import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.Producto;

/**
 * Clase que representa un platillo mexicano.
 * @author Zamora Cruz Diego Arturo
 * @version 1.0
 */
public class PlatilloMexicano extends Platillo {

    // Al precio del platillo se le descuenta
    // un porcentaje del precio por consumir comida nacional.
    private final Double apollo = 15.0;

    /**
     * Constructor que recibe una lista de productos para el platillo, el precio,
     * el tiempo de coccion y el nombre del Platillo mexicano. 
     * @param productos lista de productos del Platillo mexicano.
     * @param precio el precio del Platillo mexicano.
     * @param tiempo el tiempo del Platillo mexicano.
     * @param nombre el nombre del Platillo mexicano.
     */
    public PlatilloMexicano(List<Producto> productos, Double precio,
                            Integer tiempo, String nombre){
        Double nPrecio = precio * ((100-this.apollo)/100);
        this.productos = productos;
        this.precio = nPrecio;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }
}