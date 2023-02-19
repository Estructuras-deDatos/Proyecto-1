/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

/**
 *
 * @author andre
 */
public class Queue {
    public NodoV front;
    public NodoV back;

    public Queue() {
        this.front=null;
        this.back=null;
    }
    
    public boolean isEmpty(){
        return front==null;
        
    }
    
    public void queue(NodoV data){
        NodoV newFront = new NodoV(data);
        if(isEmpty()){
            front=back=newFront;
        }else{
            getBack().setNext(newFront);
            setBack(newFront);
            newFront.setNext(null);
        }
    }
    
    public NodoV dequeue(){
        if(!isEmpty()){
        NodoV first = getFront();
        setFront((NodoV)getFront().getNext());
        return (NodoV)first.getData();}
        return null;
    }
    /**
     * @return the front
     */
    public NodoV getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(NodoV front) {
        this.front = front;
    }

    /**
     * @return the back
     */
    public NodoV getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(NodoV back) {
        this.back = back;
    }
    
    
    
}
