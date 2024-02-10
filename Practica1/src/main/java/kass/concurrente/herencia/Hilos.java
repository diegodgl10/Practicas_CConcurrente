package kass.concurrente.herencia;

import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase, debes crear un contador extendiendo de la clase Thread
 * @author Kassandra Mirael
 * @version 1.1
 */
public class Hilos extends Thread {
    public static final Integer HILOS = 3;

    // Metodo run de la clase Thread
    @Override
    public void run() {
        System.out.println("Hola soy el hilo: "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Hilos h = new Hilos();
        Integer tHilos = 10;
        List<Thread> lHilos = new ArrayList<>();
        Thread thread;
        for (int i = 0; i < tHilos; i++){
            thread = new Thread(h, Integer.toString(i));
            lHilos.add(thread);   
        }
        for (Thread t : lHilos) {
            t.start();
        }
        for (Thread t : lHilos) {
            t.join();
        }
    }
}
