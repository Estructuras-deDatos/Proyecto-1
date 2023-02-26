/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import proyecto.pkg1.abstracts.List;

/**
 * Esta clase define los objetos que corresponden a las listas de aristas adyacentes a los vertices
 * @author Andreina Rivas
 * @version 24/02/2022
 */
public class ListA extends List {

    /**
     * Constructor de la clase
     */
    public ListA() {
    }

    
    /**
    * Metodo que busca un nodo en la lista a partir de la informacion que contiene el nodo
    * @param data La informacion que se desea encontrar dentro de la lista
    * @return el NodoA que contiene la informacion deseada o null en el caso de que no se haye
    */
    @Override
    public NodoA Search(Object data) {
        NodoA aux;
       for (aux=(NodoA) pFirst; aux!=null;aux=(NodoA) aux.getNext()){
           if(data==aux.getData()){
               return aux;
           }   
       }
       return null;
    }

     
    /**
    * Metodo que inserta un nuevo nodo al final de la lista a partir del vertice que se quiera guardar
    * @param data La informacion que se quiere guardar en el nuevo nodo
    */
    @Override
    public void Insert(Object data) {
        NodoA newNodo=(NodoA)data;
        if(pFirst==null){
            pFirst=pLast=newNodo;
        }
        else{
            pLast.setNext(newNodo);
            newNodo.setBefore(pLast);
            pLast=newNodo;
        }
        size++;
    }

    /**
    * Metodo que elimina el nodo que contiene la informacion dada
    * @param data La informacion que contiene el nodo que se quiere eliminar
    */
    @Override
    public void Remove(Object data) {
        NodoA aux= (NodoA) pFirst;
        NodoA auxNext=(NodoA)pFirst.getNext();
        if (data == pFirst.getData()){
            auxNext.setBefore(null);
            this.setpFirst(auxNext);
        }
        if(data==pLast.getData()){
            pLast.getBefore().setNext(null);
        }
        else{
            while(auxNext!=null){
                if(aux.getData()==data){
                    aux.getBefore().setNext(auxNext);
                    auxNext.setBefore(aux.getBefore());
                }
                else{
                    aux= (NodoA)aux.getNext();
                    auxNext= (NodoA) auxNext.getNext();
                }
            }
        }
        size--;
    }
    /**
    * Metodo que genera una cadena con toda la infromacion que contiene la lista
    * @return La cadena con toda la informacion que contiene la lista. 
    */
    @Override
    public String Print() {
        String toPrint="";
        NodoA index;
        for (index=(NodoA)pFirst; index!=null; index=(NodoA)index.getNext()){
            NodoV destination=(NodoV)index.getData();
            String routeName= (String) destination.getData(); 
            String routeWeight=Float.toString(index.getWeight());
            String route="->"+routeName+"\n"+routeWeight+"\n";
            
            toPrint+=route;
            
        }
        
        return toPrint;
    }
    /**
    * Metodo que evalua si la lista esta vacia
    * @return Valor logico correspondiente a si la lista contiene nodos 
    */
    public boolean isEmpty(){
        return pFirst==null;
    }
    
}
