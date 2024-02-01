package kass.concurrente.modelo.producto;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase que modela un platillo
 * @author Kassandra Mirael
 */
public class Platillo {

    // Nombre del platillo
    private String nombre;
    // Tiempo del coccion del platillo
    private Integer tiempo;
    // Precio del platillo
    private Double precio;
    // Lista de productos del platillo
    private List<Producto> productos;

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
     * el tiempo de coccion y el nombre del platillo. 
     * @param productos lista de productos del platillo.
     * @param precio el precio del platillo.
     * @param tiempo el tiempo del platillo.
     * @param nombre el nombre del platillo.
     */
    public Platillo(List<Producto> productos, Double precio, Integer tiempo, String nombre){
        this.productos = productos;
        this.precio = precio;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    /**
     * Regresa el nombre del platillo.
     * @return el nombre del platillo.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Define el nuevo nombre del platillo.
     * @param nombre el nuevo nombre del platillo.
     */
    public void setNombre(String nombre ){
        this.nombre = nombre;
    }

    /**
     * Regresa el precio del platillo.
     * @return el precio del platillo.
     */
    public Double getPrecio(){
        return this.precio;
    }

    /**
     * Define el nuevo precio del platillo.
     * @param precio el nuevo precio del platillo.
     */
    public void setPrecio(Double precio ){
        this.precio = precio;
    }

    /**
     * Regresa el tiempo del platillo.
     * @return el tiempo del platillo.
     */
    public Integer getTiempo(){
        return this.tiempo;
    }

    /**
     * Define el nuevo tiempo del platillo.
     * @param tiempo el nuevo tiempo del platillo.
     */
    public void setTiempo(Integer tiempo ){
        this.tiempo = tiempo;
    }

    /**
     * Regresa la lista de productos requeridos para el platillo.
     * @return la lista de productos requeridos para el platillo.
     */
    public List<Producto> getProductosRequeridos(){
        return this.productos;
    }

    /**
     * Define la nueva lista de productos para el platillo.
     * @param productos la nueva lista de productos para el platillo.
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
    
    public Integer getTiempoCoccion(){
        return 0;
    }
}
