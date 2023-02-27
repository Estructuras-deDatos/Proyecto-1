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
 * Esta clase define metodos estaticos para el manejo y procesamiento de las demas clases
 * @author Andreina Rivas
 * @version 24/02/2022
 */
public class functions {
    
    /**
     * Metodo para revisar si el producto ingresado por el usuario ya ha sido añadido a la lista de productos agregados a un pedido
     * @param order Lista de productos ordenados
     * @param input Nombre del producto ingresado
     * @return Valor logico correspondiente a si el producto ya ha sido agregado al pedido
     */
    
    public static boolean checkOrdered(ListV order, String input){
        NodoV aux = (NodoV) order.getpFirst();
        boolean ordered=false;
        while(aux!=null){
            Object [] info = (Object[]) aux.getData();
            String product = (String)info[1];
            if(product.toLowerCase().equals(input.toLowerCase())){
                ordered=true;
            }
            aux=(NodoV) aux.getNext();
        }
        return ordered;
    }
    
    /**
     * Metodo para actualizar los inventarios de los almacenes a los que se les realizan los pedidos una vez confirmado el pedido
     * @param order Lista que contiene la informacion de los productos y cantidad pedidas en los almacenes correspondientes
     */
    
    public static void updateStock(ListV order){
        NodoV aux = (NodoV) order.getpFirst();
        while(aux!=null){
            Object [] info = (Object[]) aux.getData();
            NodoV warehouse =(NodoV) info[0];
            String product = (String)info[1];
            Integer quant = (Integer) info[2];
            NodoP toUpdate = warehouse.getStock().Search(product.toLowerCase());
            if(toUpdate!=null){
            toUpdate.setStock(toUpdate.getStock()-quant);
            warehouse.getStock().update();
            aux=(NodoV)aux.getNext();}
            
        }
        order.Empty();
        
    }
    
    /**
     * Metodo recursivo para realizar el recorrido en profundidad del grafo
     * @param g Grafo de los almacenes
     * @param v indice del vertice correspondiente
     * @param visitados Arreglo de valores logicos si los slmacenes son visitados 
     * @return Una cadena con toda la informacion de los almacenes en terminos de disponibilidad de productos siguiendo el orden del recorrido
     */
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
    
    /**
     * Metodo para relanzar el recorrido en profundidad del grafo
     * @param g Grafo a recorrer
     * @return  Una cadena con toda la informacion de los almacenes en terminos de disponibilidad de productos siguiendo el orden del recorrido
     */
    
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
    
    /**
     * Metodo para manejar los pedidos a almacenes que no tienen disponibilidad de inventario del producto requerido
     * @param grafo Grafo de los almacenes
     * @param selW el NodoV correspondiente al almacen seleccioado por el usuario
     * @param prod Nombre del producto requerido por el usuario
     * @param quan Cantidad del producto que se desea obtener
     * @return Un arreglo de obtejos que contiene:
     * array[0] - valor logico que indica si hay un almacen con suficiente stock para cubrir el restante del pedido 
     * o si no hay suficiente inventario disponible en otro almacen para cubrir el pedido
     * array[1] - La minima distancia entre los almacenes
     * array[2] - La ruta entre los almacenes
     * array[3] - El objeto NodoV del cual se esta haciendo el pedido auxiliar
     * array[4] - La cantidad de productos que se estan pidiendo en el almacen auxiliar
     * o null si no hay disponibilidad del producto en ningun otro almacen
     * 
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
    
    /**
     * Metodo para hallar el almacen con el maximo inventario de un producto seleccionado y la ruta mas corta del mismo al seleccionado
     * @param grafo Grafo de almacenes
     * @param selW el Nodo del almacen seleccionado por el usuario
     * @param prod Nombre del producto deseado
     * @return Un arreglo de objetos que contiene la informacion de la busqueda
     * @see manageStockRequests()
     */
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
    
    /**
     * Metodo para hallar el almacen mas cercano al seleccionado con disponibilidad de inventario para complementar el pedido hecho 
     * @param grafo Grafo de almacenes
     * @param selW el Nodo del almacen seleccionado por el usuario
     * @param prod Nombre del producto seleccionado
     * @param quant Cantidad del producto que se debe buscar en los almacenes
     * @return Un arreglo de objetos que contiene la informacion de la busqueda
     * @see manageStockRequests()
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
    
    /**
     * Metodo para buscar los almacenes que tienen disponibilidad de producto e inventario del producto seleccionado
     * @param grafo Grafo de almacenes
     * @param selW el Nodo del almacen seleccionado por el usuario
     * @param prod Nombre del producto seleccionado
     * @param quant Cantidad del producto que se debe buscar en los almacenes
     * @return La lista de los almacenes encontrados
     */
    
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
    
    /**
     * Metodo recursivo aplicando el algoritmo de Dijkstra para hallar el camino mas corto entre el almacen con el inventario disponible
     * y el almacen seleccionado
     * @param origen el Nodo correspondiente al origen del camino, el almacen con el inventario disponible
     * @param destino el Nodo seleccionado por el usuario, a donde debe llegar el camino
     * @param inicio el Nodo del que inicia el camino 
     * @param visited Lista de los almacenes que ya se han visitado en el recorrido
     * @return un arreglo de objetos con la informacion de la busqueda
     * array[0] - la minima distancia que se recorre
     * array[1] - la ruta mas corta buscada
     */
    
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
    
    /**
     * Metodo para revisar si un almacen ya ha sido visitado en la busqueda del camino mas corto
     * @param visited Lista de los almacenes visitados
     * @param aux el Nodo a revisar si ha sido visitado
     * @return Valor logico correspondiente a si el almacen esta en la lista o no
     */
    
    public static boolean check_visited(ListV visited, NodoV aux){
        if(!visited.isEmpty()){
            return visited.Search(aux.getData())!= null;
        }else{
            return false;
        }
    }
    
    /**
     * Metodo para hallar el almacen con el menor ID para establecer el incio del recorrido en amplitud
     * @param grafo Grafo de almacenes
     * @return el Nodo con el menor ID
     */
 
    
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
    
    /**
     * Metodo que revisa si un vertice ha sido visitado en el recorrido en amplitud
     * @param aux Nodo que se desea revisar
     * @param visited Lista de vertices visitados
     * @return Valor logico correspondiente a si el almacen esta en la lista o no
     */
    public static boolean has_been_visited(Object aux, ListV visited){
       return visited.Search(aux)!=null;
    }
    
    /**
     * Metodo para generar una cadena con toda la informacion de los almacenes siguiendo el orden del recorrido en amplitud
     * @param grafo Grafo de almacenes
     * @return Cadena con toda la informacion de los almacenes
     */
    
    
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
    
    /**
     * Metodo para crear el view panel con la representacion grafica del grafo construido basado en la libreria graphstream
     * @param grafo Grafo de almacenes
     * @return ViewPanel a ser incrustrado en la ventana correspondiente
     */
    
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
    /**
     * Variable que define la estetica de la representacion grafica del grafo
     */
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
    
    /**
     * Metodo para realizar el guardado del archivo de manera que se actualice la informacion guardada
     * @param file Archivo en el que se realiza el guardado
     * @param grafo  Grafo de almacenes 
     */
    
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
            JOptionPane.showMessageDialog(null, "Guardado Ha Fallado");
        }
    }
    
    /**
     * Metodo para leer el archivo de texto y cargar la estructura de datos con la informacion dada
     * @param file el Archivo a leer
     * @param grafo la estructura de datos a cargar
     */
    
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
            JOptionPane.showMessageDialog(null, "Carga ha fallado \n Asegurese que el archivo es correcto");
        }
        
    }
   }

