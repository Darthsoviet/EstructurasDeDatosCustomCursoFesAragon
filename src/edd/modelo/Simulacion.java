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

import edd.listas.cola.Cola;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Micros 02
 */
public class Simulacion {

    private Impresora color, bn, laser;
    private DispTermn dt1, dt2, dt3, dt4, dt5, dt6;
    private Cola<Archivo> colaImpresion = new Cola<>();

    public Simulacion() {

        color = new Impresora(TipoImpresion.COLOR);
        bn = new Impresora(TipoImpresion.BN);
        laser = new Impresora(TipoImpresion.LASER);

        dt1 = new DispTermn("PC1");
        dt2 = new DispTermn("LAP");
        dt3 = new DispTermn("CEL");
        dt4 = new DispTermn("TBL");
        dt5 = new DispTermn("PC2");
        dt6 = new DispTermn("PC3");

    }

    public Impresora getColor() {
        return color;
    }

    public void setColor(Impresora color) {
        this.color = color;
    }

    public Impresora getBn() {
        return bn;
    }

    public void setBn(Impresora bn) {
        this.bn = bn;
    }

    public Impresora getLaser() {
        return laser;
    }

    public void setLaser(Impresora laser) {
        this.laser = laser;
    }

    public DispTermn getDt1() {
        return dt1;
    }

    public void setDt1(DispTermn dt1) {
        this.dt1 = dt1;
    }

    public DispTermn getDt2() {
        return dt2;
    }

    public void setDt2(DispTermn dt2) {
        this.dt2 = dt2;
    }

    public DispTermn getDt3() {
        return dt3;
    }

    public void setDt3(DispTermn dt3) {
        this.dt3 = dt3;
    }

    public DispTermn getDt4() {
        return dt4;
    }

    public void setDt4(DispTermn dt4) {
        this.dt4 = dt4;
    }

    public DispTermn getDt5() {
        return dt5;
    }

    public void setDt5(DispTermn dt5) {
        this.dt5 = dt5;
    }

    public DispTermn getDt6() {
        return dt6;
    }

    public void setDt6(DispTermn dt6) {
        this.dt6 = dt6;
    }

    public Cola<Archivo> getColaImpresion() {
        return colaImpresion;
    }

    public void setColaImpresion(Cola<Archivo> colaImpresion) {
        this.colaImpresion = colaImpresion;
    }

    public void tiempo() {
        int dt = new Random().nextInt(5) + 1;

        switch (dt) {
            case 1:
                {
                    Archivo i = this.dt1.imprime();
                    System.out.println("-------ARCHIVO EN COLA-------");
                    i.imprimeDatos();
                    this.colaImpresion.encolar(i);
                    
                    break;
                }
            case 2:
                {
                    Archivo i = this.dt2.imprime();
                    System.out.println("-------ARCHIVO EN COLA-------");
                    i.imprimeDatos();
                    this.colaImpresion.encolar(i);
                    break;
                }
            case 3:
                {
                    Archivo i = this.dt3.imprime();
                    System.out.println("-------ARCHIVO EN COLA-------");
                    i.imprimeDatos();
                    this.colaImpresion.encolar(i);
                    break;
                }
            case 4:
                {
                    Archivo i = this.dt4.imprime();
                    System.out.println("-------ARCHIVO EN COLA-------");
                    i.imprimeDatos();
                    this.colaImpresion.encolar(i);
                    break;
                }
            case 5:
                {
                    Archivo i = this.dt5.imprime();
                    System.out.println("-------ARCHIVO EN COLA-------");
                    i.imprimeDatos();
                    this.colaImpresion.encolar(i);
                    break;
                }
            case 6:
                {
                    Archivo i = this.dt6.imprime();
                    System.out.println("-------ARCHIVO EN COLA-------");
                    i.imprimeDatos();
                    this.colaImpresion.encolar(i);
                    break;
                }
            default:
                break;
        }

    }

}
