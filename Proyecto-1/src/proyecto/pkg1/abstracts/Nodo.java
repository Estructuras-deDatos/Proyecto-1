/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.abstracts;

/**
 *
 * @author andre
 */
public abstract class Nodo {
    
    public Object data;
    public Nodo next;
    public Nodo before;

    public Nodo(Object data) {
        this.data = data;
        this.next = null;
        this.before = null;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    /**
     * @return the before
     */
    public Nodo getBefore() {
        return before;
    }

    /**
     * @param before the before to set
     */
    public void setBefore(Nodo before) {
        this.before = before;
    }

    
    
    
    
}
