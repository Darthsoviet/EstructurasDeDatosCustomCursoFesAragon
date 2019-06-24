/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.pruebas;

import edd.lineales.pila.Pila;
import javax.swing.JOptionPane;

/**
 *
 * @author Micros 10
 */
public class Pruebas1 extends Object {
//   public static void main(String[] args) {
//        ListaSimple<Contacto> listaContactos;
//       listaContactos= new ListaSimple();
//             Contacto c= new Contacto("ivan", "lujan", 5556636, "verduraDeOro@gmail.com","tepito", null);
//            c.imprimeInformacion();
//    }

    public static void main(String[] args) {

        Pila<Character> pilaOp = new Pila<>();
        Pila<Character> pilaPar = new Pila<>();

        String cadena = JOptionPane.showInputDialog(null, "Insertar expresion",
                "PILAS", JOptionPane.QUESTION_MESSAGE);
        if (cadena.charAt(0) != ')') {
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == '(') {

                    pilaPar.apilar(cadena.charAt(i));
                    System.out.println("Apila");

                } else if (cadena.charAt(i) == ')' 
                        && pilaPar.cima() != null
                        && pilaPar.cima()=='(' 
                        && !pilaPar.esVacia()) {
                    System.out.println("Retira");
                    pilaPar.retirar();
                } else if (pilaPar.cima() == null && cadena.charAt(i) == ')' && pilaPar.esVacia()) {

                    pilaPar.apilar(cadena.charAt(i));
                } else {
                    pilaOp.apilar(cadena.charAt(i));

                }
            }
            if (pilaPar.esVacia()) {
                JOptionPane.showMessageDialog(null, "Parentesis balanceados",
                        "Parentesis", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Parentesis no balanaceados"
                        , "Parentesis", JOptionPane.ERROR_MESSAGE);
            }

        } else {
                JOptionPane.showMessageDialog(null,"parentesis no balanceados",
                        "parentesis",JOptionPane.ERROR_MESSAGE);
        }
    }
}
