/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.noLineales.grafo;

/**
 *
 * @author Admin
 */
public class Pruebas {
    
    public static void main(String[] args) {
        GrafoMatriz g=new GrafoMatriz(7);
        g.nuevoVertice("A");
        g.nuevoVertice("B");
        g.nuevoVertice("C");
        g.nuevoVertice("D");
        g.nuevoVertice("E");
        g.nuevoVertice("F");
        g.nuevoVertice("G");
        
        try{
           g.nuevoArco("A", "B");
           g.nuevoArco("B", "A");
           
           g.nuevoArco("A", "E");
           g.nuevoArco("E", "A");
           
           g.nuevoArco("B", "E");
            g.nuevoArco("E", "B");
            
             g.nuevoArco("B", "C");
              g.nuevoArco("C", "B");
              
               g.nuevoArco("E", "C");
                g.nuevoArco("C", "E");
                
                 g.nuevoArco("C", "G");
                  g.nuevoArco("G", "C");
                          
                           g.nuevoArco("G", "F");
                            g.nuevoArco("F", "G");
                            
                             g.nuevoArco("G", "D");
                              g.nuevoArco("D", "G");
        }catch(Exception e){
            e.printStackTrace();
            
        }
        System.out.println("VERTICES");
        System.out.println(g.imprimirVertices());
        
        System.out.println("MATRIZ");
        System.out.println(g.imprimirMatriz());
    }
    
}
