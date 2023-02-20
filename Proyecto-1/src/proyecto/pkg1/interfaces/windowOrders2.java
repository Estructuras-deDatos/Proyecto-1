package proyecto.pkg1.interfaces;

import javax.swing.JOptionPane;
import proyecto.pkg1.grafo.NodoV;


/**
 *
 * @author beatrizcardozo
 */
public class windowOrders2 extends javax.swing.JFrame {
    
    static NodoV NodoWh;

    /**
     * Creates new form window2Pedidos
     */
    public windowOrders2(NodoV NodoWh) {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); 
        setSize(700, 600);
        this.NodoWh = NodoWh;
        mainLabel.setText("Productos Disponibles en Almacen " + NodoWh.getData());
        availableProductsTextArea.setText(NodoWh.getStock().Print());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 190, -1));

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
        productTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTextFieldActionPerformed(evt);
            }
        });
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        windowOrders1 pedidos = new windowOrders1();
        pedidos.show();
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addtoOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoOrderButtonActionPerformed
        String numeropedido = qtyTextField.getText();
        String nombreproducto = productTextField.getText();
        
        windowMain.auxFunc.enabledButtons(qtyTextField, productTextField, addtoOrderButton);
        
        
        
        //listaProductosaPedirTextArea.setText("* " + nombreproducto + ": " + numeropedido + " unidades.");
    }//GEN-LAST:event_addtoOrderButtonActionPerformed

    private void confirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmOrderButtonActionPerformed

    private void productTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTextFieldActionPerformed

    }//GEN-LAST:event_productTextFieldActionPerformed

    private void productTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productTextFieldKeyTyped
        windowMain.auxFunc.verifyString(evt, productTextField, 10);
    }//GEN-LAST:event_productTextFieldKeyTyped

    private void qtyTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTextFieldKeyTyped
        windowMain.auxFunc.verifyInt(evt, qtyTextField, 10);
    }//GEN-LAST:event_qtyTextFieldKeyTyped

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
}
