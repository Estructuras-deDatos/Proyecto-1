/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import proyecto.pkg1.abstracts.List;

/**
 *
 * @author andre
 */
public class ListA extends List {

    public ListA() {
    }

    
    /* retorna el nodo correspondiente a la arista que llega al objeto indicado*/
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
    }

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
    
}
