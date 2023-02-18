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
public class NodoA extends Nodo {
    
    
  
    private float weight;

    public NodoA(Object data) {
        super(data);
        this.weight = 0;
    }
    
    /**
     * @return the peso
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    

   
}
