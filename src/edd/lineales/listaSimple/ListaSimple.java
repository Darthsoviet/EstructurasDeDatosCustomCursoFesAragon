/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.lineales.listaSimple;

import edd.exccepciones.posicionIlegalException;

/**
 *
 * @author Micros 10
 * @param <Tipo>
 */
public class ListaSimple<Tipo> {
    private Nodo<Tipo> cabeza;
    private int tamano;
/**inicializa
 * la lista
 * simple
 */
    public ListaSimple() {
        cabeza=null;
        tamano=0;
    }
    
    
    //metodos
    public int getTamano(){
        return tamano;
    }
    
    public boolean esVacia(){
        if (cabeza==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertar(Tipo informacion){
        Nodo<Tipo> nuevo=new Nodo<Tipo>();
        nuevo.setInformacion(informacion);
        
        if(esVacia()){
            cabeza=nuevo;
        }else{
            Nodo<Tipo> aux = cabeza;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamano++;
    }
    
    public void insertar(Tipo informacion, int pos)throws posicionIlegalException{
   if (pos>=0 && pos<=tamano){
       Nodo<Tipo> nuevo= new Nodo<Tipo>();
       nuevo.setInformacion(informacion);
       if(pos==0){
           nuevo.setSiguiente(cabeza);
           cabeza=nuevo;
       }else{
           if(pos==tamano){
               Nodo<Tipo> aux = cabeza;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
           }
               Nodo<Tipo> aux=cabeza;
               
               for(int i=0;i<=pos-2;i++){
                   aux =aux.getSiguiente();
               }
           }
           tamano++;
       }else{
               throw new posicionIlegalException();
       }
       
   }
    
    public Tipo getInformacion(int pos) throws posicionIlegalException{
        if(pos>=0 && pos <= tamano){
    Tipo informacion;
    if (pos==0){
informacion= cabeza.getInformacion();
return informacion;
}else{
        Nodo<Tipo> aux= cabeza;
        for(int i=0;i<=pos-1;i++){
            aux=aux.getSiguiente();
        }
        informacion=aux.getInformacion();
    }
    return informacion;
        
    }else{
            throw new posicionIlegalException();
    }
    
}
    
    public void remover(int pos)throws posicionIlegalException{
        if(pos>=0 && pos<=tamano){
            if (pos==0){
                cabeza=cabeza.getSiguiente();
                tamano--;
            }else{
                Nodo<Tipo> aux=cabeza;
                for(int i=0;i<=pos-2;i++){
                   aux =aux.getSiguiente();
               }
                Nodo<Tipo> prox=aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamano--;
                
            }
        }else{
            throw new posicionIlegalException();
        }
    }
    
    public void limpiar(){
        cabeza=null;
        tamano=0;
    }
}

