/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import proyecto.pkg1.abstracts.Nodo;

/**
 *
 * @author andre
 */
public class NodoV extends Nodo {

   
    
    public ListS stock;
    public ListA ady;

    public NodoV(Object data) {
        super(data);
        this.ady=null;
        this.stock= new ListS();
    }
    
    
    public void newStockP(String nameP, int stock){
        this.stock.Insert(nameP, stock);
    }
    
    public String print_stock(){
       return this.stock.Print();
    }
    
    public boolean HasArcs(){
        return getAdy()!=null;
    }
    public void CreateArc(float weight, NodoV destination){
        if (HasArcs()){
            if(getAdy().Search(destination)==null){
                NodoA newNodo = new NodoA(destination);
                newNodo.setWeight(weight);
                getAdy().Insert(newNodo);
                
            }
        }
        else{
            ady= new ListA();
            NodoA newNodo = new NodoA(destination);
            newNodo.setWeight(weight);
            getAdy().Insert(newNodo);
        }
                
        
        
    }
    public String PrintArcs(){
        
        String toPrint = "";
        toPrint+=this.getData();
        
        toPrint+=getAdy().Print();
        
        return toPrint;  
    }
    
    public int getnArcs(){
        return this.getAdy().getSize();
    }

    /**
     * @return the stock
     */
    public ListS getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(ListS stock) {
        this.stock = stock;
    }
     /**
     * @return the ady
     */
    public ListA getAdy() {
        return ady;
    }
}
