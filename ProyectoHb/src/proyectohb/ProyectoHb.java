/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectohb;

/**
 *
 * @author Windows 10
 */
public class ProyectoHb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListS lista = new ListS();
        lista.Insert("Laptop", 20);
        lista.Insert("cuestion", 0);
        lista.Insert("qui", 21);
        lista.Insert("como", 17);
        NodoP como = lista.Search("como");
        System.out.println(como.getNext());
        lista.Remove("qui");
        lista.Remove("Laptop");
        lista.Remove("si");
        lista.Remove("cuestion");
        System.out.println(lista.Print());
        
        
    }
    
}
