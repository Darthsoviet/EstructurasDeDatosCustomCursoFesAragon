/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.lineales.listaSimple;

import java.util.Date;

/**
 *
 * @author Micros 10
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private int numero;
    private String correo;
    private String Direccion;
    private Date cumpleaños;

    public Contacto(String nombre, String apellido, int numero, String correo, String Direccion, Date cumpleaños) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.correo = correo;
        this.Direccion = Direccion;
        this.cumpleaños = cumpleaños;
    }

    public Contacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Date cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    
    public void imprimeInformacion(){
        System.out.println("nombre "+ getNombre()+"apellido "+getApellido()+"numero "
        +getNumero()+"correo "+getCorreo()+ "direccion "+getDireccion()+"cumpleaños "+getCumpleaños());
    }
            
    
    
    
    
}
