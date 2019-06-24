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

import java.util.Date;

/**
 *
 * @author Micros 02
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private int numero;
    private String correo;
    private String direccion;
    private Date cumple;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido, int numero, String correo, String direccion, Date cumple) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.correo = correo;
        this.direccion = direccion;
        this.cumple = cumple;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getCumple() {
        return cumple;
    }

    public void setCumple(Date cumple) {
        this.cumple = cumple;
    }
    
    public void imprimeInfo(){
        System.out.println("Nombre: " + this.nombre +" "+ this.apellido);
        System.out.println("Numero: " + this.numero);
        System.out.println("Direccion: "+ this.direccion);
        System.out.println("Correo: " + this.correo);
        System.out.println("Cumpleaños: "+this.cumple.toString());
    }
}
