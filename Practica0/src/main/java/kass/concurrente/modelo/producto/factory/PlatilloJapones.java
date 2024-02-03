package kass.concurrente.modelo.producto.factory;

import java.util.List;

import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.Producto;

/**
 * Clase que representa un platillo japones.
 * @author Zamora Cruz Diego Arturo
 * @version 1.0
 */
public class PlatilloJapones extends Platillo {

    // Al precio del platillo se le aumenta
    // un porcentaje del precio por consumir comida extranjera.
    private Double impuesto = 30.0;

    /**
     * Constructor que recibe una lista de productos para el platillo, el precio,
     * el tiempo de coccion y el nombre del Platillo japones. 
     * @param productos lista de productos del Platillo japones.
     * @param precio el precio del Platillo japones.
     * @param tiempo el tiempo del Platillo japones.
     * @param nombre el nombre del Platillo japones.
     */
    public PlatilloJapones(List<Producto> productos, Double precio,
                           Integer tiempo, String nombre){
        Double nPrecio = precio * ((100+this.impuesto)/100);
        this.productos = productos;
        this.precio = nPrecio;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }
}