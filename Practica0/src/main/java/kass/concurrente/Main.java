package kass.concurrente;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import kass.concurrente.modelo.cuchillo.Cuchillo;
import kass.concurrente.modelo.cuchillo.CuchilloHierro;
import kass.concurrente.modelo.cuchillo.CuchilloMadera;
import kass.concurrente.modelo.cuchillo.CuchilloPiedra;
import kass.concurrente.modelo.persona.Chef;
import kass.concurrente.modelo.persona.Cliente;
import kass.concurrente.modelo.producto.Producto;
import kass.concurrente.modelo.producto.factory.PlatilloCostosoFactory;
import kass.concurrente.modelo.producto.factory.PlatilloEconomicoFactory;

/**
 * Clase Main
 * Aqui va toda tu simulacion
 * Genera un par de clientes para que los atienda el chef
 * @author Kassandra Mirael
 * @version 1.0
 */
public class Main {

    // El chef que cocinara
    static Chef chef;
    // Lista de tosos los productos que se pueden necesitar
    static List<Producto> productos;
    // Lista de clientes
    static List<Cliente> clientes;
    // Objeto random
    static Random random = new Random();
    // Logger
    static final Logger logger = Logger.getLogger(Main.class.getName());


    /* Genera un chef con un tipo de cuchillo aleatorio. */
    static void generarChef(){
        Cuchillo cuchillo;
        int i = random.nextInt(3);
        switch (i) {
            case 0:
                cuchillo = new CuchilloMadera();
                break;
            case 1:
                cuchillo = new CuchilloPiedra();
                break;
            default:
                cuchillo = new CuchilloHierro();
        }
        chef = Chef.instancia("Paco", 34, cuchillo);
    }

    /* Generar lista de todos los productos disponibles. */
    static void generarProductos(){
        productos = new ArrayList<>();
        productos.add(new Producto("Huevo", 4.0));
        productos.add(new Producto("Tocino", 7.0));
        productos.add(new Producto("Mayonesa", 5.0));
        productos.add(new Producto("Pollo", 6.0));
        productos.add(new Producto("Azucar", 4.0));
        productos.add(new Producto("Sake", 9.0));
        productos.add(new Producto("Tortilla", 2.0));
        productos.add(new Producto("Chile", 4.0));
        productos.add(new Producto("Queso", 5.0));
        productos.add(new Producto("Pescado", 10.0));
        productos.add(new Producto("Arroz", 2.0));
        productos.add(new Producto("Azucar", 5.0));
        productos.add(new Producto("Cebolla", 6.0));
        productos.add(new Producto("Soja", 4.0));
    }

    /* Genera una lista de clientes. */
    static void generarClientela(){
        clientes = new ArrayList<>();
        PlatilloEconomicoFactory platilloEconomico = new PlatilloEconomicoFactory();
        PlatilloCostosoFactory platilloCostoso = new PlatilloCostosoFactory();
        String nombre;
        Integer edad;
        List<Object> orden;
        for (int i = 0; i < 15; i++){
            nombre = "Cliente-" +(i+1);
            edad = random.nextInt(20) + 15;
            orden = new ArrayList<>();
            if (i < 10){
                orden.add(platilloEconomico.creaPlatillo());
                orden.add(platilloEconomico.creaPlatillo());
                orden.add(platilloCostoso.creaPlatillo());
            } else{
                orden.add(productos.get(random.nextInt(productos.size())));
                orden.add(productos.get(random.nextInt(productos.size())));
            }
            clientes.add(new Cliente(nombre, edad, orden));
        }
    }

    /* Inicia el servicio al cliente */
    static void iniciarServicio(){
        for (Cliente cliente : clientes) {
            chef.atenderCliente(cliente);
        }
    }

    public static void main(String[] args) {
        generarChef();
        generarProductos();
        generarClientela();
        
        chef.setProductos(productos);
        String msj = "";
        
        msj = chef.toString();
        logger.info(msj);
        
        iniciarServicio();
        
        msj = chef.toString();
        logger.info(msj);
    }
}