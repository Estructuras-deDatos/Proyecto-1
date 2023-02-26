/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import proyecto.pkg1.interfaces.auxFunctions;

/**
 * Esta clase define los objetos correspondientes a las listas de productos disponibles en cada almacen
 * @author Haidar Bazzi 
 * @version 24/02/2022
 */
public class ListS {
    
    //Campos de la clase
    private NodoP pFirst;
    private NodoP pLast;
    private int size;
    
    /**
     * Constructor de la clase
     */
    public ListS(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    /**
     * Metodo para actualizar la lista y eliminar los productos que tengan un inventario igual a 0
     */
    public void update(){
        NodoP aux = getpFirst();
        while(aux!=null){
            if (aux.getStock()==0){
                Remove(aux.getNameP());
            }
            aux=aux.getNext();
        }
    }
    /**
    * Metodo que busca un nodo en la lista a partir de la informacion que contiene el nodo
    * @param data La informacion que se desea encontrar dentro de la lista
    * @return el NodoA que contiene la informacion deseada o null en el caso de que no se haye
    */
    public NodoP Search(Object data){
        NodoP aux;
       for (aux=(NodoP) pFirst; aux!=null;aux=(NodoP) aux.getNext()){
           if(data.equals(aux.getNameP())){
               return aux;
           }   
       }
       return null;
    }
    
   /**
    * Metodo para insertar un nuevo producto a la lista partiendo del nombre e inventario del producto
    * @param nameP Nombre del producto
    * @param stock Numero de items del producto
    */
    
    public void Insert(String nameP, int stock){
        NodoP newNodo = new NodoP(nameP, stock);
        if(pFirst==null){
            pFirst=newNodo;
            pLast = newNodo;
        }
        else{
            pLast.setNext(newNodo);
            newNodo.setBefore(pLast);
            pLast=newNodo;
        }
        size++;
    }
    
    /**
     * Metodo para eliminar un elemento de la lista
     * @param name Nombre del producto a eliminar
     */
    public void Remove(String name){
    
        NodoP actual;
        boolean encontrado = false;
        actual = pFirst;
        
        while ((actual != null) && (!encontrado)){
            encontrado = (actual.getNameP().equals(name));
            if (!encontrado){
                actual = actual.getNext();
            }
        
        }
        
        if (actual != null){
            if (actual.getNameP().equals(pFirst.getNameP())){
                pFirst = actual.getNext();
                if(actual.getNext() != null){
                    actual.getNext().setBefore(null);
                
                }
            } else if(actual.getNext() != null){
                actual.getBefore().setNext(actual.getNext());
                actual.getNext().setBefore(actual.getBefore());
            
            } else {
                actual.getBefore().setNext(null);
            }
            
            actual = null;
        
        
        }
        size--;
    
    }
    
    /**
     * Metodo para revisar si la lista es vacia
     * @return Valor logico correspondiente a si la lista contiene elementos
     */
    public boolean isEmpty(){
        return pFirst == null;
    }
    
    /**
     * Metodo para obtener la informacion de todos los elementos de una lista 
     * @return una Cadena con la informacion de los productos y el inventario disponible
     */
    
    public String Print(){
        
        String toPrint="";
        NodoP index;
        for (index=(NodoP)pFirst; index!=null; index=(NodoP)index.getNext()){
            String Name=auxFunctions.UpperFirstLetter(index.getNameP());
            int stck = index.getStock();
            toPrint+= "Producto: " + Name + "  Stock: " + stck +"\n";
            
        }
        
        return toPrint;
        
    }

    /**
     * Metodo para obtener el primer elemento de la lista
     * @return el NodoP correspondiente al primer elemento de la lista
     */
    public NodoP getpFirst() {
        return pFirst;
    }

    /**
     * Metodo para establecer el primer elemento de la lista
     * @param pFirst el nodo que sera el primer elemento
     */
    public void setpFirst(NodoP pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * Metodo para obtener el ultimo elemento de la lista
     * @return el ultimo nodo
     */
    public NodoP getpLast() {
        return pLast;
    }

    /**
     * Metodo para establecer el ultimo elemento de la lista
     * @param pLast el nodo a guardar como el ultimo
     */
    public void setpLast(NodoP pLast) {
        this.pLast = pLast;
    }

    /**
     * Metodo para obtener el numero de items guardados en la lista
     * @return el numero de items
     */
    public int getSize() {
        return size;
    }

}
