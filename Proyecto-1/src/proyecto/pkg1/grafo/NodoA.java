/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import proyecto.pkg1.abstracts.Nodo;

/**
 * Esta clase define objetos de nodos que guardan la informacion de las aristas del grafo
 * @author Andreina Rivas
 * @version 24/02/2022
 */
public class NodoA extends Nodo {
    
    //Campos de la clase
  
    private float weight;

    /**
    * Constructor de la clase 
    * @params data, La informacion que se guarda en el nodo que se refiere al NodoV al que apunta la arista
    */
    
    public NodoA(Object data) {
        super(data);
        this.weight = 0;
    }
    
    /**
     * Metodo que retorna el peso de la arista del grafo
     * @return el valor del peso de la arista
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Metodo que le asigna el peso a la arista
     * @param el valor del peso de la arista
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    

   
}
