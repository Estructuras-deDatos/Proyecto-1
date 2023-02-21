package proyecto.pkg1.interfaces;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import proyecto.pkg1.abstracts.Nodo;
import proyecto.pkg1.grafo.NodoP;


/**
 *
 * @author beatrizcardozo
 */
public class auxFunctions {
    
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
    }
    
    public String [] arrayWarehouseNames(){
        String[] names = new String[windowMain.grafo.getList().getSize()];
        Nodo temporal = windowMain.grafo.getList().getpFirst();
        for (int i = 0; i < windowMain.grafo.getList().getSize(); i++) {
            names[i] = (String)temporal.getData();
            temporal = temporal.getNext();
        }
        return names;
    }
    
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
    }
    
    public void verifyInt(java.awt.event.KeyEvent evt, JTextField txtField, int caracters){
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros){
            evt.consume();
        }
        if (txtField.getText().trim().length() == caracters) {
            evt.consume();
        }
    }
    
    public boolean enabledButtons(JTextField txtField, JTextField txtField2, JButton button) {
        boolean nextWindow = false;
     if (txtField.getText().equals("") || txtField2.getText().equals("")){
       JOptionPane.showMessageDialog(null, "Importante: Debe rellenar los todos los campos."); 
       nextWindow = false;
     } else {
         nextWindow = true; 
     }
     return nextWindow; 

    }
    
    
    public NodoP searchProduct(Object product){
        NodoP aux = windowStock.NodoWh.getStock().getpFirst();
        for (int i = 0; aux!=null;aux= (NodoP)aux.getNext()){
           if(product.equals(aux.getNameP().toLowerCase())){
               return aux;
           }   
       }
       return null;
    }
    
    public void textFieldDidChange(JTextField txtfield, JLabel label) {
        label.setText(txtfield.getText());
       }
    
    public void setDefault(JComboBox comboBox, JLabel label, JTextArea txtArea, String setString){
        String string = String.valueOf(comboBox.getSelectedItem());
        label.setText("Productos Disponibles en Almacen " + string + ":");
        windowStock.NodoWh = windowMain.grafo.getList().Search(string);
        txtArea.setText(windowStock.NodoWh.getStock().Print());
    }

    public boolean checkListSelec(JList list){
        boolean selected = false;
        if(list.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Importante: Debes seleccionar un elemento de la lista!."); 
            selected = false;
        } else{
            selected = true;
        }
        
        return selected;  
    }
}
