package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto
 * @author Kassandra Mirael
 */
public class Producto {
    
    // Nombre del Producto
    protected String nombre;
    // Precio del Producto
    protected Double precio;

    /**
     * Constructor vacio para un Producto.
     */
    public Producto(){ }

    /**
     * Constructor que recibe nombre y precio.
     * @param nombre el nombre del Producto. 
     * @param precio el precio del Producto. 
     */
    public Producto(String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Regresa el nombre del Producto.
     * @return el nombre del Producto.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Define el nuevo nombre del Producto.
     * @param nombre el nuevo nombre del Producto.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Regresa el precio del Producto.
     * @return el precio del Producto.
     */
    public Double getPrecio(){
        return this.precio;
    }

    /**
     * Define el nuevo precio del Producto.
     * @param precio el nuevo precio del Producto.
     */
    public void setPrecio(Double precio){
        this.precio = precio;
    }

    /**
     * Regresa True si el objeto es igual al objeto que mando a llamar al metodo,
     * False en otro caso.
     * @return True si el objeto es igual al objeto que mando a llamar al metodo,
     * False en otro caso.
     */
    @Override
    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        if (!(object instanceof Producto)){
            return false;
        }
        Producto producto = (Producto) object;
        if (producto.nombre.equals(this.nombre)){
            return true;
        }
        return false;
    }
}
