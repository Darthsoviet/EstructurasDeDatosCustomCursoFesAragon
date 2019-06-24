/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.listas.cola;

/**
 *
 * @author Micros 14
 */
public class Nodo<T> {
    private T valor;
    private Nodo<T> siguiente;

    public Nodo() {
        valor = null;
        siguiente=null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
   
    
    
}
