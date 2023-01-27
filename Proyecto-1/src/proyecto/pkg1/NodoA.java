/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

/**
 *
 * @author andre
 */
public class NodoA {
    private NodoV destino;
    private NodoA sig;
    private NodoA ant;
    private float peso;
    
    public NodoA(NodoV destino){
        this.destino=destino;
        this.sig=null;
        this.ant=null;
        this.peso=0;         
    }

    /**
     * @return the destino
     */
    public NodoV getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(NodoV destino) {
        this.destino = destino;
    }

    /**
     * @return the sig
     */
    public NodoA getSig() {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoA sig) {
        this.sig = sig;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the ant
     */
    public NodoA getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(NodoA ant) {
        this.ant = ant;
    }
    
}
