/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg1;

/**
 *
 * @author andre
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Grafo grafoPrueba = new Grafo();
      int[] array = {1,2,3,4,5,5,4,9};
      
      for (int i=0; i<8;i++ ){
          grafoPrueba.NuevoVertice(array[i]);
      }
      grafoPrueba.ImprimirVertices();
      
      
    }
    
}    
            
        
            
        
        
        
    
    

