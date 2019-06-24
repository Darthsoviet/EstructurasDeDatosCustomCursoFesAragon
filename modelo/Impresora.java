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
package edd.modelo;

import java.util.Random;

/**
 *
 * @author Micros 02
 */
public class Impresora {

    private int tipoImp;
    private int velocidad; //Hojas por minuto

    public Impresora() {
    }

    public Impresora(int tipoImp) {
        this.tipoImp = tipoImp;
        this.velocidad = new Random().nextInt(20) + 10;
    }

    public int getTipoImp() {
        return tipoImp;
    }

    public void setTipoImp(int tipoImp) {
        this.tipoImp = tipoImp;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float imprime(Archivo a) {
        return (a.getNumHojas() / this.velocidad) * 60;
    }

}
