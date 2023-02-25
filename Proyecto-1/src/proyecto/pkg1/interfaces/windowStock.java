package proyecto.pkg1.interfaces;
import javax.swing.JOptionPane;
import proyecto.pkg1.grafo.NodoV;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para la gestión de stock de cada almacen en el programa. 
 * @author: beatrizcardozo
 * @version: 24/02/2023
 */
public class windowStock extends javax.swing.JFrame {
    
    //Campos de la clase
    static NodoV NodoWh;

    /**
     * Constructor para la clase windowStock
     */
    public windowStock() {
        setUndecorated(true);
        initComponents();
        setSize(700, 600);
        setLocationRelativeTo(null);
        windowMain.auxFunc.setDefault(warehouseJComboBox, mainLabel, availableProductsTextArea, "Productos Disponibles en Almacen ");
    } //Cierre del Constructor
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        warehouseJComboBox = new javax.swing.JComboBox<>();
        addProductButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        availableProductsTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        mainLabel = new javax.swing.JLabel();
        qtyTextField = new javax.swing.JTextField();
        productTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("<  Atrás");
        backButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backButton.setOpaque(true);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        title.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Gestión de Stock");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 200, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 204, 255));
        jSeparator1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 40));

        jLabel3.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese los siguientes datos, para añadir un producto al almacen:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        warehouseJComboBox.setSelectedItem("----------");
        warehouseJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        warehouseJComboBox.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 14)); // NOI18N
        warehouseJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        warehouseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(windowMain.auxFunc.arrayWarehouseNames()));
        warehouseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(warehouseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 170, -1));

        addProductButton.setBackground(new java.awt.Color(153, 204, 255));
        addProductButton.setForeground(new java.awt.Color(0, 0, 0));
        addProductButton.setText("Añadir Producto");
        addProductButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addProductButton.setOpaque(true);
        addProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 200, 30));

        availableProductsTextArea.setEditable(false);
        availableProductsTextArea.setBackground(new java.awt.Color(204, 204, 204));
        availableProductsTextArea.setColumns(20);
        availableProductsTextArea.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        availableProductsTextArea.setRows(2);
        availableProductsTextArea.setTabSize(10);
        jScrollPane3.setViewportView(availableProductsTextArea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 390, 160));

        jLabel5.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        mainLabel.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(0, 0, 0));
        mainLabel.setText("Productos Disponibles en Almacen:");
        jPanel1.add(mainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        qtyTextField.setBackground(new java.awt.Color(204, 204, 204));
        qtyTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        qtyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(qtyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 120, -1));

        productTextField.setBackground(new java.awt.Color(204, 204, 204));
        productTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        productTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(productTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 120, -1));

        jLabel7.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Producto: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Seleccione un almacen para gestionar su stock:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado cuando el usuario realiza una acción, backButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
    */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        windowMain main = new windowMain();
        main.show();
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, addProductButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed
        if(windowMain.auxFunc.enabledButtons(qtyTextField, productTextField, addProductButton)){
            String product = productTextField.getText().toLowerCase();
            int qty = Integer.parseInt(qtyTextField.getText());
            if(windowMain.auxFunc.searchProduct(NodoWh, product) != null){
                JOptionPane.showMessageDialog(this, "Producto en el inventario: se le ha sumado al stock!", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/stockIcon.png"));
                windowMain.auxFunc.searchProduct(NodoWh, product).addStock(qty);
            } else {
                NodoWh.newStockP(windowMain.auxFunc.UpperFirstLetter(product), qty); }
            availableProductsTextArea.setText(NodoWh.getStock().Print());
        }  
    }//GEN-LAST:event_addProductButtonActionPerformed
    //Cierre del método

    /**
     * Método invocado cuando el usuario realiza una acción, en warehouseJComboBox cuando se ha seleccionado un elemento. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void warehouseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseJComboBoxActionPerformed
        windowMain.auxFunc.setDefault(warehouseJComboBox, mainLabel, availableProductsTextArea, "Productos Disponibles en Almacen ");
    }//GEN-LAST:event_warehouseJComboBoxActionPerformed
    //Cierre del método
 
    /**
     * Método invocado cuando el usuario realiza una acción, qtyTextField cuando se ingresa un carácter dentro del JTextField.  
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void qtyTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTextFieldKeyTyped
        windowMain.auxFunc.verifyInt(evt, qtyTextField, 9);
    }//GEN-LAST:event_qtyTextFieldKeyTyped
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, productTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void productTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productTextFieldKeyTyped
        windowMain.auxFunc.verifyString(evt, productTextField, 10);
    }//GEN-LAST:event_productTextFieldKeyTyped
    //Cierre del método
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(windowStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductButton;
    private javax.swing.JTextArea availableProductsTextArea;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextField productTextField;
    private javax.swing.JTextField qtyTextField;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> warehouseJComboBox;
    // End of variables declaration//GEN-END:variables
} //Cierre de la clase
