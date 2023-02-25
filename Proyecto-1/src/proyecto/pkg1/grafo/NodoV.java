/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import proyecto.pkg1.abstracts.Nodo;

/**
 * Esta clase define objetos de nodos que guardan la informacion de los vertices del grafo, y otros objetos en distintas funcionalidades
 * @author andre
 * @version 24/02/2022
 */
public class NodoV extends Nodo {

   //Campos de la clase
    public int id;
    public ListS stock;
    public ListA ady;

    /**
     * Constructor de la clase 
     * @param data La informacion del vertice que se desea almacenar
     */
    public NodoV(Object data) {
        super(data);
        this.id=0;
        this.ady=null;
        this.stock= new ListS();
    }
    //Cierre del constructor
    
    /**
     * Metodo para agregar un nuevo producto al inventario del vertice correspondiente
     * @param nameP Nombre del producto que se desea agregar
     * @param stock Cantidad del producto 
     */
    
    public void newStockP(String nameP, int stock){
        this.stock.Insert(nameP, stock);
    }
    
    /**
     * Metodo que obtiene una cadena con toda la informacion del inventario disponible en el vertice
     * @return La informacion de los productos disponibles en el vertice
     */
    
    public String print_stock(){
       return this.stock.Print();
    }
    
    /**
     * Metodo que revisa si el vertice tiene arcos adyacentes
     * @return el valor logico correspondiente a si el atributo de listas de aristas esta vacio o no
     */
    public boolean HasArcs(){
        return getAdy()!=null;
    }
    /**
     * Metodo para crear una arista nueva adyacente al vertice correspondiente
     * @param weight el peso de la arista a crear
     * @param destination el NodoV al que apunta la arista
     */
    public void CreateArc(float weight, NodoV destination){
        if (HasArcs()){
            if(getAdy().Search(destination)==null){
                NodoA newNodo = new NodoA(destination);
                newNodo.setWeight(weight);
                getAdy().Insert(newNodo);
                
            }
        }
        else{
            ady= new ListA();
            NodoA newNodo = new NodoA(destination);
            newNodo.setWeight(weight);
            getAdy().Insert(newNodo);
        }   
    }
    /**
     * Metodo que retorna la cadena correspondiente a todas las adyacencias que tiene un vertice
     * @return Una cadena con las adyacentcias del vertice
     */
    public String PrintArcs(){
        
        String toPrint = "";
        toPrint+=this.getData();
        
        toPrint+=getAdy().Print();
        
        return toPrint;  
    }
    
    /**
     * Metodo para obtener cuantas aristas incian en el vertice
     * @return Numero de aristas que tienen origen en el vertice
     */
    
    public int getnArcs(){
        return this.getAdy().getSize();
    }

    /**
     * Metodo para obtener la lista de productos disponibles en el almacen
     * @return La lista de productos disponibles en el almacen
     */
    public ListS getStock() {
        return stock;
    }

    /**
     * Metodo para establecer la lista de productos disponible
     * @param stock La lista que se desea establecer
     */
    public void setStock(ListS stock) {
        this.stock = stock;
    }
     /**
      * Metodo para obtener la listas de arcos que parten del vertice
     * @return la lista de arcos originados en el vertice
     */
    public ListA getAdy() {
        return ady;
    }

    /**
     * Metodo que retorna el ID del almacen correspondiente asignado cuando se lee el archivo txt
     * @return El numero del ID correspondiente
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para asignar el valor del ID del almacen que corresponde
     * @param id el numero de Identificacion a asignar
     */
    public void setId(int id) {
        this.id = id;
    }
}
