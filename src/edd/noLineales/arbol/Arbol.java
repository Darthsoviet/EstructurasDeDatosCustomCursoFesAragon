/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.noLineales.arbol;

/**
 *
 * @author Admin
 */
public class Arbol {

    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void preorden() {
        preorden(raiz);
    }

    private void preorden(Nodo aux) {
        if (aux != null) {
            visitar(aux);
            preorden(aux.getIzq());
            preorden(aux.getDer());
        }
    }

    private void visitar(Nodo aux) {
        System.out.println(aux.getValor() + " ");
    }

    public void inorden() {
        inorden(raiz);
    }

    private void inorden(Nodo aux) {
        if (aux != null) {
            inorden(aux.getIzq());
            visitar(aux);
            inorden(aux.getDer());
        }
    }

    public void postorden() {
        postorden(raiz);
    }

    private void postorden(Nodo aux) {
        if (aux != null) {
            postorden(aux.getIzq());
            postorden(aux.getDer());
            visitar(aux);
        }
    }

}
