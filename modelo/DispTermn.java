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
public class DispTermn {

    private String nombre;

    public DispTermn() {
    }

    public DispTermn(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Archivo imprime() {

        Archivo a = new Archivo();
        a.setNombre("File" + new Random(10).nextInt(100) + ".f");
        a.setNumHojas(new Random().nextInt(100));
        a.setPeso(new Random().nextFloat() * 1000);
        a.setTipoImp(new Random().nextInt(2));

        return a;
    }

}
