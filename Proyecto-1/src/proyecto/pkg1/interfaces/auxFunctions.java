package proyecto.pkg1.interfaces;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import proyecto.pkg1.abstracts.Nodo;
import proyecto.pkg1.grafo.NodoP;
import proyecto.pkg1.grafo.NodoV;

/**
 * Esta clase define los métodos empleados dentro de la interfaz gráfica del programa. 
 * @author: beatrizcardozo
 * @version: 24/02/2023
 */

public class auxFunctions {
    
    /**
     * Método que activa una serie de botones. 
     * @param buttons El parámetro buttons define un arreglo con los botones que se activaran.
     */
    public void verifyFile(JButton[] buttons){ ;
        if(!windowUploadFile.loaded){
            for (JButton b : buttons){
                b.setEnabled(false);
            }  
        } else {
            for (JButton b : buttons){
                b.setEnabled(true);
            }  
        }
    } //Cierre del método
    
    /**
     * Método que genera un arreglo de Strings con los nombres de los almacenes existentes.
     * @return Arreglo de Strings que consta de los identificadores de los almacenes.
     */
    public String [] arrayWarehouseNames(){
        String[] names = new String[windowMain.grafo.getList().getSize()];
        Nodo temporal = windowMain.grafo.getList().getpFirst();
        for (int i = 0; i < windowMain.grafo.getList().getSize(); i++) {
            names[i] = (String)temporal.getData();
            temporal = temporal.getNext();
        }
        return names;
    } //Cierre del método
    
    /**
     * Método que valida que los caracteres que el usuario puede ingresar en un determinado JTextField sean letras. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     * * @param txtField El parámetro txtField define un objeto JTextField.
     * * @param caracters El parámetro caracters define un Integer que condiciona la cantidad de caracteres a ingresar.
     */
    public void verifyString(java.awt.event.KeyEvent evt, JTextField txtField, int caracters){
        int key = evt.getKeyChar();
        boolean capletters = key >= 65 && key <= 90;
        boolean lowerletters = key >= 97 && key <= 122;
        boolean space = key == 32;
         if (!(lowerletters || capletters || space)){
            evt.consume();}
         
        if (txtField.getText().trim().length() == caracters) {
            evt.consume();
        }
    } //Cierre del método
    
    
    /**
     * Método que valida que los caracteres que el usuario puede ingresar en un determinado JTextField sean números. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     * * @param txtField El parámetro txtField define un objeto JTextField.
     * * @param caracters El parámetro caracters define un Integer que condiciona la cantidad de caracteres a ingresar.
     */
    public void verifyInt(java.awt.event.KeyEvent evt, JTextField txtField, int caracters){
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros){
            evt.consume();
        }
        if (txtField.getText().trim().length() == caracters) {
            evt.consume();
        }
    } //Cierre del método
    
    
    /**
     * Método que valida que todos los campos de texto esten llenos. 
     * @param txtField El parámetro txtField define un objeto JTextField, que se validara tenga contenido.
     * @param txtField2 El parámetro txtField2 define un objeto JTextField, que se validara tenga contenido.
     * @param button El parámetro button define un objeto JButton que será el que invocará este método.
     */
    public boolean enabledButtons(JTextField txtField, JTextField txtField2, JButton button) {
        boolean nextWindow = false;
        if (txtField.getText().equals("") || txtField2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Importante: Debe rellenar los todos los campos.", "Alerta!", JOptionPane.INFORMATION_MESSAGE,windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png")); 
            nextWindow = false;
        } else {
            nextWindow = true; 
        }
        return nextWindow; 
    } //Cierre del método
    
    /**
     * Método que devuelve un String con la primera letra en mayúscula. 
     * @param str El parámetro str define el String que cambiara su primer carácter a mayúscula.
     * @return El String modificado con su primer caracter en mayúscula
     */
    public static String UpperFirstLetter(String str){
        String res = str.substring(0, 1).toUpperCase() + str.substring(1); 
        return res;
    } //Cierre del método
    
    
    /**
     * Método que devuelve un objeto de la clase NodoP si se encuentra, en caso opuesto, devuelve null. 
     * @param nodo El parámetro nodo define un Objeto de la clase NodoV
     * @param product El parámetro product define un objeto String con el nombre del producto a buscar.
     * @return El NodoV en caso de que se halla encontrado, si no, null.
     */
    public NodoP searchProduct(NodoV nodo, Object product){
        NodoP aux = (NodoP)nodo.getStock().getpFirst();
        for (int i = 0; aux!=null;aux= (NodoP)aux.getNext()){
           if(product.equals(aux.getNameP().toLowerCase())){
               return aux;
           }   
       }
       return null;
    } //Cierre del método
    
    /**
     * Método que modifica un label, según lo ingresado en un JTextField. 
     * @param txtfield El parámetro txtfield define el campo de texto del que se toman los caracteres.
     * @param label El parámetro label define el JLabel a modificar.
     */
    public void textFieldDidChange(JTextField txtfield, JLabel label) {
        label.setText(txtfield.getText());
    } //Cierre del método
    
    
    /**
     * Método que modifica un label según el elemento seleccionado en un jComboBox. 
     * @param comboBox El parámetro comboBox define del JComboBox del que se tomara el elemento seleccionado.
     * @param label El parámetro label define el JLabel del que se modificará el texto.
     * @param txtArea El parámetro txtArea define donde se imprimiran los datos del elemento seleccionado.
     * @param setString El parámetro setString define un dato tipo String.
     */
    public void setDefault(JComboBox comboBox, JLabel label, JTextArea txtArea, String setString){
        String string = String.valueOf(comboBox.getSelectedItem());
        label.setText("Productos Disponibles en Almacen " + string + ":");
        windowStock.NodoWh = windowMain.grafo.getList().Search(string);
        txtArea.setText(windowStock.NodoWh.getStock().Print());
    }
    //Cierre del método
    
    /**
     * Método que devuelve el objeto ImageIcon para asignar a un JOptionPane. 
     * @param image El parámetro image define un String con la dirección donde se guarda el archivo de la imagen.
     * @return objeto ImageIcon del icono en la dirección de archivo.
     */
    public ImageIcon setJOptionPaneImage(String image){
        final ImageIcon icon = new ImageIcon(image);
        return icon;
    } //Cierre del método

    
    /**
     * Método que verifica si selecciono un elemento de la lista. 
     * @param lista El parámetro list define la lista donde se verificará si existe un elemento seleccionado.
     * @return boolean, true si un elemento ha sido seleccionado y false en caso contrario.
     */
    public boolean checkListSelec(JList list){
        boolean selected = false;
        if(list.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Importante: Debes seleccionar un elemento de la lista!.", "Alerta!",JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png")); 
            selected = false;
        } else{
            selected = true;
        }
        
        return selected;  
    } //Cierre del método
} //Cierre de la clase
