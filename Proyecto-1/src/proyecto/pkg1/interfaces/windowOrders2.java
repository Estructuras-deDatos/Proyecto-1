package proyecto.pkg1.interfaces;
import javax.swing.JOptionPane;
import proyecto.pkg1.grafo.NodoV;
import proyecto.pkg1.grafo.NodoP; 
import proyecto.pkg1.grafo.functions;
import proyecto.pkg1.grafo.ListV;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para la gestión de ordenes del programa. 
 * @author: beatrizcardozo
 * @version: 24/02/2023
 */
public class windowOrders2 extends javax.swing.JFrame {
    
    //Campos de la Clase
    static NodoV NodoWh;
    static ListV Order = new ListV();

    /**
     * Constructor para la clase windowOrders2
     * @param NodoWh El parámetro NodoWh define el Nodo que contiene la información del nodo correspondiente al almacen, seleccionado por el usuario.
     */
    public windowOrders2(NodoV NodoWh) {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); 
        setSize(700, 600);
        this.NodoWh = NodoWh;
        mainLabel.setText("Productos Disponibles en Almacen " + NodoWh.getData());
        availableProductsTextArea.setText(NodoWh.getStock().Print());
        confirmOrderButton.setEnabled(false);
    } //Cierre del constructor

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addtoOrderButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cantidadLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrdersTextArea = new javax.swing.JTextArea();
        productTextField = new javax.swing.JTextField();
        qtyTextField = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        productoLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        availableProductsTextArea = new javax.swing.JTextArea();
        mainLabel = new javax.swing.JLabel();
        confirmOrderButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addtoOrderButton.setBackground(new java.awt.Color(153, 204, 255));
        addtoOrderButton.setForeground(new java.awt.Color(0, 0, 0));
        addtoOrderButton.setText("Añadir");
        addtoOrderButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addtoOrderButton.setOpaque(true);
        addtoOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addtoOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 180, 30));

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

        jLabel1.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Realizar Pedidos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 220, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 204, 255));
        jSeparator1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 10));

        cantidadLabel.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        cantidadLabel.setForeground(new java.awt.Color(0, 0, 0));
        cantidadLabel.setText("Cantidad:");
        jPanel1.add(cantidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 60, -1));

        OrdersTextArea.setEditable(false);
        OrdersTextArea.setBackground(new java.awt.Color(204, 204, 204));
        OrdersTextArea.setColumns(20);
        OrdersTextArea.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        OrdersTextArea.setRows(5);
        jScrollPane2.setViewportView(OrdersTextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 280, 170));

        productTextField.setBackground(new java.awt.Color(204, 204, 204));
        productTextField.setForeground(new java.awt.Color(0, 0, 0));
        productTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(productTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 90, -1));

        qtyTextField.setBackground(new java.awt.Color(204, 204, 204));
        qtyTextField.setForeground(new java.awt.Color(0, 0, 0));
        qtyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(qtyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 90, -1));

        Label1.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        Label1.setForeground(new java.awt.Color(0, 0, 0));
        Label1.setText("Lista de Productos a pedir:");
        jPanel1.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 250, -1));

        productoLabel.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        productoLabel.setForeground(new java.awt.Color(0, 0, 0));
        productoLabel.setText("Producto:");
        jPanel1.add(productoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 70, -1));

        availableProductsTextArea.setEditable(false);
        availableProductsTextArea.setBackground(new java.awt.Color(204, 204, 204));
        availableProductsTextArea.setColumns(20);
        availableProductsTextArea.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        availableProductsTextArea.setRows(2);
        availableProductsTextArea.setTabSize(10);
        jScrollPane3.setViewportView(availableProductsTextArea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 170));

        mainLabel.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(0, 0, 0));
        mainLabel.setText("Productos Disponibles en");
        jPanel1.add(mainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 250, -1));

        confirmOrderButton.setBackground(new java.awt.Color(153, 204, 255));
        confirmOrderButton.setForeground(new java.awt.Color(0, 0, 0));
        confirmOrderButton.setText("Realizar Pedido");
        confirmOrderButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        confirmOrderButton.setOpaque(true);
        confirmOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(confirmOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método invocado cuando el usuario realiza una acción, backButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        windowOrders1 pedidos = new windowOrders1();
        pedidos.show();
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, addtoOrderButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void addtoOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoOrderButtonActionPerformed
        String qtyorder = qtyTextField.getText().trim();
        String productorder = productTextField.getText().toLowerCase().trim();
       if(windowMain.auxFunc.enabledButtons(qtyTextField, productTextField, addtoOrderButton)){
          if(!functions.checkOrdered(Order, productorder)){
           NodoP product = windowMain.auxFunc.searchProduct(NodoWh, productorder);
            if (product != null){
                if(product.enoughStock(Integer.parseInt(qtyorder))){
                    OrdersTextArea.append("* " + windowMain.auxFunc.UpperFirstLetter(productorder) + ": " + qtyorder + " unidades. \n");
                    availableProductsTextArea.setText(NodoWh.getStock().Print());
                    confirmOrderButton.setEnabled(true);
                    Object[] wanted = new Object[3];
                    wanted[0]=NodoWh;
                    wanted[1]=productorder;
                    wanted[2]=Integer.parseInt(qtyorder);
                    Order.Insert(wanted);
                    
                } else {
                    Object[] wanted = new Object[3];
                    wanted[0]=NodoWh;
                    wanted[1]=productorder;
                    wanted[2]=product.getStock();
                    Order.Insert(wanted);
                    Object[] array = functions.manageStockRequests(windowMain.grafo, NodoWh, productorder, Integer.parseInt(qtyorder));
                    if(array != null){
                       NodoV auxWh=(NodoV)array[3];
                       if((boolean)array[0]){
                           JOptionPane.showMessageDialog(this, "Advertencia: Este almacen no tiene suficiente stock! \n" + "Se le pedirá " + array[4]+ " " + productorder+ " al almacen " + auxWh.getData()+"\n Siguiendo la ruta "+ array[2], "Stock insuficiente!", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/ordersIcon.png"));
                           OrdersTextArea.append("* " + windowMain.auxFunc.UpperFirstLetter(productorder) + ": " + product.getStock() + " unidades. \n");
                           OrdersTextArea.append("* Pedido al " + "Almacen "+ auxWh.getData()+ ": " + windowMain.auxFunc.UpperFirstLetter(productorder) + ": " + array[4] + " unidades. \n");
                           availableProductsTextArea.setText(NodoWh.getStock().Print());
                           confirmOrderButton.setEnabled(true);
                           
                       }else{
                           JOptionPane.showMessageDialog(this, "Advertencia: No hay suficiente stock! \n" + "Se le pedirá un maximo de " + array[4]+ productorder+ " al almacen" + auxWh.getData()+"\n Siguiendo la ruta "+ array[2], "Stock insuficiente!", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/ordersIcon.png"));
                           OrdersTextArea.append("* " + windowMain.auxFunc.UpperFirstLetter(productorder) + ": " + product.getStock() + " unidades. \n");
                           OrdersTextArea.append("* Pedido al " + "Almacen "+ auxWh.getData()+ ": " + windowMain.auxFunc.UpperFirstLetter(productorder) + ": " + array[4] + " unidades. \n");
                           product.setStock(0);
                           confirmOrderButton.setEnabled(true);
                       }
                       Object[] auxWant = new Object[3];
                       auxWant[0]=auxWh;
                       auxWant[1]=productorder;
                       auxWant[2]=array[4];
                       Order.Insert(auxWant);
                    } else { 
                        JOptionPane.showMessageDialog(this, "Nota: Producto no Disponible en ninguno de nuestros almacenes!\n Su orden se procesara para la cantidad disponible en este almacen", "Stock insuficiente!", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/ordersIcon.png"));
                        OrdersTextArea.append("* " + windowMain.auxFunc.UpperFirstLetter(productorder) + ": " + Integer.toString(product.getStock()) + " unidades. \n");
                        availableProductsTextArea.setText(NodoWh.getStock().Print());
                        confirmOrderButton.setEnabled(true);
                    }
                }   
            } else {
                JOptionPane.showMessageDialog(this, "Atención!: Producto inexistente.", "Intentelo de nuevo!", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/ordersIcon.png"));
                productTextField.setText("");
                qtyTextField.setText("");
            }
           }
           else{
               JOptionPane.showMessageDialog(this, "Atencion!: Producto ya ingresado.", "Intentelo de nuevo!", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/ordersIcon.png"));
           }
       }
       //Cierre del método
    }//GEN-LAST:event_addtoOrderButtonActionPerformed
    
    /**
     * Método invocado cuando el usuario realiza una acción, productTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void productTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productTextFieldKeyTyped
        windowMain.auxFunc.verifyString(evt, productTextField, 10);
    }//GEN-LAST:event_productTextFieldKeyTyped
    //Cierre del método
    
    
    /**
     * Método invocado cuando el usuario realiza una acción, qtyTextField cuando se ingresa un carácter dentro del JTextField.  
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void qtyTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTextFieldKeyTyped
        windowMain.auxFunc.verifyInt(evt, qtyTextField, 10);
    }//GEN-LAST:event_qtyTextFieldKeyTyped
     //Cierre del método
    
    
    /**
     * Método invocado cuando el usuario realiza una acción, confirmOrderButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void confirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderButtonActionPerformed
        functions.updateStock(Order);
        JOptionPane.showMessageDialog(this, "Éxito: Pedido realizado con éxito!", "TRansacción exitosa!", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/ordersIcon.png"));
        this.dispose();
        windowMain main= new windowMain();
        main.show();
    }//GEN-LAST:event_confirmOrderButtonActionPerformed
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
            java.util.logging.Logger.getLogger(windowOrders2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowOrders2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowOrders2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowOrders2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowOrders2(NodoWh).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JTextArea OrdersTextArea;
    private javax.swing.JButton addtoOrderButton;
    private javax.swing.JTextArea availableProductsTextArea;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JButton confirmOrderButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextField productTextField;
    private javax.swing.JLabel productoLabel;
    private javax.swing.JTextField qtyTextField;
    // End of variables declaration//GEN-END:variables
} //Cierre de la clase
