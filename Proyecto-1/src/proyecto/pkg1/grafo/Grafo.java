/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

/**
 * Esta clase define los objetos correspondiente al grafo implementado con listas de adyacencia
 * @author Andreina Rivas
 */
public class Grafo {

    //Campos de la clase
    public ListV vertex;

    /**
     * Constructor de la clase
     */
    public Grafo() {
        this.vertex = null;
    }
    
    /**
     * Metodo para determinar si el grafo esta vacio, no tiene vertices
     * @return valor logico de si el grafo tiene vertices
     */

    public boolean IsEmpty(){
        return vertex==null;
    }
    
    /**
     * Metodo para determinar si existe una arista entre dos vertices
     * @param origin el nombre identificador del vertice del origen
     * @param destination el nombre identificador del vertice del destino
     * @return valor logico de si la arista existe o no
     */
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
    /**
     * Metodo para determinar si existe un vertice en el grafo
     * @param data La informacion que contiene el vertice a revisar
     * @return valor logico de si existe el vertice deseado
     */
    public boolean VertexExists(Object data){
        NodoV wanted = vertex.Search(data);
        if(wanted!=null){
            return true;
        }
        else{
            return false;
        }
        
    }
    /**
     * Metodo para crear un nuevo vertice en el grafo
     * @param data el Objeto que almacena el nuevo elemento 
     */
    
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
    
    /**
     * Metodo para crear una nueva arista en el grafo
     * @param origin el Objeto qur almacena el vertice del origen
     * @param destination el Objeto qur almacena el vertice del destino
     * @param weight el peso de la arista
     */
    
   
    public void NewArc(Object origin, Object destination, float weight){
        if(!IsEmpty()){
            NodoV nOrigin = vertex.Search(origin);
            NodoV nDestination=vertex.Search(destination);
            if (nOrigin!=null && nDestination !=null){
                nOrigin.CreateArc(weight, nDestination);
            }
        }
    }
        
    /**
     * Metodo para obtener toda la informacion contenida en los vertices
     * @return Cadena con toda la informacion
     */
    public String PrintVertex(){
        return vertex.Print();
    }
    
    /**
     * Metodo para obtener la lista de vertices
     * @return La lista de vertices 
     */

    public ListV getList(){
        return vertex;
    }
}
