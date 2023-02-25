/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import proyecto.pkg1.abstracts.List;

/** Esta clase define listas enlazadas para NodoV que contienen los vertices del grafo principalmente, y otros objetos necesarios en el funcionamiento
 * @author andre
 * @version 24/02/2023
 */
public class ListV extends List{
 
    // Campos de la clase corresponden a la interfaz padre
    /* Constructor de la clase crea un objeto de una lista vacia
    */
    public ListV() {
    }
    
    /**
    * Metodo que vacia todos los elementos de la lista, dejandola vacia nuevamente
    */
    public void Empty(){
        setpFirst(null);
        setpLast(null);
        setSize(0);
    }
    /**
    * Metodo que busca un nodo en la lista a partir de la informacion que contiene el nodo
    * @param data La informacion que se desea encontrar dentro de la lista
    * @return el NodoV que contiene la informacion deseada o null en el caso de que no se haye
    */
    @Override
    public NodoV Search(Object data) {
       NodoV aux;
       for (aux=(NodoV) pFirst; aux!=null;aux=(NodoV) aux.getNext()){
           if(data.equals(aux.getData())){
               return aux;
           }   
       }
       return null;
    }
    
    /**
    * Metodo que inserta un nuevo nodo al final de la lista a partir del dato que se quiera guardar
    * @param data La informacion que se quiere guardar en el nuevo nodo
    */

    @Override
    public void Insert(Object data) {
        NodoV newNodo=new NodoV(data);
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
        NodoV aux= (NodoV) pFirst;
        NodoV auxNext=(NodoV)pFirst.getNext();
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
                    aux= (NodoV)aux.getNext();
                    auxNext= (NodoV) auxNext.getNext();
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
        NodoV index;
        for (index=(NodoV)pFirst; index!=null; index= (NodoV)index.getNext()){
            toPrint+=index.getData()+"\n";
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
