package examenfinalparte1;

/**
 *  Clase con los metodos que vamos a llamar en la clase main y el metodo base
 *  La clase contiene tres constructores que reciben diferentes variables y en funcion a eso, realizaran diferentes operaciones
 *  Contiene un metodo llamado Suma que sera usado para realizar las operaciones en los constructores
 * @author jgarciaamor
 */
public class ClaseOperacion {

    int result;

    /**
     * Constructor que recibe dos variables de tipo int, llamadas num1 y num2, y cambia el valor de result; no devuelve nada
     * Le asigna a result la operacion Suma con num1 y num2, es decir, la suma de las dos variables
     * @param num1 Primera variable de tipo int que recibe el metodo
     * @param num2 Segunda variable de tipo int que recibe el metodo
     */
    public ClaseOperacion(int num1, int num2) {
        result = Suma(num1, num2);
    }
    /**
    * Constructor que recibe una variable de tipo int, valor, y cambia el valor de result; no devuelve nada 
    * Le asigna a result la operacion Suma con valor dos veces, es decir, suma la misma variable consigo misma
    * @param num Unica variable de tipo int que recibe el metodo y que se sumara dos veces
    */
    public ClaseOperacion(int num) {
        result = Suma(num, num);
    }
/**
 * Constructor vacio que no recibe ninguna variable y no devuelve nada, lo unico que hace es asignarle a la variable result el valor -1
 */
    public ClaseOperacion() {
        result = -1;
    }
/**
 * Metodo que recibe dos variables (x e y) y nos devuelve un tipo int con la suma de los dos
 * Va a ser llamado en el resto de metodos para realizar las operaciones
 * @param x Variable de tipo int que recibe el metodo
 * @param y Variable de tipo int que recibe el metodo
 * @return El metodo nos devuelve un tipo int con la suma de las dos variables
 */
    public int Suma(int x, int y) {
        return x + y;
    }
}


