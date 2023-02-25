/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

/**
 * Esta clase define una cola de NodoV para manejar el recorrido del grafo en amplitud
 * @author andre
 * @version 24/02/2022
 */
public class Queue {
    
    //Campos de la clase
    public NodoV front;
    public NodoV back;

    /**
     * Constructor de la clase
     */
    public Queue() {
        this.front=null;
        this.back=null;
    }
    //Cierre del constructor
    
    /**
     * Metodo para revisar si la cola es vacia o no
     * @return el Valor logico correspondiente a si la cola contiene objetos
     */
    public boolean isEmpty(){
        return front==null;
        
    }
    
    /**
     * Metodo para agregar un elemento a la cola
     * @param data La informacion que se va a guardar en el Nodo de la lista
     */
    
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
    
    /**
     * Metodo para desencolar un elemento de la cola
     * @return El elemento que se desencola
     */
    public NodoV dequeue(){
        if(!isEmpty()){
        NodoV first = getFront();
        setFront((NodoV)getFront().getNext());
        return (NodoV)first.getData();}
        return null;
    }
    
    /**
     * Metodo para obtener el elemento al inicio de la cola
     * @return el Nodo que se encuentra en el inicio de la oola
     */
    public NodoV getFront() {
        return front;
    }

    /**
     * Metodo para asignar el elemento al inicio de la cola
     * @param front el Nodo que se va a asignar como inicio
     */
    public void setFront(NodoV front) {
        this.front = front;
    }

    /**
     * Metodo para obtener el elemento ultimo en la cola
     * @return El Nodo en la ultima posicion de la cola
     */
    public NodoV getBack() {
        return back;
    }

    /**
     * Metodo para asignar el elemento ultimo de la cola
     * @param back el Nodo que se va a asignar como ultimo
     */
    public void setBack(NodoV back) {
        this.back = back;
    }
    
    
    
}
