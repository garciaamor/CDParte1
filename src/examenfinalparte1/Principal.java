package examenfinalparte1;

import java.io.IOException;

/**
 * Clase Principal del proyecto, que contiene el main
 * Crea objetos a partir de los constructores de la ClaseOperacion y va asignandole valores a las variables que recibe
 * @author jgarciaamor
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        /**
         * Crea un objeto de tipo ClaseOperacion, llamado constr1, que recibe dos variables (10 y 20)
         * Lo que nos indica que llama al constructor que realiza la suma con dos variables distintas (10+20)
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
        /**
         * Crea un objeto de tipo ClaseOperacion, llamado constr2, que recibe una sola variable (10)
         * Esto indica que este objeto llama al constructor que suma una variable consigo misma (10+10)
         */
        
        ClaseOperacion constr2 = new ClaseOperacion(10);
        /**
         * Se declara una variable de tipo int llamada result2 y se le asgina la funcion result del objeto constr2
         */
        int result2 = constr2.result;
        /**
         * Mostramos por pantalla la variable de tipo int result2 declarada y asignada previamente
         */
        System.out.println("Es: " + result2);
        /**
         * Crea un objeto de tipo ClaseOperacion, llamado constr3, que no recibe ninguna variable
         * Al no recibir nada, sabemos que se trata del constructor que asigna el valor -1 al resultado
         */
        
        ClaseOperacion constr3 = new ClaseOperacion();
        /**
         * Se declara una variable de tipo int llamada result3 y se le asgina la funcion result del objeto constr3
         */
        int result3 = constr3.result;
        /**
         * Mostramos por pantalla la variable de tipo int result3 declarada y asignada previamente
         */
        System.out.println("Es: " + result3);
    }
}
