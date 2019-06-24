/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.lineales.pila;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Parentesis{

    public static void main(String[] args) {
        parentesis();
    }

    public static void parentesis() {
        
        String cadena = JOptionPane.showInputDialog("Insertar expresion ");
        Stack pila = new Stack();
        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i)=='{' ) {
                if (cadena.charAt(i) == ')' && pila.peek() == "(") {
                    pila.pop();
                
                } else if (cadena.charAt(i) == ')' && pila.peek().equals('(')) {
                    pila.pop();
                } else if (cadena.charAt(i) == ']' && pila.peek().equals("[")) {
                    pila.pop();
                
                } else if (cadena.charAt(i) == '}' && pila.peek().equals("{")) {
                    pila.pop();
                }

            }
           
                
            }
            if (pila.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Parentesis balanceados \n" + cadena);
            } else {
                JOptionPane.showMessageDialog(null, "Parentesis no balanceados \n" + cadena);
            }
        }
    }