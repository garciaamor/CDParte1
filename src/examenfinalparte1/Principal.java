package examenfinalparte1;

import java.io.IOException;

/**
 * Clase Principal del proyecto, que contiene el main
 * @author jgarciaamor
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        /**
         * Crea un objeto de tipo ClaseOperacion, llamado sum2v, que recibe dos variables (10 y 20)
         * Lo que nos indica que llama al constructor que realiza la suma con dos variables distintas
         */
        ClaseOperacion sum2v = new ClaseOperacion(10, 20);
        /**
         * 
         */
        int sum2 = sum2v.result;
        System.out.println("Es: " + sum2);
        
        
        ClaseOperacion nm = new ClaseOperacion(10);
        int m = nm.result;
        System.out.println("Es: " + m);
        
        
        ClaseOperacion mn = new ClaseOperacion();
        int nn = mn.result;
        System.out.println("Es: " + nn);
    }
}
