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
        ClaseOperacion constr1 = new ClaseOperacion(10, 20);
        /**
         * Se declara una variable de tipo int llamada result1 y se le asigna la funcion result del objeto constr1
         */
        int result1 = constr1.result;
        /**
         * Mostramos por pantalla la variable de tipo int result1 declarada y asignada anteriormente
         */
        System.out.println("Es: " + result1);
        
        
        ClaseOperacion constr2 = new ClaseOperacion(10);
        int result2 = constr2.result;
        System.out.println("Es: " + result2);
        
        
        ClaseOperacion constr3 = new ClaseOperacion();
        int result3 = constr3.result;
        System.out.println("Es: " + result3);
    }
}
