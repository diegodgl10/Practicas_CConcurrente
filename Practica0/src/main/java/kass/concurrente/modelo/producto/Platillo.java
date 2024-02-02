package kass.concurrente.modelo.producto;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase que modela un platillo
 * @author Kassandra Mirael
 */
public class Platillo {

    // Nombre del Platillo
    protected String nombre;
    // Tiempo del coccion del Platillo
    protected Integer tiempo;
    // Precio del Platillo
    protected Double precio;
    // Lista de productos del Platillo
    protected List<Producto> productos;

    /**
     * Constructor vacio del Platillo.
     */
    public Platillo(){
        this.productos = new ArrayList<Producto>();
    }

    /**
     * Constructor que recibe nombre y tiempo de coccion del Platillo.
     * @param nombre el nombre del Platillo.
     * @param tiempo el tiempo del Platillo.
     */
    public Platillo(String nombre, Integer tiempo){
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.productos = new ArrayList<Producto>();
    }

    /**
     * Constructor que recibe una lista de productos para el platillo, el precio,
     * el tiempo de coccion y el nombre del Platillo. 
     * @param productos lista de productos del Platillo.
     * @param precio el precio del Platillo.
     * @param tiempo el tiempo del Platillo.
     * @param nombre el nombre del Platillo.
     */
    public Platillo(List<Producto> productos, Double precio, Integer tiempo, String nombre){
        this.productos = productos;
        this.precio = precio;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    /**
     * Regresa el nombre del Platillo.
     * @return el nombre del Platillo.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Define el nuevo nombre del Platillo.
     * @param nombre el nuevo nombre del Platillo.
     */
    public void setNombre(String nombre ){
        this.nombre = nombre;
    }

    /**
     * Regresa el precio del Platillo.
     * @return el precio del Platillo.
     */
    public Double getPrecio(){
        return this.precio;
    }

    /**
     * Define el nuevo precio del Platillo.
     * @param precio el nuevo precio del Platillo.
     */
    public void setPrecio(Double precio ){
        this.precio = precio;
    }

    /**
     * Regresa el tiempo de coccion del Platillo.
     * @return el tiempo de coccion del Platillo.
     */
    public Integer getTiempoCoccion(){
        return this.tiempo;
    }

    /**
     * Define el nuevo tiempo de coccion del Platillo.
     * @param tiempo el nuevo tiempo de coccion del Platillo.
     */
    public void setTiempoCoccion(Integer tiempo ){
        this.tiempo = tiempo;
    }

    /**
     * Regresa la lista de productos requeridos para el Platillo.
     * @return la lista de productos requeridos para el Platillo.
     */
    public List<Producto> getProductosRequeridos(){
        return this.productos;
    }

    /**
     * Define la nueva lista de productos para el Platillo.
     * @param productos la nueva lista de productos para el Platillo.
     */
    public void setProductosRequeridos(List<Producto> productos){
        this.productos = productos;
    }

    /**
     * Este metodo calcula el precio sobre el precio de los items, se ignora
     * el precio base.
     * @return El precio de la suma de cada item utilizado
     */
    public Double calculaPrecio(){
        Double precioProductos = 0.0;
        if (this.productos == null){
            return precioProductos;
        }
        for (Producto producto : this.productos) {
            precioProductos += producto.getPrecio();
        }
        return precioProductos;
    }
}
