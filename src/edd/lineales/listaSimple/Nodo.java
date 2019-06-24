/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.lineales.listaSimple;

/**
 *
 * @author Del villar Lujan Ivan Andres Alexis
 * @param <Tipo>
 */
public class Nodo<Tipo> {
    
    private Tipo informacion;
    private Nodo<Tipo> siguiente;

    public Nodo() {
        informacion=null;
        siguiente=null;
        
    }

    public Tipo getInformacion() {
        return informacion;
    }

    public void setInformacion(Tipo informacion) {
        this.informacion = informacion;
    }

    public Nodo<Tipo> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<Tipo> siguiente) {
        this.siguiente = siguiente;
    }
    
}
