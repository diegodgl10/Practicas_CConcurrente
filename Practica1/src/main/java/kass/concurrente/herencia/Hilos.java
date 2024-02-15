package kass.concurrente.herencia;

import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase, debes crear un contador extendiendo de la clase Thread
 * @author Kassandra Mirael
 * @version 1.1
 */
public class Hilos extends Thread {
    // Numero de hilos.
    public static final Integer HILOS = 10;
    // Contador de la operacion.
    public static Integer contador = 0;
    // Numero total de rondas.
    public static final Integer RONDAS = 10000;

    /**
     * Metodo run de la clase Thread.
     */
    @Override
    public void run() {
        System.out.println("Hola soy el hilo: "+ Thread.currentThread().getName());
        synchronized(this){
            for(int i = 0; i< RONDAS; ++i){
                contador++;
            }
        }
        /*
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> lHilos = new ArrayList<>();
        System.out.println("Contador: " + Integer.toString(contador));
        for (int i = 0; i < HILOS; i++){
            lHilos.add(new Hilos());   
        }
        for (Thread t : lHilos) {
            t.start();
        }
        for (Thread t : lHilos) {
            t.join();
        }
        System.out.println("Contador: " + Integer.toString(contador));
    }
}
