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
package edd.pruebas;

import edd.excepciones.PosicionIlegalException;
import edd.listas.listaSimple.ListaSimple;
import edd.modelo.Contacto;
import edd.modelo.Simulacion;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Micros 02
 */
public class Pruebas {
    
//    public static void main(String[] args) {
//        ListaSimple<Contacto> listaContactos;
//        listaContactos = new ListaSimple<>();
//        
//        Contacto c = new Contacto();
//        c.setNombre("Nora");
//        c.setApellido("Tellez");
//        c.setCorreo("ntelles@aragon.unam.mx");
//        c.setDireccion("Rancho Seco 52");
//        c.setNumero(1234567890);
//        c.setCumple(new Date(1990, 5, 12));
//        
//        
//        listaContactos.insertar(c);
//        
//        try {
//            listaContactos.getInformacion(0).imprimeInfo();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        
//    }
    
        public static void main(String[] args) {
            
            Simulacion s = new Simulacion();
            
            Timer t = new Timer();
            t.schedule(new TimerTask() {
                @Override
                public void run() {
                    s.tiempo();
                    System.out.println("1");
                }
            }, 10, new Random().nextInt(1000)+1000);
        }
}
    
  
