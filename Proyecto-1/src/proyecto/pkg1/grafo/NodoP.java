/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

/**
 * Esta clase define los nodos que guardan la informacion de los productos con su inventario
 * @author Haidar Bazzi
 * @version 24/02/2022
 */
public class NodoP {
    
    //Campos de la clase
     private int stock;
    private String nameP;
    private NodoP before;
    private NodoP next;
    
    /**
    * Constructor para los nodos de los productos
    * @param nameP, Nombre del producto
    * @param stock, Numero de items del producto presentes en el stock
    */

    public NodoP(String nameP, int stock) {
        this.nameP = nameP;
        this.stock = stock;
        this.before = null;
        this.next = null;
    }
    // Cierre del constructor
    
    /**
    * Metodo que genera una cadena con todos los atributos del objeto
    * @return Una cadena con el nombre y numero de stock del producto almacenado en el nodo
    */
    public String PrintProduct(){
        String cadena = "";
        cadena += "Nombre del producto: " + nameP + "\n" + "Stock del producto: " + Integer.toString(stock);
        return cadena;
    }
    
    /**
    * Metodo que revisa si hay suficiente inventario del producto partiendo de una cantidad pedida
    * @param numPedido La cantidad de items del producto que se requiere
    * @return Un valor logico correspondiente a si la cantidad requerida esta disponible en el inventario del producto
    */
    public boolean enoughStock(int numPedido){
        if (getStock() > 0){
            if(getStock() < numPedido){
                return false;
            } else if (getStock() >= numPedido){
                return true;
            }
        } 
        return false;
    
    } 
    
    /**
    * Metodo para aumentar el invetario disponible del producto
    * @param nuevoStock El numero de items que agregar al inventario de productos
    */
    
    public void addStock (int nuevoStock){
        this.setStock(getStock() + nuevoStock);
    
    } 

     /**
     * Metodo para obtener la cantidad de inventario que esta disponible en el stock
     * @return el numero de items disponible en el inventario 
     */
    public int getStock() {
        return stock;
    }

     /**
     * Metodo para asignar el valor del atributo stock al objeto
     * @param stock El valor de inventario que se desea asignar
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Metodo para obtener el nombre del producto
     * @return El nombre del producto del nodo
     */
    public String getNameP() {
        return nameP;
    }

    /**
     * Metodo para asignar el nombre del producto
     * @param nameP El nombre del producto
     */
    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    /**
     * Metodo para obtener el anterior NodoP en la lista enlazada
     * @return el NodoP anterior en la lista 
     */
    public NodoP getBefore() {
        return before;
    }

    /**
     * Metodo para asignar el valor del NodoP anterior en la lista
     * @param before el Nodo anterior a asignar
     */
    public void setBefore(NodoP before) {
        this.before = before;
    }

    /**
     * Metodo para obtener el NodoP siguiente en la lista enlazada
     * @return El nodo siguiente en la lista
     */
    public NodoP getNext() {
        return next;
    }

    /**
     * Metodo para asignar el valor del nodo siguiente en la lista
     * @param next el Nodo siguiente a asignar
     */
    public void setNext(NodoP next) {
        this.next = next;
    }
    
}
