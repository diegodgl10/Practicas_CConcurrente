package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto de un inventario
 * @author Kassandra Mirael
 */
public class ProductoInventario extends Producto{
    
    // Cantidad del ProductoInventario.
    private Integer cantidad;

    /**
     * Constructor vacio para un ProductoInventario.
     */
    public ProductoInventario(){ }

    /**
     * Constructor que recibe nombre y precio.
     * @param nombre el nombre del ProductoInventario. 
     * @param precio el precio del ProductoInventario. 
     */
    public ProductoInventario(String nombre, Double precio){
        super(nombre, precio);
    }
    
    /**
     * Constructor que recibe nombre, precio y cantidad del ProductoInventario.
     * @param nombre el nombre del ProductoInventario.
     * @param precio el precio del ProductoInventario.
     * @param cantidad el cantidad del ProductoInventario.
     */
    public ProductoInventario(String nombre, Double precio, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Regresa el cantidad del ProductoInventario.
     * @return el cantidad del ProductoInventario.
     */
    public Integer getCantidad(){
        return this.cantidad;
    }

    /**
     * Define el nuevo cantidad del ProductoInventario.
     * @param cantidad el nuevo cantidad del ProductoInventario.
     */
    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }
}
