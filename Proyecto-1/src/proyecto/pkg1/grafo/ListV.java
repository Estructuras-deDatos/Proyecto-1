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
public class ListV extends List{

    public ListV() {
    }
    

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

    @Override
    public String Print() {
        String toPrint="";
        NodoV index;
        for (index=(NodoV)pFirst; index!=null; index= (NodoV)index.getNext()){
            toPrint+=index.getData()+"\n";
        }
        return toPrint;
    }
    
    public boolean isEmpty(){
        return pFirst==null;
    }
}
