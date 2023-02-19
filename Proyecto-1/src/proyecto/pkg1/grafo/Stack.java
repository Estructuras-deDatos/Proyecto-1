/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

/**
 *
 * @author andre
 */
public class Stack {
    
    public NodoV top;
    public int size;
    
    public Stack(){
        this.top=null;
        this.size=0;
        
    }
    
    public void push(NodoV vertex){
        NodoV newTop = new NodoV(vertex);
        if(isEmpty()){
            setTop(newTop);
        }else{
            newTop.setNext(getTop());
            setTop(newTop);
        }
        size++;
    }
    
    public NodoV pop(){
        if(!isEmpty()){
        NodoV aux = getTop();
        setTop((NodoV)getTop().getNext());
        return (NodoV) aux.getData();
        }
        return null;
    }
    
    public boolean isEmpty(){
        return getTop()==null;
    }

    /**
     * @return the top
     */
    public NodoV getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(NodoV top) {
        this.top = top;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
