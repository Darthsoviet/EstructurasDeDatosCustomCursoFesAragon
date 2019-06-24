/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.noLineales.arbol;

import java.io.File;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Pruebas {
    
    public static void main(String[] args) {
        
        Arbol ab=new Arbol();
        Nodo na=new Nodo("A");
        Nodo nb=new Nodo("B");
        Nodo nc=new Nodo("C");
        Nodo nd=new Nodo("D");
        Nodo ne=new Nodo("E");
        Nodo nf=new Nodo("F");
        Nodo ng=new Nodo("G");
        Nodo nh=new Nodo("H");
        
        ab.setRaiz(na);
        na.setIzq(nb);
        na.setDer(nc);
        
        nb.setIzq(nd);
        nb.setDer(ne);
        
       nd.setIzq(nh);
       nd.setDer(null);
       
       nh.setIzq(null);
       nh.setDer(null);
       
       ne.setDer(null);
       ne.setIzq(null);
       
       nc.setIzq(nf);
       nc.setDer(ng);
       
       nf.setIzq(null);
       nf.setDer(null);
       
       ng.setIzq(null);
       ng.setDer(null);
       
       ab.preorden();
        System.out.println("------------------------");
       ab.inorden();
        System.out.println("------------------------");
       ab.postorden();
       
       Arbol arbol=new Arbol();
       
       Nodo n1=new Nodo("+");
       Nodo n2=new Nodo("a");
       Nodo n3=new Nodo("^");
       Nodo n4=new Nodo("b");
       Nodo n5=new Nodo("c");
       
       arbol.setRaiz(n1);
       n1.setDer(n3);
       n1.setIzq(n2);
       n3.setDer(n5);
       n3.setIzq(n4);
        
        arbol.inorden();
        System.out.println("-------------");
        arbol.postorden();
        System.out.println("-----------------");
        arbol.preorden();
        
        
        double raizAleatoria = Math.random()*100000+1;
        int raiz=(int)raizAleatoria;
        
        Nodo nr=new Nodo(raiz);
        Nodo niz=new Nodo();
        Nodo nAux=new Nodo();
        Nodo ncen=new Nodo();
        System.out.println("----------------------------");
        
        Arbol ar=new Arbol();
        ar.setRaiz(nr);
        
        for (int i = 0; i < 100; i++) {
            double j = Math.random() * 100000 + 1;
            int numeroActual = (int) j;
            int cont = 0;
            int numeroAnterior = 0;

            //primer if else solo se ejecuta UNA vez
            if (numeroActual <= raiz && cont == 0) {
                niz.setValor(numeroActual);
                nr.setIzq(niz);
                cont++;
                nAux = niz;
            } else if (numeroActual >= raiz && cont == 0) {
                niz.setValor(numeroActual);
                nr.setDer(niz);
                cont++;
                nAux = niz;
            }
            /**
             * se ejecuta numerosas veces
             */
            if (numeroActual <= numeroAnterior && cont != 0) {
                niz.setValor(numeroActual);
                nAux.setIzq(nAux);
                nAux = niz;
            } else if (numeroActual >= numeroAnterior) {
                niz.setValor(numeroActual);
                nAux.setDer(niz);
                nAux = niz;
            }

            

        }
        ar.inorden();
    }
        
}
