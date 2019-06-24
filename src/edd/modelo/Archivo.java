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

/**
 *
 * @author Micros 02
 */
public class Archivo {

    private String nombre;
    private int numHojas;
    private float peso;
    private int tipoImp;

    public Archivo() {
    }

    public Archivo(String nombre, int numHojas, float peso, int tipoImp) {
        this.nombre = nombre;
        this.numHojas = numHojas;
        this.peso = peso;
        this.tipoImp = tipoImp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHojas() {
        return numHojas;
    }

    public void setNumHojas(int numHojas) {
        this.numHojas = numHojas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getTipoImp() {
        return tipoImp;
    }

    public void setTipoImp(int tipoImp) {
        this.tipoImp = tipoImp;
    }

    
    public void imprimeDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Hojas: " + this.numHojas);
        System.out.println("Peso: " + this.peso + " KB");
        
        switch (this.tipoImp) {
            case TipoImpresion.COLOR:
                System.out.println("Tipo de imp.: COLOR");
                break;
            case TipoImpresion.BN:
                System.out.println("Tipo de imp.: Blanco y negro");
                break;
            case TipoImpresion.LASER:
                System.out.println("Tipo de imp.: LASER");
                break;
            default:
                break;
        }
        
        
    }
}
