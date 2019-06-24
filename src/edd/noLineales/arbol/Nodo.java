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
public class Nodo {
    private Object valor;
    private Nodo izq;
    private Nodo der;

    public Nodo() {
        this.valor=null;
        this.izq=null;
        this.der=null;
    }

    public Nodo(Object valor) {
        this.valor = valor;
        this.izq=null;
        this.der=null;
        
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    
}
