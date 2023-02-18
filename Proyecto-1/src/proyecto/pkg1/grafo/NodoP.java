/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

/**
 *
 * @author andre
 */
public class NodoP {
    
     private int stock;
    private String nameP;
    private NodoP before;
    private NodoP next;
    

    public NodoP(String nameP, int stock) {
        this.nameP = nameP;
        this.stock = stock;
        this.before = null;
        this.next = null;
    }
    
    
    public boolean enoughStock(int numPedido){
        if (this.getStock() > 0){
            if(this.getStock() < numPedido){
                return false;
            } else if (this.getStock() > numPedido){
                return true;
            }
        } 
        return false;
    
    } //Procedimiento para chequear si hay suficiente stock
    
    public void addStock (int nuevoStock){
        this.setStock(this.getStock() + nuevoStock);
    
    } //Procedimiento para agregar mas stock de un producto
    //Nodo del Producto

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the nameP
     */
    public String getNameP() {
        return nameP;
    }

    /**
     * @param nameP the nameP to set
     */
    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    /**
     * @return the before
     */
    public NodoP getBefore() {
        return before;
    }

    /**
     * @param before the before to set
     */
    public void setBefore(NodoP before) {
        this.before = before;
    }

    /**
     * @return the next
     */
    public NodoP getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoP next) {
        this.next = next;
    }
    
}
