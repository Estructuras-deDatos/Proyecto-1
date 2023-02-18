/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.abstracts;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author andre
 */
public abstract class List {
    
    public Nodo pFirst;
    public Nodo pLast;
    public int size;

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
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        proyecto.pkg1.abstracts.Nodo oldpFirst = this.pFirst;
        this.pFirst = pFirst;
        propertyChangeSupport.firePropertyChange(PROP_PFIRST, oldpFirst, pFirst);
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        proyecto.pkg1.abstracts.Nodo oldpLast = this.pLast;
        this.pLast = pLast;
        propertyChangeSupport.firePropertyChange(PROP_PLAST, oldpLast, pLast);
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
        int oldSize = this.size;
        this.size = size;
        propertyChangeSupport.firePropertyChange(PROP_SIZE, oldSize, size);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_PFIRST = "pFirst";
    public static final String PROP_PLAST = "pLast";
    public static final String PROP_SIZE = "size";

    
   
    }
    
    
    

