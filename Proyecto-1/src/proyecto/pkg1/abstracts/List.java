/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.abstracts;

import java.beans.PropertyChangeSupport;

/**
 * Clase abstracta correspondiente a las listas que conforman el programa
 * @author Andreina Rivas
 * @version 24/02/2022
 */
public abstract class List {
    
    //Campos de la clase
    public Nodo pFirst;
    public Nodo pLast;
    public int size;
    
    /**
     *Constructor de la clase, crea una lista vacia
     */
    public List() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public abstract Nodo Search(Object data);
    
    public abstract void Insert(Object data);
    
    public abstract void Remove (Object data);
    
    public abstract Object Print();

    /**
     * Metodo para obtener el primer elemento de la lista
     * @return el primer Nodo
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * Metodo para asignar el valor del primer nodo
     * @param pFirst El valor del primer Nodo
     */
    public void setpFirst(Nodo pFirst) {
        proyecto.pkg1.abstracts.Nodo oldpFirst = this.pFirst;
        this.pFirst = pFirst;
        propertyChangeSupport.firePropertyChange(PROP_PFIRST, oldpFirst, pFirst);
    }

    /**
     * Metodo para obtener el ultimo elemento de la lista
     * @return el utlimo nodo
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * Metodo para establecer el valor del ultimo nodo
     * @param pLast el valor a asignar del ultimo nodo
     */
    public void setpLast(Nodo pLast) {
        proyecto.pkg1.abstracts.Nodo oldpLast = this.pLast;
        this.pLast = pLast;
        propertyChangeSupport.firePropertyChange(PROP_PLAST, oldpLast, pLast);
    }

    /**
     * Metodo para obtener el tamaño de la lista, la cantidad de elementos que almacena
     * @return el numero de items
     */
    public int getSize() {
        return size;
    }

    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_PFIRST = "pFirst";
    public static final String PROP_PLAST = "pLast";
    public static final String PROP_SIZE = "size";

    
   
    }
    
    
    

