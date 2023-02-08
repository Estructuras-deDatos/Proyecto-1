package proyecto.pkg1;

/**
 *
 * @author andre
 */
public class NodoV {
    private Object origen;
    private NodoV sig;
    private NodoV ant;
    private NodoA ady;
    private NodoA fAdy;
    private int nAristas;
    
    public NodoV(Object origen){
        this.origen=origen;
        this.sig=null;
        this.ant=null;
        this.ady=null;
        this.fAdy=null;
        nAristas=0;
    }
    
    public NodoA BuscarArista(NodoV destino){
        if (ady.getDestino()==destino){
            return ady;
        }
        else if (fAdy.getDestino()==destino){
            return fAdy;
        }
        else {
            NodoA aux=ady;
            boolean encontrado=false;
            NodoA retorno = null;
        while (aux.getSig()!= null){
            if(aux.getDestino()==destino){
                encontrado=true;
                retorno=aux;
            }
            aux=aux.getSig();  
        }
        if (encontrado){
            return retorno;
        }
        else{ return null;}
    }
    }
    
    public void InsertarArista(float peso, NodoV destino){
        NodoA nuevaArista = new NodoA(destino);
        nuevaArista.setPeso(peso);
        if (ady==null){
            ady=fAdy=nuevaArista;
        } else{
            nuevaArista.setAnt(fAdy);
            fAdy.setSig(nuevaArista);
            fAdy=nuevaArista;
        }
        nAristas++;  
    }

    
    public void ImprimirAristas(){
        NodoA aux= ady;
        System.out.println("All the arcs for the grafo");
        for (int i=0; i<nAristas;i++){
            System.out.print(origen);
            System.out.println(aux.getDestino().getOrigen());
            System.out.println(aux.getPeso());
            aux=aux.getSig();
        }
    }
    /**
     * @return the origen
     */
    public Object getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(Object origen) {
        this.origen = origen;
    }

    /**
     * @return the sig
     */
    public NodoV getSig() {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoV sig) {
        this.sig = sig;
    }

    /**
     * @return the ady
     */
    public NodoA getAdy() {
        return ady;
    }

    /**
     * @param ady the ady to set
     */
    public void setAdy(NodoA ady) {
        this.ady = ady;
    }

    /**
     * @return the nAristas
     */
    public int getnAristas() {
        return nAristas;
    }

    /**
     * @param nAristas the nAristas to set
     */
    public void setnAristas(int nAristas) {
        this.nAristas = nAristas;
    }

    /**
     * @return the ant
     */
    public NodoV getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(NodoV ant) {
        this.ant = ant;
    }

    /**
     * @return the fAdy
     */
    public NodoA getfAdy() {
        return fAdy;
    }

    /**
     * @param fAdy the fAdy to set
     */
    public void setfAdy(NodoA fAdy) {
        this.fAdy = fAdy;
    }
    
           
    
}
