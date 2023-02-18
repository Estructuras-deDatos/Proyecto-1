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

/**
 *
 * @author andre
 */
public class functions {
    
    
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

