package proyecto.pkg1.interfaces;
import javax.swing.JOptionPane;
import proyecto.pkg1.grafo.NodoV;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para la gestión de ordenes del programa. 
 * @author: beatrizcardozo
 * @version: 24/02/2023
 */
public class windowOrders1 extends javax.swing.JFrame {
    
    /**
     * Constructor para la clase windowOrders1
     */
    public windowOrders1() {
        setUndecorated(true);
        initComponents();
        setSize(700, 600);
        setLocationRelativeTo(null); 
    } //Cierre del constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        auxFunctions auxfunctions = new auxFunctions();
        warehouseJList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextButton.setBackground(new java.awt.Color(153, 204, 255));
        nextButton.setForeground(new java.awt.Color(0, 0, 0));
        nextButton.setText("Continuar");
        nextButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nextButton.setOpaque(true);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 200, 30));

        jLabel4.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cédula: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, -1));

        nameTextField.setBackground(new java.awt.Color(204, 204, 204));
        nameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 220, -1));

        jLabel3.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre Completo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Almacenes Disponibles");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

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

        jLabel7.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese los siguientes datos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        dniTextField.setBackground(new java.awt.Color(204, 204, 204));
        dniTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dniTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(dniTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 220, -1));

        warehouseJList.setBackground(new java.awt.Color(204, 204, 204));
        warehouseJList.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 14)); // NOI18N
        warehouseJList.setForeground(new java.awt.Color(0, 0, 0));
        warehouseJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = auxfunctions.arrayWarehouseNames();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        warehouseJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        warehouseJList.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(warehouseJList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 370, 230));

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
     * Método invocado cuando el usuario realiza una acción, nextButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if(windowMain.auxFunc.enabledButtons(nameTextField, dniTextField, nextButton) && windowMain.auxFunc.checkListSelec(warehouseJList)){ 
            String warehouseName = warehouseJList.getSelectedValue();
            NodoV warehouseNodo = windowMain.grafo.getList().Search(warehouseName);
            if (warehouseNodo.getStock().getSize() > 0){
                windowOrders2 pedidos2 = new windowOrders2(warehouseNodo);
                this.setVisible(false);
                pedidos2.show();
            } else {
                JOptionPane.showMessageDialog(this, "Este almacen no posee productos. Disculpe las molestias!", "Atención!", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/ordersIcon.png"));
            }
        }//Cierre del método
    }//GEN-LAST:event_nextButtonActionPerformed
    
    /**
     * Método invocado cuando el usuario realiza una acción, nameTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void nameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyTyped
        windowMain.auxFunc.verifyString(evt, nameTextField, 15);
    }//GEN-LAST:event_nameTextFieldKeyTyped
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, dniTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void dniTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniTextFieldKeyTyped
        windowMain.auxFunc.verifyInt(evt, dniTextField, 9);
    }//GEN-LAST:event_dniTextFieldKeyTyped
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
            java.util.logging.Logger.getLogger(windowOrders1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowOrders1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowOrders1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowOrders1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowOrders1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JList<String> warehouseJList;
    // End of variables declaration//GEN-END:variables
} //Cierre de la clase
