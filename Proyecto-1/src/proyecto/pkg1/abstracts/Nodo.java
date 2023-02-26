/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.abstracts;

/**
 * Clase abstracta para la estructura de los nodos de las listas
 * @author Andreina Rivas
 */
public abstract class Nodo {
    
    //Campos de la clase
    public Object data;
    public Nodo next;
    public Nodo before;

    /**
     * Contructor de la clase
     * @param data, el Objeto que almacena el nodo
     */
    public Nodo(Object data) {
        this.data = data;
        this.next = null;
        this.before = null;
    }

    /**
     * Metodo para obtener la informacion guardada en el nodo
     * @return El objeto que almacena
     */
    public Object getData() {
        return data;
    }

    /**
     * Metodo para asignar la informacion guardada
     * @param data Objeto a guardar en el nodo
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Metodo para obtener el nodo correspondiente al siguiente elemento en la lista
     * @return el Nodo siguiente
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * Metodo para establecer el nodo siguiente en la lista
     * @param next el Nodo siguiente
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    /**
     * Metodo para obtener el nodo correspondiente al elemento anterior en la lista
     * @return el nodo anterior
     */
    public Nodo getBefore() {
        return before;
    }

    /**
     * Metodo para establecer el nodo anterior en la lista
     * @param before el nodo anterior
     */
    public void setBefore(Nodo before) {
        this.before = before;
    }

    
    
    
    
}
