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
      String[] array = {"A","B","C","D","E","F","G"};
      
      for (int i=0; i<7;i++ ){
          grafoPrueba.NewVertex(array[i]);
      }
      String[] array2 = {"B","C","D","E","F","G"};
      for (int i=0;i<6;i++){
          grafoPrueba.NewArc("A", array2[i], i+1);
      }
      
      NodoV arc=grafoPrueba.vertex.Search("A");
        System.out.println(arc.PrintArcs());
        System.out.println(grafoPrueba.PrintVertex());
      
      
    }
    
}    
            
        
            
        
        
        
    
    

