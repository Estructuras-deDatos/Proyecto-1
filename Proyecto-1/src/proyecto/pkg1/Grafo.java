/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

/**
 *
 * @author andre
 */
public class Grafo {

    private NodoV Pvertice;
    private NodoV Fvertice;
    private int tamano;

    public Grafo() {
        this.Pvertice = null;
        this.Fvertice = null;
        this.tamano = 0;

    }

    public boolean ExisteArista(Object origen, Object destino) {
        NodoV nodoOrigen = this.BuscarVertice(origen);
        NodoV nodoDestino = this.BuscarVertice(destino);
        Object resultado = nodoOrigen.BuscarArista(nodoDestino);
        return resultado != null;
    }

    public boolean ExisteVertice(Object vertice) {
        if (tamano!=0){
        Object resultado = this.BuscarVertice(vertice);
        return resultado != null;}
        else {return false;}
    }

    public void NuevoVertice(Object origen) {
        NodoV nuevoNodo = new NodoV(origen);
        if (Pvertice != null) {
            nuevoNodo.setAnt(Fvertice);
            Fvertice.setSig(nuevoNodo);
            Fvertice = nuevoNodo;
        } else {
            Pvertice = Fvertice = nuevoNodo;
        }
        tamano++;
        }
   

    /*primitiva que busca un vertice segun el ID del vertice y retorna el Nodo V
    correspondiente al ID buscado, retorna Null si no lo encuentra
     */
    public NodoV BuscarVertice(Object origen) {
        if (Pvertice.getOrigen() == origen) {
            return Pvertice;
        } else if (Fvertice.getOrigen() == origen) {
            return Fvertice;
        } else {
            NodoV aux = Pvertice;
            boolean encontrado = false;
            NodoV retorno = null;
            while (aux.getSig() != null) {
                if (aux.getOrigen() == origen) {
                    encontrado = true;
                    retorno = aux;
                }
                aux = aux.getSig();
            }
            if (encontrado) {
                return retorno;
            } else {
                return null;
            }
        }
    }

    public void NuevaArista(NodoV origen, NodoV destino, float peso) {
        origen.InsertarArista(peso, destino);
    }

    /* Imprime todos los IDs de la lista de vertices del grafo*/
    public void ImprimirVertices() {
        NodoV aux = Pvertice;
        for (int i = 0; i < tamano; i++) {
            System.out.println(aux.getOrigen());
            aux = aux.getSig();
        }

    }

    /**
     * @return the Pvertice
     */
    public NodoV getPvertice() {
        return Pvertice;
    }

    /**
     * @param Pvertice the Pvertice to set
     */
    public void setPvertice(NodoV Pvertice) {
        this.Pvertice = Pvertice;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the Fvertice
     */
    public NodoV getFvertice() {
        return Fvertice;
    }

    /**
     * @param Fvertice the Fvertice to set
     */
    public void setFvertice(NodoV Fvertice) {
        this.Fvertice = Fvertice;
    }

}
