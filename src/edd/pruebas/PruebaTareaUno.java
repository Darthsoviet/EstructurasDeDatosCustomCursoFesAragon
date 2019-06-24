/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.pruebas;

import edd.exccepciones.posicionIlegalException;
import edd.lineales.listaSimple.ListaSimple;
import edd.lineales.listaSimple.Materiales;

/**
 *
 * @author Maritza vazquez
 */
public class PruebaTareaUno {
    public static void main(String args[]) throws posicionIlegalException{
         ListaSimple<Materiales> listaMateriales;
         listaMateriales = new ListaSimple();
         
            Materiales a = new Materiales("Calentamiento","Baño Maria de Cobre",0,true,10);
            Materiales b = new Materiales("Calentamiento","Mechero Fischer",0,true,1);
            Materiales c = new Materiales("Calentamiento","Triple de fierro",0,true,13);
            Materiales e = new Materiales ("Volumetrico","Matraz balon",25,true,4);
            Materiales f = new Materiales ("Volumetrico","Matraz balon",50,true,5);
            Materiales g = new Materiales ("Volumetrico","Matraz de kitazato",500,true,11);
            Materiales h = new Materiales ("Medicion","Cronometros",0,true,22);
            Materiales i = new Materiales ("Medicion","Flexometro",3,true,6);
            Materiales j = new Materiales ("Medicion","Multimetros",35,true,9);
                 
            Materiales k = new Materiales ("Soporte y sujecion","Gradilla de madera",10,true,1);     
            Materiales l = new Materiales ("Soporte y sujecion","Pinzas de prensa",0,true,8);
            Materiales m = new Materiales ("Soporte y sujecion","Pinzas de mosh",0,true,25);
            Materiales n = new Materiales ("Separacion y sujecion","Embudo de plastico cuello corto",0,true,27);
            Materiales o = new Materiales ("Separacion y sujecion","Embudos de gooch de porcelana",0,true,2);
            Materiales p = new Materiales ("Separacion y sujecion","Hojas de papel filtro poro medio",0,true,180);
            Materiales q = new Materiales ("Microbiologia","Agujas de diseccion",0,true,63);
            Materiales r = new Materiales("Microbiologia","Cubrebocas de color",0,true,200);
            Materiales s = new Materiales();
            s.setTipo("microbiologia");
            s.setModelo("exactos");
            s.setSerie(0);
            s.setFuncion(true);
            s.setNumeroInventario(50);
            //se insertan lo objetod
            listaMateriales.insertar(a);
            listaMateriales.insertar(b);
            listaMateriales.insertar(c);
            listaMateriales.insertar(e);
            listaMateriales.insertar(f);
            listaMateriales.insertar(g);
            listaMateriales.insertar(h);
            listaMateriales.insertar(i);
            listaMateriales.insertar(j);
            listaMateriales.insertar(k);
            listaMateriales.insertar(l);
            listaMateriales.insertar(m);
            listaMateriales.insertar(n);
            listaMateriales.insertar(o);
            listaMateriales.insertar(p);
            listaMateriales.insertar(q);
            listaMateriales.insertar(r);
            listaMateriales.insertar(s);
            
            for(int x=0;x<=listaMateriales.getTamano();x++){
              listaMateriales.getInformacion(x).imprimeDatos();

            }
            
            
        
    
    }
    
}
