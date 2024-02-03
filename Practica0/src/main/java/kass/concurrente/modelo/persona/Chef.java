package kass.concurrente.modelo.persona;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import kass.concurrente.modelo.cuchillo.Cuchillo;
import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.Producto;
import kass.concurrente.modelo.producto.ProductoInventario;

/**
 * Clase para representar a un chef
 * @author Kassandra Mirael
 */
public class Chef extends Persona{

    // Cuchillo del chef
    private Cuchillo cuchillo;
    // Ganancias del dia
    private Double ganancias = 0.0;
    // Inventario de Productos que tiene a la mano el Chef.
    private Hashtable<String, ProductoInventario> productos;

    /**
     * Constructor vacio de Chef.
     */
    public Chef(){ }

    /**
     * Constructor que recibe nombre, edad y el cuchillo del Chef
     * @param nombre el nombre del Chef.
     * @param edad el edad del Chef.
     * @param cuchillo el cuchillo del Chef.
     */
    public Chef(String nombre, Integer edad, Cuchillo cuchillo){
        super(nombre, edad);
        this.cuchillo = cuchillo;
        this.productos = new Hashtable<String, ProductoInventario>();
    }

    /**
     * Regresa el cuchillo del Chef.
     * @return el cuchillo del Chef.
     */
    public Cuchillo getCuchillo(){
        return this.cuchillo;
    }

    /**
     * Define el nuevo cuchillo del Chef.
     * @param cuchillo el nuevo cuchillo del Chef.
     */
    public void setCuchillo(Cuchillo cuchillo){
        this.cuchillo = cuchillo;
    }

    /**
     * Regresa las ganancias del dia.
     * @return las ganancias del dia.
     */
    public Double getGanancias(){
        return this.ganancias;
    }

    /**
     * Regresa los productos en el inventario del chef.
     * @return los productos en el inventario del chef.
     */
    public Hashtable<String, ProductoInventario> getProductos(){
        return this.productos;
    }

    /**
     * Define el inventario del chef
     * @param productos el inventario del chef.
     */
    public void setProductos(List<Producto> productos){
        if (productos == null){
            this.productos = new Hashtable<String, ProductoInventario>();
        }
        for (Producto p : productos) {
            this.productos.put(p.getNombre(), new ProductoInventario(p, 2));
        }
    }

    /**
     * Metoro para que el chef cocine el platillo indicado.
     * @param platillo el platillo que debe cocinar.
     */
    public void cocinar(Platillo platillo){
        verificaInventario(platillo);
        Integer tPreparacion = platillo.getTiempoCoccion();
        tPreparacion -= this.cuchillo.corta();
        try{
            reporte("El cocinero comenzo a preparar " + platillo.getNombre());
            Thread.sleep(tPreparacion * 1000);
        } catch (InterruptedException e){
            reporte("El cocinero se corto y murio, F");
        }
        for (Producto pRequerido : platillo.getProductosRequeridos()) {
            ProductoInventario p = this.productos.get(pRequerido.getNombre());
            p.setCantidad(p.getCantidad()-1);
            this.productos.put(p.getNombre(), p);
            this.ganancias += p.getPrecio();
        }
        this.ganancias += platillo.getPrecio();
        reporte("Le tomo " +tPreparacion+ " seg prepararlo");
        reporte("El cocinero termino de preparar " +platillo.getNombre()+ "\n");
    }

    /**
     * Venta de un producto
     * @param producto el producto que se vendera.
     */
    public void vender(Producto producto){
        if (this.productos.get(producto.getNombre()).getCantidad() <= 0){
            recogeProducto(producto);
        }
        ProductoInventario p = this.productos.get(producto.getNombre());
        p.setCantidad(p.getCantidad()-1);
        this.productos.put(p.getNombre(), p);
        this.ganancias += producto.getPrecio();
        reporte("El cocinero vendio " +producto.getNombre()+ "\n");
    }

    /**
     * Atiende a un cliente.
     * @param cliente el cliente al que se va a antender.
     */
    public void atenderCliente(Cliente cliente){
        String nombre = cliente.getNombre();
        reporte("----- Se atendera a " +nombre+ " -----");
        List<Object> orden = cliente.getOrden();
        for (Object object : orden) {
            if (orden.get(0) instanceof Platillo){
                Platillo platillo = (Platillo) object;
                cocinar(platillo);
            } else{
                Producto producto = (Producto) object;
                vender(producto);
            }
        }
    }

    /**
     * Regresa una representacion en cadena del status actual del Chef.
     * @return una representacion en cadena del status actual del Chef.
     */
    @Override
    public String toString(){
        String msj = "";
        msj += "Chef: " +this.nombre +"\n";
        msj += String.format("Ganancias: %.3f\n", this.ganancias);
        msj += "Cuchillo ahorra: " +this.cuchillo.corta()+ " seg\n";
        msj += "Inventario:" +"\n";
        Enumeration<String> llaves = this.productos.keys();
        while(llaves.hasMoreElements()){
            ProductoInventario pInv = this.productos.get(llaves.nextElement());
            msj += "   "+ pInv.getNombre() +": "+ pInv.getCantidad() +"\n";
        }
        return msj;
    }

    /**
     * Surte el inventario del chef con el producto faltante.
     * Solo puede ir por un tipo de producto a la vez.
     */
    private void recogeProducto(Producto producto){
        try{
            reporte("El cocinero fue por 2 unidades de " + producto.getNombre());
            Thread.sleep(1000);
        } catch (InterruptedException e){
            reporte("El cocinero se tropezo y murio, F");
        }
        reporte("El cocinero ya regreso con 2 unidades de " + producto.getNombre());
        ProductoInventario pInv = this.productos.get(producto.getNombre());
        pInv.setCantidad(2);
        this.productos.put(nombre, pInv);
        reporte("Le tomo 1 seg ir por " +producto.getNombre()+ "\n");
    }

    /* Verifica si el chef tiene todo para comenzar a cocinar,
    si no es asi, va por ingredientes. */
    private void verificaInventario(Platillo platillo){
        List<Producto> porSurtir = new ArrayList<Producto>();
        Enumeration<String> llaves = this.productos.keys();
        while(llaves.hasMoreElements()){
            ProductoInventario pInv = this.productos.get(llaves.nextElement());
            if (pInv.getCantidad() <= 0 &&
                platillo.getProductosRequeridos().contains(pInv)){
                porSurtir.add(pInv);
            }
        }
        for (Producto pFaltante : porSurtir) {
            recogeProducto(pFaltante);
        }
    }

    /* Reporta al usurio el estado del chef. */
    private void reporte(String msj){
        System.out.println(msj);
    }
}
