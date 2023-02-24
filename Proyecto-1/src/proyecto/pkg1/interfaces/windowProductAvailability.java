package proyecto.pkg1.interfaces;

/**
 *
 * @author beatrizcardozo
 */
public class windowProductAvailability extends javax.swing.JFrame {

    /**
     * Creates new form windowProductAvailability
     */
    public windowProductAvailability() {
        setUndecorated(true);
        initComponents();
        setSize(700, 600);
        setLocationRelativeTo(null);
        BFSTextArea.setText(windowMain.func.BFS_report(windowMain.grafo));
        DFSTextArea.setText(windowMain.func.DFS_report(windowMain.grafo));
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
        backButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DFSTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        BFSTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton1.setBackground(new java.awt.Color(153, 204, 255));
        backButton1.setForeground(new java.awt.Color(0, 0, 0));
        backButton1.setText("<  Atrás");
        backButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backButton1.setOpaque(true);
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        jLabel1.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reportes de Disponibilidad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 204, 255));
        jSeparator1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 10));

        jLabel7.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Recorrido en Profundidad (DFS)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Recorrido en Anchura (BFS)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        DFSTextArea.setEditable(false);
        DFSTextArea.setBackground(new java.awt.Color(204, 204, 204));
        DFSTextArea.setColumns(20);
        DFSTextArea.setForeground(new java.awt.Color(0, 0, 0));
        DFSTextArea.setRows(5);
        jScrollPane3.setViewportView(DFSTextArea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 290, 330));

        BFSTextArea.setEditable(false);
        BFSTextArea.setBackground(new java.awt.Color(204, 204, 204));
        BFSTextArea.setColumns(20);
        BFSTextArea.setForeground(new java.awt.Color(0, 0, 0));
        BFSTextArea.setRows(5);
        jScrollPane4.setViewportView(BFSTextArea);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        windowMain main = new windowMain();
        main.show();
        this.setVisible(false);
    }//GEN-LAST:event_backButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(windowProductAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowProductAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowProductAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowProductAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowProductAvailability().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BFSTextArea;
    private javax.swing.JTextArea DFSTextArea;
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
