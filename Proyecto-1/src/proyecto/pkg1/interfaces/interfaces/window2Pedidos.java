/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.pkg1.interfaces;

import javax.swing.JOptionPane;
import proyecto.pkg1.grafo.NodoV;


/**
 *
 * @author beatrizcardozo
 */
public class window2Pedidos extends javax.swing.JFrame {
    
    static NodoV NodoAlmacen;

    /**
     * Creates new form window2Pedidos
     */
    public window2Pedidos(NodoV NodoAlmacen) {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); 
        setSize(700, 600);
        this.NodoAlmacen = NodoAlmacen;
        label.setText("Productos Disponibles en Almacen " + NodoAlmacen.getData());
        productosDisponiblesTextArea.setText(NodoAlmacen.getStock().Print());
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
        añadirListaButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cantidadLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProductosaPedirTextArea = new javax.swing.JTextArea();
        productoTextField = new javax.swing.JTextField();
        cantidadTextField = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        productoLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        productosDisponiblesTextArea = new javax.swing.JTextArea();
        label = new javax.swing.JLabel();
        realizarPedidoButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        añadirListaButton.setBackground(new java.awt.Color(153, 204, 255));
        añadirListaButton.setForeground(new java.awt.Color(0, 0, 0));
        añadirListaButton.setText("Añadir");
        añadirListaButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        añadirListaButton.setOpaque(true);
        añadirListaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirListaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(añadirListaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 180, 30));

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

        listaProductosaPedirTextArea.setEditable(false);
        listaProductosaPedirTextArea.setBackground(new java.awt.Color(204, 204, 204));
        listaProductosaPedirTextArea.setColumns(20);
        listaProductosaPedirTextArea.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        listaProductosaPedirTextArea.setRows(5);
        jScrollPane2.setViewportView(listaProductosaPedirTextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 280, 170));

        productoTextField.setBackground(new java.awt.Color(204, 204, 204));
        productoTextField.setForeground(new java.awt.Color(0, 0, 0));
        productoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoTextFieldActionPerformed(evt);
            }
        });
        productoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productoTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(productoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 90, -1));

        cantidadTextField.setBackground(new java.awt.Color(204, 204, 204));
        cantidadTextField.setForeground(new java.awt.Color(0, 0, 0));
        cantidadTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(cantidadTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 90, -1));

        Label1.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        Label1.setForeground(new java.awt.Color(0, 0, 0));
        Label1.setText("Lista de Productos a pedir:");
        jPanel1.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 250, -1));

        productoLabel.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        productoLabel.setForeground(new java.awt.Color(0, 0, 0));
        productoLabel.setText("Producto:");
        jPanel1.add(productoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 70, -1));

        productosDisponiblesTextArea.setEditable(false);
        productosDisponiblesTextArea.setBackground(new java.awt.Color(204, 204, 204));
        productosDisponiblesTextArea.setColumns(20);
        productosDisponiblesTextArea.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        productosDisponiblesTextArea.setRows(2);
        productosDisponiblesTextArea.setTabSize(10);
        jScrollPane3.setViewportView(productosDisponiblesTextArea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 170));

        label.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setText("Productos Disponibles en");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 250, -1));

        realizarPedidoButton1.setBackground(new java.awt.Color(153, 204, 255));
        realizarPedidoButton1.setForeground(new java.awt.Color(0, 0, 0));
        realizarPedidoButton1.setText("Realizar Pedido");
        realizarPedidoButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        realizarPedidoButton1.setOpaque(true);
        realizarPedidoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarPedidoButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(realizarPedidoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        window1Pedidos pedidos = new window1Pedidos();
        pedidos.show();
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void añadirListaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirListaButtonActionPerformed
        String numeropedido = cantidadTextField.getText();
        String nombreproducto = productoTextField.getText();
        
        windowMain.auxFunc.enabledButtons(cantidadTextField, productoTextField, añadirListaButton);
        
        
        
        //listaProductosaPedirTextArea.setText("* " + nombreproducto + ": " + numeropedido + " unidades.");
    }//GEN-LAST:event_añadirListaButtonActionPerformed

    private void realizarPedidoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarPedidoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_realizarPedidoButton1ActionPerformed

    private void productoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoTextFieldActionPerformed

    }//GEN-LAST:event_productoTextFieldActionPerformed

    private void productoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productoTextFieldKeyTyped
        windowMain.auxFunc.verifyString(evt, productoTextField, 10);
    }//GEN-LAST:event_productoTextFieldKeyTyped

    private void cantidadTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadTextFieldKeyTyped
        windowMain.auxFunc.verifyInt(evt, cantidadTextField, 10);
    }//GEN-LAST:event_cantidadTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(window2Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window2Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window2Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window2Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window2Pedidos(NodoAlmacen).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JButton añadirListaButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JTextField cantidadTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label;
    private javax.swing.JTextArea listaProductosaPedirTextArea;
    private javax.swing.JLabel productoLabel;
    private javax.swing.JTextField productoTextField;
    private javax.swing.JTextArea productosDisponiblesTextArea;
    private javax.swing.JButton realizarPedidoButton1;
    // End of variables declaration//GEN-END:variables
}
