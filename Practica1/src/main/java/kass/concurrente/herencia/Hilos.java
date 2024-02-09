package kass.concurrente.herencia;

import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase, debes crear un contador extendiendo de la clase Thread
 * @author Kassandra Mirael
 * @version 1.1
 */
public class Hilos extends Thread {
    // Lista de hilos
    static List<Thread> lHilos = new ArrayList<>();

    // Metodo run de la clase Thread
    @Override
    public void run() {
        System.out.println("Hola soy el: "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        int nHilos = 10;
        Hilos h = new Hilos();
        Thread thread;
        for (int i = 0; i < nHilos; i++){
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
