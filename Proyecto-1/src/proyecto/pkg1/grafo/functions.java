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


/**
 *
 * @author andre
 */
public class functions {
    
    /* esta es la funcion a implementar de realizar pedido, recibe el grafo general, 
    el Nodo del almacen seleccionado para el pedido, y el nombre (string) del producto que se requiere
    
    Retorna un array que tienen
    [0] - la distancia que hay entre el almacen mas cercano con el producto
    [1] - la ruta que debe tomar para llegar al almacen
    [2] - el NodoV del almacen al cual se le pediria el producto
    */
    
    public static Object[] getClosestWarehouse(Grafo grafo, NodoV selW, String prod){
        Object[] result = new Object[3];
        ListV warehouses = getWarehouses(grafo, prod);
        NodoV aux =(NodoV) warehouses.getpFirst();
        NodoV closestWarehouse=null;
        float distance;
        String route;
        Float distMin =Float.POSITIVE_INFINITY;
        String final_route="";
        while(aux!=null){
            Object[] temp = getWay((NodoV) aux.getData(), selW,(NodoV) aux.getData());
            distance = (float) temp[0];
            route=(String) temp[1];
            if(distance<distMin){
                distMin=distance;
                final_route=route;
                closestWarehouse = (NodoV) aux.getData();
            }
            aux=(NodoV)aux.getNext();
        }
        result[0] = distMin;
        result[1]=final_route;
        result[2]=closestWarehouse;
        return result;
    }
    
    public static ListV getWarehouses(Grafo grafo, String prod){
        ListV warehouses = grafo.getList();
        ListV result = new ListV();
        NodoV aux = (NodoV)warehouses.getpFirst();
        while(aux!=null){
            NodoP found = aux.getStock().Search(prod);
            if(found!=null){
                result.Insert(aux);
            }
            aux=(NodoV)aux.getNext();
        }
        return result;
    }
    
    public static Object[] getWay(NodoV origen, NodoV destino, NodoV inicio){
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
        }else if ((NodoV) aux.getData()!=inicio){
            int count =0;
            while(count < list.getSize()){
                distance=aux.getWeight();
                route=(String)origen.getData()+" - ";
                result= getWay((NodoV)aux.getData(), destino, inicio);
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
    
    public static NodoV find_beginning(Grafo grafo){
        ListV vertex = grafo.getList();
        NodoV aux =(NodoV) vertex.getpFirst();
        NodoV beginning = aux;
        int comp;
        String name;
        while(aux!=null){
            name=(String)beginning.getData();
            comp = name.compareTo((String)aux.getData());
            if(comp>0){
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
        String report = "Recorrido en Anchura de la Disponibilidad de los Almacenes:\n";
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
                    report+=aux.print_stock();
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
                NodoP stock = aux.getStock().getpFirst();
                while(stock.getNext()!=null){
                    info+=stock.getNameP()+","+Integer.toString(stock.getStock())+"\n";
                    stock=stock.getNext();
                }
                stock=aux.getStock().getpLast();
                info+=stock.getNameP()+","+Integer.toString(stock.getStock())+";\n";
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
                    }
                    if(split_txt[i].contains(",")){
                        if(mode){
                            String[] product_info = split_txt[i].split(",");
                            int stock = validations.validateInt(product_info[1]);
                            almacen.newStockP(product_info[0], stock);
                            
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

