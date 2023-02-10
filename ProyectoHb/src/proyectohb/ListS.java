/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectohb;

/**
 *
 * @author Windows 10
 */
public class ListS {
    
    /*Clase de la lista del Almacen*/
    private NodoP pFirst;
    private NodoP pLast;
    private int size;
    
    
    public ListS(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public NodoP Search(Object data){
        NodoP aux;
       for (aux=(NodoP) pFirst; aux!=null;aux=(NodoP) aux.getNext()){
           if(data==aux.getNameP()){
               return aux;
           }   
       }
       return null;
    }
    
    public void Insert(String nameP, int stock){
        NodoP newNodo = new NodoP(nameP, stock);
        if(pFirst==null){
            pFirst=newNodo;
            pLast = newNodo;
        }
        else{
            pLast.setNext(newNodo);
            newNodo.setBefore(pLast);
            pLast=newNodo;
        }
    }
    
    
    public void Remove(String name){
    
        NodoP actual;
        boolean encontrado = false;
        actual = pFirst;
        
        while ((actual != null) && (!encontrado)){
            encontrado = (actual.getNameP().equals(name));
            if (!encontrado){
                actual = actual.getNext();
            }
        
        }
        
        if (actual != null){
            if (actual.getNameP().equals(pFirst.getNameP())){
                pFirst = actual.getNext();
                if(actual.getNext() != null){
                    actual.getNext().setBefore(null);
                
                }
            } else if(actual.getNext() != null){
                actual.getBefore().setNext(actual.getNext());
                actual.getNext().setBefore(actual.getBefore());
            
            } else {
                actual.getBefore().setNext(null);
            }
            
            actual = null;
        
        
        }
    
    }
    
    public boolean isEmpty(){
        return pFirst == null;
    }
    
    
    public String Print(){
        
        String toPrint="";
        NodoP index;
        for (index=(NodoP)pFirst; index!=null; index=(NodoP)index.getNext()){
            String Name=index.getNameP();
            int stck = index.getStock();
            toPrint+= "Producto: " + Name + "  Stock: " + stck +"\n";
            
        }
        
        return toPrint;
        
    }

    /**
     * @return the pFirst
     */
    public NodoP getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoP pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoP getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoP pLast) {
        this.pLast = pLast;
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
