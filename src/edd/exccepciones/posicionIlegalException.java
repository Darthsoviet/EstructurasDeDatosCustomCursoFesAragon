/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.exccepciones;

/**
 *
 * @author Micros 10
 */
public class posicionIlegalException extends Exception {

    public posicionIlegalException() {
        super("posicion no permitida en la lista. Fuera de limite");
    }
    
    
}
