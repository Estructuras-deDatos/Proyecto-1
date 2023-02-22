/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

/**
 *
 * @author andre
 */
public class Grafo {

    public ListV vertex;

    public Grafo() {
        this.vertex = null;
    }

    public boolean IsEmpty(){
        return vertex==null;
    }
    
    public boolean ArcExists(Object origin, Object destination){
        NodoV nOrigin = vertex.Search(origin);
        NodoV nDestination=vertex.Search(destination);
        if (nOrigin !=null && nDestination!=null){
            
            if(nOrigin.getAdy().Search(nDestination)!=null){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
       }
    }
    
    public boolean VertexExists(Object data){
        NodoV wanted = vertex.Search(data);
        if(wanted!=null){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public void NewVertex(Object data){
        if(!IsEmpty()){
            if(vertex.Search(data)==null){
                vertex.Insert(data);
            }
        } 
        else{
            vertex=new ListV();
            vertex.Insert(data);
        }
        
    }
    //Recorrido en profundidad
    public void RecorrerProfundidad(Grafo g, int v, boolean[] visitados){
        
        visitados[v] = true;
        boolean encontrado = false;
        NodoV aux = (NodoV)vertex.getpFirst();
        while(!encontrado && aux != null){
            if((int)aux.getData() == v){
                encontrado = true;
                
                System.out.println(aux.getStock().PrintProducts());
                
            }
            
            aux = (NodoV)aux.getNext();
        }
        
          NodoV Aux2 = (NodoV)vertex.getpFirst();
          
        try{
        for (int i = 0;i<aux.getAdy().getSize();i++){
              
            if((v!=i) && (!visitados[i]) && (g.ArcExists(aux,Aux2 )) ){
                RecorrerProfundidad(g, i, visitados);
            }
            Aux2 = (NodoV)Aux2.getNext();  
        }
        }
        catch(Exception e){
        
        }
        
        
    }
    
    public void DepthFirstSearch(Grafo g){
        boolean visitados [] = new boolean[vertex.getSize()];
        for(int i = 0;i<this.vertex.getSize();i++){
            visitados[i] = false;
        }
        for (int j = 0;j<this.vertex.getSize();j++){
            if(!visitados[j]){
                RecorrerProfundidad(g,j, visitados);
            }
        }
    }
    public void NewArc(Object origin, Object destination, float weight){
        if(!IsEmpty()){
            NodoV nOrigin = vertex.Search(origin);
            NodoV nDestination=vertex.Search(destination);
            if (nOrigin!=null && nDestination !=null){
                nOrigin.CreateArc(weight, nDestination);
            }
        }
    }
        
    public String PrintVertex(){
        return vertex.Print();
    }

    public ListV getList(){
        return vertex;
    }
}
