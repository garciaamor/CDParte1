package examenfinalparte1;

/**
 *  Clase con los metodos que vamos a llamar en la clase main y el metodo base
 * Las tres clases se llaman Principal, pero se diferencian en el numero de variables que reciben
 * @author jgarciaamor
 */
public class Principal {

    int i;

    /**
     * Metodo que recibe dos variables de tipo int, llamadas j y m, y cambia el valor de i; no devuelve nada
     * Le asigna a i la operacion met con j y m, es decir, la suma de las dos variables
     * @param j Primera variable de tipo int que recibe el metodo
     * @param m Segunda variable de tipo int que recibe el metodo
     */
    public Principal(int j, int m) {
        i = met(j, m);
    }
    /**
    * Metodo que recibe una variable de tipo int, j y cambia el valor de i; no devuelve nada 
    * Le asigna a i la operacion met con j dos veces, es decir, suma la misma variable consigo misma
    * @param j Unica variable de tipo int que recibe el metodo y que se sumara dos veces
    */
    public Principal(int j) {
        i = met(j, j);
    }
/**
 * Metodo que no recibe ninguna variable y no devuelve nada, lo unico que hace es asignarle a la variable i el valor -1
 */
    public Principal() {
        i = -1;
    }
/**
 * Metodo que recibe dos variables (x y x1) y nos devuelve un tipo int con la suma de los dos
 * Va a ser llamado en el resto de metodos para realizar las operaciones
 * @param x Variable de tipo int que recibe el metodo
 * @param x1 Variable de tipo int que recibe el metodo
 * @return El metodo nos devuelve un tipo int con la suma de las dos variables
 */
    public int met(int x, int x1) {
        return x + x1;
    }
}


