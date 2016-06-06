package examenfinalparte1;

import java.io.IOException;

/**
 * Clase Principal del proyecto, que contiene el main
 * @author jgarciaamor
 */
public class Prin {

    public static void main(String[] args) throws IOException {
        Principal obj = new Principal(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        Principal nm = new Principal(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        Principal mn = new Principal();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }
}
