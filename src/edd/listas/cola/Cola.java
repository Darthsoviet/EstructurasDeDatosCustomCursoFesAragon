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
public class Cola<T> {
    
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamano;

    public Cola() {
        cabeza=null;
        cola=null;
        tamano=0;
                
    }
    
    public int getTamano(){
        return tamano;
    }
    
    public boolean esVacia(){
        return cabeza==null;
        }
    
    public void encolar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if(esVacia()){
            cabeza=nuevo;
            cola=nuevo;
            
        }else{
            cola.setSiguiente(nuevo);
            cola=nuevo;
        }
        tamano++;
    }
    
    public void desencolar(){
        if(esVacia()){
            if(cabeza==cola){
                cabeza=null;
                cola=null;
            }else{
                cabeza=cabeza.getSiguiente();
            }
            tamano--;
        }
    }
    
    public T frente(){
        if(esVacia()){
            return cabeza.getValor();
        }else{
            return null;
        }
    }
    }
    
    
    

