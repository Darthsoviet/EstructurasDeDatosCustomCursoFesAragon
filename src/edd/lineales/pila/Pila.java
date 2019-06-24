/**
 *
 * Manual de practicas de Estructuras de Datos
 * Jose Eduardo Sanchez Posadas
 * Universidad Nacional Autonoma de Mexico
 * Facultad de Estudios Superiores Aragon
 * Ingenieria en Computacion
 * Capitulo:
 * Practica:
 * */
package edd.lineales.pila;

/**
 *
 * @author josee
 */
public class Pila<T> {

    private Nodo<T> cabeza;
    private int tamano;

    public Pila() {
        this.cabeza = null;
        tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void apilar(T valor) {
        Nodo<T> nuevo = new Nodo<>();
        nuevo.setValor(valor);

        if (esVacia()) {
            cabeza = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
        tamano++;
    }

    public void retirar() {
        if (!esVacia()) {
            cabeza = cabeza.getSiguiente();
            tamano--;
        }
    }

    public T cima() {
        if (!esVacia()) {
            return cabeza.getValor();
        } else {
            return null;
        }
    }

}
