/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author yago
 */
public class Threads extends Thread{
    String nombre; 
    Thread t;

    Threads(String threadname) {
        nombre = threadname;
        t = new Thread(this, nombre);
        System.out.println("Comenzando Nuevo Hilo: " + nombre);
        t.start(); // Inicia el hilo
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(nombre + ": procesando");
                sleep((long) (Math.random()*600+100));
            }
        } catch (InterruptedException e) {
            System.out.println(nombre + " interrumpido.");
        }
        System.out.println(nombre + " terminado.");
    }
}
