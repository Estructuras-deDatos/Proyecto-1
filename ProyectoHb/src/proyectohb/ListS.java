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
    
    public void Remove (String name){
        
        NodoP aux = (NodoP) pFirst;
        NodoP auxNext = (NodoP)pFirst.getNext();
        if (name.equals(pFirst.getNameP())){
            auxNext.setBefore(null);
            this.setpFirst(auxNext);
        }
        else if(name.equals(pLast.getNameP())){
            pLast.getBefore().setNext(null);
        }
        else{
            
            while(auxNext != null){
                if(aux.getNameP().equals(name)){
                    aux.getBefore().setNext(auxNext);
                    auxNext.setBefore(aux.getBefore());
                }
                else{
                    aux= (NodoP)aux.getNext();
                    auxNext= (NodoP) auxNext.getNext();
                }
            }
        }
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
