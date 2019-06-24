/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.lineales.listaSimple;

/**
 *
 * @author Micros 14
 */
public class Materiales {
    private String tipo;
    private String modelo;
    private int serie;
    private boolean funcion;
    private int numeroInventario;

    public Materiales(String tipo, String modelo, int serie, boolean funcion, int numeroInventario) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.serie = serie;
        this.funcion = funcion;
        this.numeroInventario = numeroInventario;
    }
    
    

    public Materiales() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public boolean getFuncion() {
        return funcion;
    }

    public void setFuncion(boolean funcion) {
        this.funcion = funcion;
    }

    public int getNumeroInventario() {
        return numeroInventario;
    }

    public void setNumeroInventario(int numeroInventario) {
        this.numeroInventario = numeroInventario;
    }
    
    public void imprimeDatos(){
        System.out.println("tipo: "+getTipo());
        System.out.println("modelo: "+getModelo());
        System.out.println("numero de serie: "+getSerie());
        System.out.println("Funcion: "+getFuncion());
        System.out.println("numero en el inventario: "+getNumeroInventario());
    }
    
}
