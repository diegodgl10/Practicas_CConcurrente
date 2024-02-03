package kass.concurrente.modelo.producto.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.Producto;

/**
 * Clase para construir platillos costosos
 * @author Zamora Cruz Diego Arturo.
 * @version 1.0
 */
public class PlatilloCostosoFactory implements PlatilloFactory {

    // Platillos economicos
    Platillo[] platillos = new Platillo[4];
    // Generador de numeros aleatorios
    Random random = new Random();

    /**
     * Constructor vacio.
     */
    public PlatilloCostosoFactory(){
        listarPlatillos();
    }

    /**
     * Regresa un platillo costoso.
     * @return un platillo costoso.
     */
    @Override
    public Platillo creaProducto() {
        int i = random.nextInt(4);
        return platillos[i];
    }

    /* Crea platillos costosos. */
    public void listarPlatillos() {
        List<Producto> prod1 = new ArrayList<Producto>();
        prod1.add(new Producto("Pescado", 10.0));
        prod1.add(new Producto("Arroz", 2.0));
        prod1.add(new Producto("Azucar", 4.0));
        PlatilloJapones platillo1;
        platillo1 = new PlatilloJapones(prod1, 18.0, 4, "Kaiseki-Ryori");

        List<Producto> prod2 = new ArrayList<Producto>();
        prod2.add(new Producto("Cebolla", 6.0));
        prod2.add(new Producto("Soja", 4.0));
        prod2.add(new Producto("Sake", 9.0));
        PlatilloJapones platillo2;
        platillo2 = new PlatilloJapones(prod2, 16.0, 4, "Fugu");

        List<Producto> prod3 = new ArrayList<Producto>();
        prod3.add(new Producto("Tortilla", 2.0));
        prod3.add(new Producto("Chile", 4.0));
        prod3.add(new Producto("Pollo", 6.0));
        PlatilloMexicano platillo3;
        platillo3 = new PlatilloMexicano(prod3, 22.0, 4, "Pozole");

        List<Producto> prod4 = new ArrayList<Producto>();
        prod4.add(new Producto("Tortilla", 2.0));
        prod4.add(new Producto("Cebolla", 6.0));
        prod4.add(new Producto("Pollo", 6.0));
        PlatilloMexicano platillo4;
        platillo4 = new PlatilloMexicano(prod4, 19.0, 4, "Mole");

        this.platillos[0] = platillo1;
        this.platillos[1] = platillo2;
        this.platillos[2] = platillo3;
        this.platillos[3] = platillo4;
    }
}
