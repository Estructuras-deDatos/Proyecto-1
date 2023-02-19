/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.pkg1.interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author beatrizcardozo
 */
public class window2Pedidos extends javax.swing.JFrame {

    /**
     * Creates new form window2Pedidos
     */
    public window2Pedidos() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); 
        setSize(700, 600);
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
        realizarPedidoButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        realizarPedidoButton.setBackground(new java.awt.Color(153, 204, 255));
        realizarPedidoButton.setForeground(new java.awt.Color(0, 0, 0));
        realizarPedidoButton.setText("Realizar Pedido");
        realizarPedidoButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        realizarPedidoButton.setOpaque(true);
        realizarPedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarPedidoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(realizarPedidoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 180, 30));

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

        jLabel5.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Productos Disponibles en");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 250, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 400, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        window1Pedidos pedidos = new window1Pedidos();
        pedidos.show();
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void realizarPedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarPedidoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Prueba");
    }//GEN-LAST:event_realizarPedidoButtonActionPerformed

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
                new window2Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton realizarPedidoButton;
    // End of variables declaration//GEN-END:variables
}
