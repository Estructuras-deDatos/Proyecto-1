package proyecto.pkg1.interfaces;
import javax.swing.JOptionPane;
import proyecto.pkg1.grafo.NodoV;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para añadir almacenes y caminos al grafo del programa. 
 * @author: beatrizcardozo
 * @version: 24/02/2023
 */
public class windowWarehouse extends javax.swing.JFrame {

    /**
     * Constructor para la clase windowWarehouse
     */
    public windowWarehouse() {
        setUndecorated(true);
        initComponents();
        setSize(700, 600);
        setLocationRelativeTo(null); 
        fromTextField.show(false);
        toTextField.show(false);
    } //Cierre del Constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        warehouseNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fromTextField = new javax.swing.JLabel();
        firstwhJComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        firstwhDistanceTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addWarehouseButton = new javax.swing.JButton();
        secondwhDistanceTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        secondwhJComboBox = new javax.swing.JComboBox<>();
        toTextField = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        fromTextField1 = new javax.swing.JLabel();
        inicialWarehouseJComboBox = new javax.swing.JComboBox<>();
        endWarehouseJComboBox = new javax.swing.JComboBox<>();
        toTextField1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        distanceTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        addPathButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(153, 204, 255));
        jSeparator1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 20));

        jLabel1.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestión de Almacenes y Rutas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 360, -1));

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

        jTabbedPane1.setBackground(new java.awt.Color(153, 204, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Para añadir un nuevo almacen, ingrese los siguientes datos:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        warehouseNameTextField.setBackground(new java.awt.Color(204, 204, 204));
        warehouseNameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        warehouseNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                warehouseNameTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                warehouseNameTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(warehouseNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 220, -1));

        jLabel3.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese los Almacenes Cercanos y sus respectivas distancias:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        fromTextField.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        fromTextField.setForeground(new java.awt.Color(0, 0, 0));
        fromTextField.setText("Desde nuevo almacen, hasta:");
        jPanel2.add(fromTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        firstwhJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        firstwhJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        firstwhJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(windowMain.auxFunc.arrayWarehouseNames()));
        jPanel2.add(firstwhJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, -1));

        jLabel8.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Distancia:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        firstwhDistanceTextField.setBackground(new java.awt.Color(204, 204, 204));
        firstwhDistanceTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstwhDistanceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstwhDistanceTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(firstwhDistanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 70, -1));

        jLabel6.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("km.");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        addWarehouseButton.setBackground(new java.awt.Color(153, 204, 255));
        addWarehouseButton.setForeground(new java.awt.Color(0, 0, 0));
        addWarehouseButton.setText("Añadir Almacen");
        addWarehouseButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addWarehouseButton.setOpaque(true);
        addWarehouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWarehouseButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addWarehouseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 200, 30));

        secondwhDistanceTextField.setBackground(new java.awt.Color(204, 204, 204));
        secondwhDistanceTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        secondwhDistanceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                secondwhDistanceTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(secondwhDistanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        jLabel4.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Distancia:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("km.");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        secondwhJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        secondwhJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        secondwhJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(windowMain.auxFunc.arrayWarehouseNames()));
        jPanel2.add(secondwhJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 160, -1));

        toTextField.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        toTextField.setForeground(new java.awt.Color(0, 0, 0));
        toTextField.setText("Hasta nuevo almacen, desde:");
        jPanel2.add(toTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jTabbedPane1.addTab("Almacenes", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Para añadir un nuevo camino, ingrese los siguientes datos:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        fromTextField1.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        fromTextField1.setForeground(new java.awt.Color(0, 0, 0));
        fromTextField1.setText("Almacen Origen:");
        jPanel3.add(fromTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 20));

        inicialWarehouseJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        inicialWarehouseJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        inicialWarehouseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(windowMain.auxFunc.arrayWarehouseNames()));
        jPanel3.add(inicialWarehouseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 160, 20));

        endWarehouseJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        endWarehouseJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        endWarehouseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(windowMain.auxFunc.arrayWarehouseNames()));
        jPanel3.add(endWarehouseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 160, -1));

        toTextField1.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        toTextField1.setForeground(new java.awt.Color(0, 0, 0));
        toTextField1.setText("Almacen Destino:");
        jPanel3.add(toTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Distancia:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        distanceTextField.setBackground(new java.awt.Color(204, 204, 204));
        distanceTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        distanceTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                distanceTextFieldKeyTyped(evt);
            }
        });
        jPanel3.add(distanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 150, -1));

        jLabel13.setFont(new java.awt.Font("Kohinoor Devanagari", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("km.");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        addPathButton.setBackground(new java.awt.Color(153, 204, 255));
        addPathButton.setForeground(new java.awt.Color(0, 0, 0));
        addPathButton.setText("Añadir Camino");
        addPathButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addPathButton.setOpaque(true);
        addPathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPathButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addPathButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 200, 30));

        jTabbedPane1.addTab("Caminos", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 570, 470));

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
     * Método invocado cuando el usuario realiza una acción, addWarehouseButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void addWarehouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWarehouseButtonActionPerformed
        if(windowMain.auxFunc.enabledButtons(firstwhDistanceTextField, secondwhDistanceTextField, addWarehouseButton)){
            String warehouseName = warehouseNameTextField.getText();
            if(String.valueOf(firstwhJComboBox.getSelectedItem()).equals(secondwhJComboBox.getSelectedItem())){
                JOptionPane.showMessageDialog(this, "Importante: Debes ingresar dos almacenes diferentes.", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png"));
            } else if(windowMain.grafo.VertexExists(warehouseName)){
                JOptionPane.showMessageDialog(this, "Importante: Este almacen ya esta registrado!", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png"));
                warehouseNameTextField.setText("");
                firstwhJComboBox.setSelectedIndex(0);
                secondwhJComboBox.setSelectedIndex(0);
                fromTextField.show(false);
                toTextField.show(false);
                firstwhDistanceTextField.setText("");
                secondwhDistanceTextField.setText("");
            }
            else {
                windowMain.grafo.NewVertex(warehouseName);
                NodoV aux = (NodoV)windowMain.grafo.getList().Search(warehouseName);
                aux.setId(windowMain.WareId);
                windowMain.WareId++;
                windowMain.grafo.NewArc(warehouseName, firstwhJComboBox.getSelectedItem(), Float.valueOf(firstwhDistanceTextField.getText()));
                windowMain.grafo.NewArc(secondwhJComboBox.getSelectedItem(), warehouseName,Float.valueOf(secondwhDistanceTextField.getText()));
                JOptionPane.showMessageDialog(this, "Almacen registrado con éxito!", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/storageIcon.png"));
                 warehouseNameTextField.setText("");
                firstwhJComboBox.setSelectedIndex(0);
                secondwhJComboBox.setSelectedIndex(0);
                fromTextField.show(false);
                toTextField.show(false);
                firstwhDistanceTextField.setText("");
                secondwhDistanceTextField.setText("");
                inicialWarehouseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(windowMain.auxFunc.arrayWarehouseNames()));
                endWarehouseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(windowMain.auxFunc.arrayWarehouseNames()));
            }
        }
    }//GEN-LAST:event_addWarehouseButtonActionPerformed
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, secondwhDistanceTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void secondwhDistanceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secondwhDistanceTextFieldKeyTyped
        windowMain.auxFunc.verifyInt(evt, secondwhDistanceTextField, 3);
    }//GEN-LAST:event_secondwhDistanceTextFieldKeyTyped
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, firstwhDistanceTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void firstwhDistanceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstwhDistanceTextFieldKeyTyped
        windowMain.auxFunc.verifyInt(evt, firstwhDistanceTextField, 3);
    }//GEN-LAST:event_firstwhDistanceTextFieldKeyTyped
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, warehouseNameTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void warehouseNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_warehouseNameTextFieldKeyTyped
        windowMain.auxFunc.verifyString(evt, warehouseNameTextField, 10);
    }//GEN-LAST:event_warehouseNameTextFieldKeyTyped
    //Cierre el método
    
    /**
     * Método invocado cuando el usuario realiza una acción, warehouseNameTextField cuando se ingresa un carácter dentro del JTextField y 
     se modifica un label simultaneamente. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void warehouseNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_warehouseNameTextFieldKeyReleased
        fromTextField.setText("Desde " + warehouseNameTextField.getText() + ", hasta: ");
        fromTextField.show();
        toTextField.setText("Hasta " + warehouseNameTextField.getText() + ", desde: ");
        toTextField.show();
    }//GEN-LAST:event_warehouseNameTextFieldKeyReleased
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, distanceTextField cuando se ingresa un carácter dentro del JTextField. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void distanceTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distanceTextFieldKeyTyped
         windowMain.auxFunc.verifyInt(evt, secondwhDistanceTextField, 3);
    }//GEN-LAST:event_distanceTextFieldKeyTyped
    //Cierre del método
    
    
    /**
     * Método invocado cuando el usuario realiza una acción, addPathButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void addPathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPathButtonActionPerformed
        if(windowMain.auxFunc.enabledButtons(distanceTextField, distanceTextField, addPathButton)){
            float distance = Float.parseFloat(distanceTextField.getText());
            if(String.valueOf(inicialWarehouseJComboBox.getSelectedItem()).equals(endWarehouseJComboBox.getSelectedItem())){
                JOptionPane.showMessageDialog(this, "Importante: Debes ingresar dos almacenes diferentes.", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png"));
            } else if(windowMain.grafo.ArcExists(inicialWarehouseJComboBox.getSelectedItem(),endWarehouseJComboBox.getSelectedItem())){
                JOptionPane.showMessageDialog(this, "Importante: Este camino ya esta existe!", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png"));
                distanceTextField.setText("");
                inicialWarehouseJComboBox.setSelectedIndex(0);
                endWarehouseJComboBox.setSelectedIndex(0);
                distanceTextField.setText("");
            } else {
                windowMain.grafo.NewArc(inicialWarehouseJComboBox.getSelectedItem(), endWarehouseJComboBox.getSelectedItem(), distance);
                JOptionPane.showMessageDialog(this, "Camino registrado con éxito!", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/storageIcon.png"));
                distanceTextField.setText("");
                inicialWarehouseJComboBox.setSelectedIndex(0);
                endWarehouseJComboBox.setSelectedIndex(0);
                distanceTextField.setText("");
            }
        }
    }//GEN-LAST:event_addPathButtonActionPerformed
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
            java.util.logging.Logger.getLogger(windowWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowWarehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPathButton;
    private javax.swing.JButton addWarehouseButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField distanceTextField;
    private javax.swing.JComboBox<String> endWarehouseJComboBox;
    private javax.swing.JTextField firstwhDistanceTextField;
    private javax.swing.JComboBox<String> firstwhJComboBox;
    private javax.swing.JLabel fromTextField;
    private javax.swing.JLabel fromTextField1;
    private javax.swing.JComboBox<String> inicialWarehouseJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField secondwhDistanceTextField;
    private javax.swing.JComboBox<String> secondwhJComboBox;
    private javax.swing.JLabel toTextField;
    private javax.swing.JLabel toTextField1;
    private javax.swing.JTextField warehouseNameTextField;
    // End of variables declaration//GEN-END:variables
}   //Cierre de la clase
