/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

/**
 *
 * @author andre
 */
public class NodoV extends Nodo {
    
    ListA ady;

    public NodoV(Object data) {
        super(data);
        this.ady=null;
    }
    
    public boolean HasArcs(){
        return ady!=null;
    }
    public void CreateArc(float weight, NodoV destination){
        if (HasArcs()){
            if(ady.Search(destination)==null){
                NodoA newNodo = new NodoA(destination);
                newNodo.setWeight(weight);
                ady.Insert(newNodo);
                
            }
        }
        else{
            ady= new ListA();
            NodoA newNodo = new NodoA(destination);
            newNodo.setWeight(weight);
            ady.Insert(newNodo);
        }
                
        
        
    }
    public String PrintArcs(){
        
        String toPrint = "";
        toPrint+=this.getData();
        
        toPrint+=ady.Print();
        
        return toPrint;  
    }
    
    public int getnArcs(){
        return this.ady.getSize();
    }
    
}
