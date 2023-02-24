/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.grafo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;
import proyecto.pkg1.interfaces.auxFunctions;


/**
 *
 * @author andre
 */
public class functions {
    
    
    public static void updateStock(ListV order){
        NodoV aux = (NodoV) order.getpFirst();
        while(aux!=null){
            Object [] info = (Object[]) aux.getData();
            NodoV warehouse =(NodoV) info[0];
            String product = (String)info[1];
            Integer quant = (Integer) info[2];
            NodoP toUpdate = warehouse.getStock().Search(product);
            toUpdate.setStock(toUpdate.getStock()-quant);
            warehouse.getStock().update();
            aux=(NodoV)aux.getNext();
        }
        order.Empty();
        
    }
    
     //Recorrido en profundidad
    public static String RecorrerProfundidad(Grafo g, int v, boolean[] visitados){
        String toPrint="";
        visitados[v] = true;
        boolean encontrado = false;
        NodoV aux = (NodoV)g.getList().getpFirst();
        NodoV encontradoN=null;
        while(!encontrado && aux != null){
            if(aux.getId() == v){
                encontrado = true;
                encontradoN=aux;
                toPrint+= "Almacen " + aux.getData()+"\n";
                if(aux.print_stock().equals("")){
                    toPrint+="No Hay Stock Disponible";
                }
                else{
                    toPrint+=aux.print_stock();
                }         
            }
            
            aux = (NodoV)aux.getNext();
        }
        
          
          
        try{
        NodoA ady = (NodoA)encontradoN.getAdy().getpFirst();
        for (int i = 0;i<encontradoN.getAdy().getSize();i++){
            NodoV dest = (NodoV)ady.getData();
            if((v!=i) && (!visitados[i]) && (g.ArcExists(encontradoN.getData(),dest.getData() )) ){
                toPrint+=RecorrerProfundidad(g, i, visitados);
            }
            ady = (NodoA)ady.getNext();  
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, encontradoN.getData());
        
        }
        
        return toPrint;
    }
    
    public static String DFS_report(Grafo g){
        String toPrint="Disponibilidad de Almacenes\n";
        boolean visitados [] = new boolean[g.getList().getSize()];
        for(int i = 0;i<g.getList().getSize();i++){
            visitados[i] = false;
        }
        for (int j = 0;j<g.getList().getSize();j++){
            if(!visitados[j]){
                toPrint+=RecorrerProfundidad(g,j, visitados);
            }
        }
        return toPrint;
    }
    
    /* la funcion para manejar todos los pedidos que la cantidad pedida sea mayor a la que esta disponible en el 
    almacen seleccionado. 
    Maneja dos escenarios principales: 
        1. Que otro almacen tenga suficiente para completar la orden
            usa getClosestWarehouse, donde se busca el almacen mas cercano con el stock suficiente para cubrir la orden
        2. Que no hayan suficiente stock en los otros almacenes
            usa getWarehouseMaxStock, donde se busca el almacen con la mayor cantidad de stock del producto y se piden 
            por completo.
    
    Hay dos posibilidades de retorno:
        1. null - no hay almacen con stock del producto
        2. un array de 4 objetos:
            array[0] - indica si se esta en el primer o segundo escenario
                principalmente para distinciones que se quieran hacer en impresion
            array[1] = distancia entre los almacenes
            array[2] = ruta entre los almacenes
            array[3] = objeto NodoV del cual se esta haciendo el pedido auxiliar
            array[4] = la cantidad de productos que se estan pidiendo en el almacen auxiliar
                
    */
    public static Object[] manageStockRequests(Grafo grafo, NodoV selW, String prod, int quan){
        NodoP nProd = (NodoP)selW.getStock().Search(prod);
            quan -= nProd.getStock();
            Object [] result = getClosestWarehouse(grafo, selW, prod, quan);
            if(result == null){
                result = getWarehouseMaxStock(grafo, selW, prod);
                if(result== null){
                    return null;
                }
                else{
                    return result;
                }
            }
            else{
                return result;
            }   
    }
    
    public static Object[] getWarehouseMaxStock(Grafo grafo, NodoV selW, String prod){
        Object[] result = new Object[5];
        NodoV aux = (NodoV) grafo.getList().getpFirst();
        NodoV maxStockWarehouse = null;
        Integer maxStock= Integer.MIN_VALUE;
        while (aux!=null){
            NodoP found = aux.getStock().Search(prod);
            if(found!=null && found.getStock()>maxStock && selW != aux){
                maxStockWarehouse =aux;
                maxStock= found.getStock();
            }
            aux=(NodoV) aux.getNext();
        }
        if(maxStockWarehouse!=null){
        ListV visited = new ListV();
        Object[] ret = getWay(maxStockWarehouse, selW, maxStockWarehouse, visited);
        result[0]=false;
        result[1]=ret[0];
        result[2]=ret[1];
        result[3]=maxStockWarehouse;
        result[4]=maxStock;}
        else{
            result=null;
        }
        
        return result;
    }
    
    /* esta es la funcion a implementar de realizar pedido, recibe el grafo general, 
    el Nodo del almacen seleccionado para el pedido, y el nombre (string) del producto que se requiere
    
    Retorna un array que tienen
    [0] - la distancia que hay entre el almacen mas cercano con el producto
    [1] - la ruta que debe tomar para llegar al almacen
    [2] - el NodoV del almacen al cual se le pediria el producto
    [3] - el int que corresponde a los productos requeridos/pedidos del almacen
    */
    
    public static Object[] getClosestWarehouse(Grafo grafo, NodoV selW, String prod, int quant){
        Object[] result = new Object[5];
        ListV warehouses = getWarehouses(grafo,selW, prod, quant);
        if(!warehouses.isEmpty()){
            NodoV aux =(NodoV) warehouses.getpFirst();
            NodoV closestWarehouse=null;
            float distance;
            String route;
            Float distMin =Float.POSITIVE_INFINITY;
            String final_route="";
            while(aux!=null){
                ListV visited = new ListV();
                Object[] temp = getWay((NodoV) aux.getData(), selW,(NodoV) aux.getData(), visited);
                distance = (float) temp[0];
                route=(String) temp[1];
                if(distance<distMin){
                    distMin=distance;
                    final_route=route;
                    closestWarehouse = (NodoV) aux.getData();
                }
                aux=(NodoV)aux.getNext();
            }
            result[0]=true;
            result[1] = distMin;
            result[2]=final_route;
            result[3]=closestWarehouse;
            result[4]=quant;
            return result;}
        else{
            return null;
        }
    }
    
    public static ListV getWarehouses(Grafo grafo, NodoV selW, String prod, int quant){
        ListV warehouses = grafo.getList();
        ListV result = new ListV();
        NodoV aux = (NodoV)warehouses.getpFirst();
        while(aux!=null){
            NodoP found = aux.getStock().Search(prod);
            if(found!=null && found.getStock()>=quant && selW!=aux){
                result.Insert(aux);
            }
            aux=(NodoV)aux.getNext();
        }
        return result;
    }
    
    public static Object[] getWay(NodoV origen, NodoV destino, NodoV inicio, ListV visited){
        float distance;
        String route;
        Object[] result = new Object[2];
        Float distMin =Float.POSITIVE_INFINITY;
        String final_route="";
        ListA list = origen.getAdy();
        NodoA aux = (NodoA)list.getpFirst();
        if(origen==destino){
            float res = 0;
            result[0]= res;
            result[1]= (String) origen.getData();
            return result;
        }else if ((NodoV) aux.getData()!=inicio && !check_visited(visited,(NodoV)aux.getData())){
            int count =0;
            while(count < list.getSize()){
                    distance=aux.getWeight();
                    route=(String)origen.getData()+" - ";
                    NodoV where = (NodoV)aux.getData();
                    visited.Insert(where.getData());
                    result= getWay((NodoV)aux.getData(), destino, inicio, visited);
                    distance+= (Float) result[0];
                    route+=(String) result[1];
                    if(distance<= distMin){
                        distMin=distance;
                        final_route= route;
                }
                aux=(NodoA)aux.getNext();
                count++;
            }
        }
        result[0] =distMin;
        result[1]=final_route;
        return result;
    }
    
    public static boolean check_visited(ListV visited, NodoV aux){
        if(!visited.isEmpty()){
            return visited.Search(aux.getData())!= null;
        }else{
            return false;
        }
    }
 
    
    public static NodoV find_beginning(Grafo grafo){
        ListV vertex = grafo.getList();
        NodoV aux =(NodoV) vertex.getpFirst();
        NodoV beginning = aux;
        while(aux!=null){
            if(aux.getId()==0){
                beginning = aux;
            }
            aux=(NodoV) aux.getNext();
        }
        return beginning;
    }
    
    public static boolean has_been_visited(Object aux, ListV visited){
       return visited.Search(aux)!=null;
    }
    
    
    
    public static String BFS_report(Grafo grafo){
        String report = "Disponibilidad de los Almacenes:\n";
        if(!grafo.IsEmpty()){
            Queue queue = new Queue();
            ListV visited = new ListV();
            NodoV beg = find_beginning(grafo);
            queue.queue(beg);
            NodoV aux;
            while(!queue.isEmpty()){
                aux=queue.dequeue();
                if(!has_been_visited(aux.getData(), visited)){
                    report+= "Almacen "+(String)aux.getData()+": \n";
                    if(aux.print_stock().equals("")){
                    report+="No Hay Stock Disponible";
                    }
                    else{
                    report+=aux.print_stock();
                    }    
                    visited.Insert(aux.getData());
                }
                NodoA auxAdy = (NodoA) aux.getAdy().getpFirst();
                while(auxAdy!=null){
                    NodoV data =(NodoV) auxAdy.getData();
                    if(!has_been_visited(data.getData(), visited)){
                        queue.queue((NodoV)auxAdy.getData());
                    }
                    auxAdy=(NodoA)auxAdy.getNext();
                }
            }
        
        }else{
           report+="Estructura vacia\n";
        }
        
        return report;
    }
    
    
    public static ViewPanel create_graph(Grafo grafo){
        System.setProperty("org.graphstream.ui","swing");
        Graph graph = new SingleGraph("tutorial 1");
            graph.setAttribute("ui.stylesheet", styleSheet);
            graph.setAutoCreate(false);
            graph.setStrict(false);
            
            NodoV aux =(NodoV) grafo.vertex.getpFirst();
            while(aux!=null){
                Node n = graph.addNode((String)aux.getData());
                n.setAttribute("ui.label", n.getId());
                n.setAttribute("layout.weight", 10);
                aux=(NodoV)aux.getNext();
            }
            aux = (NodoV) grafo.vertex.getpFirst();
            while(aux!=null){
                ListA ady = aux.getAdy();
                NodoA in =(NodoA) ady.getpFirst();
                while(in!=null){
                    NodoV dest =(NodoV) in.getData();
                    String id= (String) aux.getData() +(String) dest.getData();
                    Edge e = graph.addEdge(id, (String)aux.getData(), (String) dest.getData(), true) ;
                    e.setAttribute("ui.label", Float.toString(in.getWeight()));
                    in=(NodoA)in.getNext();
                }
                aux=(NodoV)aux.getNext();
            }
        SwingViewer viewer = new SwingViewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        viewer.enableAutoLayout();
        ViewPanel view = (ViewPanel) viewer.addDefaultView(false);
        return view;
        
    }
    
    protected static String styleSheet =
            "node {" +
            "size: 50px, 50px;\n" +
            "shape: circle;\n" +
            "fill-color: white;\n" +
            "stroke-mode: plain;\n" +
            "stroke-color: #99CCFF;\n"+
            "stroke-width: 3;\n"+
            "text-size: 16;\n"+
            "text-alignment: center;}" +
            "node: clicked{"+
            "fill-color: #99CCFF;\n" +
            "stroke-mode: plain;\n" +
            "stroke-color: #99CCFF;\n"+
            "stroke-width: 5;}"+
            "edge {" +
            "fill-color: #333333;\n"+
            "size: 3;\n"+
            "shape: line;\n"+
            "arrow-size: 16,10;\n"+
            "text-background-mode: rounded-box;\n"+
            "text-background-color: #99CCFF;\n"+
            "text-color: black;\n"+
            "text-size: 12;\n"+
            "text-style: bold;\n"+
            "text-padding: 5;\n"+
            "text-alignment: above;}";
    
    
    public static void write_txt(File file, Grafo grafo){
        String info="";
        if(!grafo.IsEmpty()){
            info+="Almacenes;\n";
            NodoV aux=(NodoV)grafo.vertex.getpFirst();
            while(aux!=null){
                info+="Almacen "+(String)aux.getData()+":\n";
                if(!aux.getStock().isEmpty()){
                NodoP stock = aux.getStock().getpFirst();
                while(stock.getNext()!=null){
                    info+= auxFunctions.UpperFirstLetter(stock.getNameP())+","+Integer.toString(stock.getStock())+"\n";
                    stock=stock.getNext();
                }
                stock=aux.getStock().getpLast();
                info+=auxFunctions.UpperFirstLetter(stock.getNameP())+","+Integer.toString(stock.getStock())+";\n";
                }
                aux=(NodoV) aux.getNext();
            }
            info+="Rutas;\n";
            aux=(NodoV)grafo.vertex.getpFirst();
            while(aux!=null){
                ListA ady = aux.getAdy();
                NodoA in =(NodoA) ady.getpFirst();
                while(in!=null){
                    NodoV dest =(NodoV) in.getData();
                    info+=(String)aux.getData()+","+(String)dest.getData()+","+Float.toString(in.getWeight())+"\n";
                    in=(NodoA)in.getNext();
                }
                aux=(NodoV)aux.getNext();
            }
            
        }
        try{
            PrintWriter pw = new PrintWriter(file);
            pw.print(info); 
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
   public static void read_txt(File file, Grafo grafo){
        String read = "";
        String line;
        File f = file;
        try {
            if(!f.exists()){
                f.createNewFile();
            }
            else{
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                while((line=br.readLine())!=null){
                    if(!line.isEmpty()){
                        read+=line+"\n";}
                }
                         
            if(!"".equals(read)){
                String[] split_txt=read.split("\n");
                boolean mode=true;
                NodoV almacen=null;
                int ID=0;
                for (int i=0; i<split_txt.length;i++){
                    if(split_txt[i].contains(";")){
                        if(split_txt[i].equals("Almacenes;")){
                            mode=true;
                        }
                        else if(split_txt[i].equals("Rutas;")){
                            mode=false;
                        }
                    }
                    else if(split_txt[i].contains(":")){
                        String[] alm_info= split_txt[i].split(" ");
                        String name= alm_info[1].replace(":", "");
                        grafo.NewVertex(name);
                        almacen=grafo.getList().Search(name);
                        almacen.setId(ID);
                        ID++;
                    }
                    if(split_txt[i].contains(",")){
                        if(mode){
                            String[] product_info = split_txt[i].split(",");
                            int stock = validations.validateInt(product_info[1]);
                            almacen.newStockP(product_info[0].toLowerCase(), stock);
                            
                        }
                        else{
                        String[] arc_split=split_txt[i].split(",");
                        grafo.NewArc(arc_split[0], arc_split[1],validations.validateFloat(arc_split[2]));
                        
                    }
                    }
                }
                
            }
            
            br.close();
            JOptionPane.showMessageDialog(null, "Cargada Exitosa");
            }
            
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
   }

