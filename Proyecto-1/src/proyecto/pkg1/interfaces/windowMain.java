package proyecto.pkg1.interfaces;
import javax.swing.JButton;
import org.graphstream.ui.swing_viewer.ViewPanel;
import proyecto.pkg1.grafo.Grafo;
import proyecto.pkg1.grafo.functions;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario en la página principal del programa. 
 * @author: beatrizcardozo
 * @version: 24/02/2023
 */

public class windowMain extends javax.swing.JFrame {

    //Campos de la clase
    public static Grafo grafo;
    static public auxFunctions auxFunc;
    static public functions func;
    static public ViewPanel graph;
    public static int WareId;
    
    /**
     * Constructor para la clase windowMain
     */
    public windowMain() {
        initComponents();
        setSize(700, 600);
        setLocationRelativeTo(null);
        auxFunc = new auxFunctions();
        JButton[] buttons = {pedidoButton,verGrafoButton, disponibilidadButton, gestionStockButton,gestionAlmacenButton}; 
        auxFunc.verifyFile(buttons);
    } //Cierre del Constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPanel = new javax.swing.JPanel();
        verGrafoButton = new javax.swing.JButton();
        disponibilidadButton = new javax.swing.JButton();
        gestionStockButton = new javax.swing.JButton();
        pedidoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        gestionAlmacenButton = new javax.swing.JButton();
        cargarArchivoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPanel.setBackground(new java.awt.Color(255, 255, 255));
        panelPanel.setMaximumSize(new java.awt.Dimension(700, 600));
        panelPanel.setMinimumSize(new java.awt.Dimension(700, 600));
        panelPanel.setPreferredSize(new java.awt.Dimension(700, 600));
        panelPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verGrafoButton.setBackground(new java.awt.Color(153, 204, 255));
        verGrafoButton.setFont(new java.awt.Font("Kannada Sangam MN", 1, 14)); // NOI18N
        verGrafoButton.setForeground(new java.awt.Color(0, 0, 0));
        verGrafoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/grafoIcon.png"))); // NOI18N
        verGrafoButton.setText("Visualizar Grafo");
        verGrafoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verGrafoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verGrafoButton.setOpaque(true);
        verGrafoButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        verGrafoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        verGrafoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGrafoButtonActionPerformed(evt);
            }
        });
        panelPanel.add(verGrafoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, 130));

        disponibilidadButton.setBackground(new java.awt.Color(153, 204, 255));
        disponibilidadButton.setFont(new java.awt.Font("Kannada Sangam MN", 1, 14)); // NOI18N
        disponibilidadButton.setForeground(new java.awt.Color(0, 0, 0));
        disponibilidadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/productIcon.png"))); // NOI18N
        disponibilidadButton.setText("Disponibilidad del Producto");
        disponibilidadButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        disponibilidadButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        disponibilidadButton.setOpaque(true);
        disponibilidadButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        disponibilidadButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        disponibilidadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibilidadButtonActionPerformed(evt);
            }
        });
        panelPanel.add(disponibilidadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 130));

        gestionStockButton.setBackground(new java.awt.Color(153, 204, 255));
        gestionStockButton.setFont(new java.awt.Font("Kannada Sangam MN", 1, 14)); // NOI18N
        gestionStockButton.setForeground(new java.awt.Color(0, 0, 0));
        gestionStockButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/stockIcon.png"))); // NOI18N
        gestionStockButton.setText("Gestión de stock por almacén");
        gestionStockButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gestionStockButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gestionStockButton.setOpaque(true);
        gestionStockButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gestionStockButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gestionStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionStockButtonActionPerformed(evt);
            }
        });
        panelPanel.add(gestionStockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 180, 130));

        pedidoButton.setBackground(new java.awt.Color(153, 204, 255));
        pedidoButton.setFont(new java.awt.Font("Kannada Sangam MN", 1, 14)); // NOI18N
        pedidoButton.setForeground(new java.awt.Color(0, 0, 0));
        pedidoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/ordersIcon.png"))); // NOI18N
        pedidoButton.setText("Realizar Pedido");
        pedidoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pedidoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pedidoButton.setOpaque(true);
        pedidoButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pedidoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoButtonActionPerformed(evt);
            }
        });
        panelPanel.add(pedidoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 180, 130));

        jLabel1.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Menú ");
        panelPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 80, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 204, 255));
        jSeparator1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        panelPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 40));

        gestionAlmacenButton.setBackground(new java.awt.Color(153, 204, 255));
        gestionAlmacenButton.setFont(new java.awt.Font("Kannada Sangam MN", 1, 14)); // NOI18N
        gestionAlmacenButton.setForeground(new java.awt.Color(0, 0, 0));
        gestionAlmacenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/storageIcon.png"))); // NOI18N
        gestionAlmacenButton.setText("Gestión de Almacenes y Rutas");
        gestionAlmacenButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gestionAlmacenButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gestionAlmacenButton.setOpaque(true);
        gestionAlmacenButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gestionAlmacenButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gestionAlmacenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionAlmacenButtonActionPerformed(evt);
            }
        });
        panelPanel.add(gestionAlmacenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 210, 130));

        cargarArchivoButton.setBackground(new java.awt.Color(153, 204, 255));
        cargarArchivoButton.setFont(new java.awt.Font("Kannada Sangam MN", 1, 14)); // NOI18N
        cargarArchivoButton.setForeground(new java.awt.Color(0, 0, 0));
        cargarArchivoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/interfaces/images/fileIcon.png"))); // NOI18N
        cargarArchivoButton.setText("Administrar Archivo");
        cargarArchivoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cargarArchivoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cargarArchivoButton.setOpaque(true);
        cargarArchivoButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cargarArchivoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cargarArchivoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoButtonActionPerformed(evt);
            }
        });
        panelPanel.add(cargarArchivoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 210, 130));

        getContentPane().add(panelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método invocado cuando el usuario realiza una acción, verGrafoButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void verGrafoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGrafoButtonActionPerformed
        graph= functions.create_graph(grafo);
        windowShowGraph windowGrafo1 = new windowShowGraph();
        windowGrafo1.show();
        this.setVisible(false);
    }//GEN-LAST:event_verGrafoButtonActionPerformed
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, disponibilidadButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void disponibilidadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibilidadButtonActionPerformed
        windowProductAvailability windowPA = new windowProductAvailability();
        windowPA.show();
        this.setVisible(false);
    }//GEN-LAST:event_disponibilidadButtonActionPerformed
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, gestionStockButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void gestionStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionStockButtonActionPerformed
        windowStock windowStock1 = new windowStock();
        windowStock1.show();
        setVisible(false);
    }//GEN-LAST:event_gestionStockButtonActionPerformed
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, pedidoButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void pedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoButtonActionPerformed
        windowOrders1 windowPedidos = new windowOrders1();
        windowPedidos.show();
        setVisible(false);
    }//GEN-LAST:event_pedidoButtonActionPerformed
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, gestionAlmacenButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void gestionAlmacenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionAlmacenButtonActionPerformed
        windowWarehouse windowAlmacen = new windowWarehouse();
        windowAlmacen.show();
        setVisible(false);
    }//GEN-LAST:event_gestionAlmacenButtonActionPerformed
    //Cierre del método
    
    /**
     * Método invocado cuando el usuario realiza una acción, cargarArchivoButton cuando ha sido presionado. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     */
    private void cargarArchivoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoButtonActionPerformed
        windowUploadFile windowCargar = new windowUploadFile();
        windowCargar.show();
        setVisible(false);
    }//GEN-LAST:event_cargarArchivoButtonActionPerformed
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
            java.util.logging.Logger.getLogger(windowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarArchivoButton;
    private javax.swing.JButton disponibilidadButton;
    private javax.swing.JButton gestionAlmacenButton;
    private javax.swing.JButton gestionStockButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelPanel;
    private javax.swing.JButton pedidoButton;
    private javax.swing.JButton verGrafoButton;
    // End of variables declaration//GEN-END:variables
} //Cierre de la clase
