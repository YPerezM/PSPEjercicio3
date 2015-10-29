/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yperezmartinez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Threads t1=new Threads("Hilo Uno");
        Threads t2=new Threads("Hilo Dos");
        Threads t3=new Threads("Hilo Tres");
        Threads t4=new Threads("Hilo Cuatro");
        Threads t5=new Threads("Hilo Cinco");
        
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
            t5.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
