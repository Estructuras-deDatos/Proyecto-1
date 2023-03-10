package proyecto.pkg1.interfaces;
import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyecto.pkg1.grafo.Grafo;
import proyecto.pkg1.grafo.NodoV;
import proyecto.pkg1.grafo.functions;

/**
 * Esta clase, JFrame window, define objetos que interactuan con el usuario para la subida de archivos a leer por el programa. 
 * @author: beatrizcardozo
 * @version: 24/02/2023
 */

public class windowUploadFile extends javax.swing.JFrame {
    
    //Campos de la clase
    public static File file;
    public static boolean loaded;
    boolean read;
    
    /**
     * Constructor para la clase windowUploadFile
     */
    public windowUploadFile() {
        setUndecorated(true);
        initComponents();
        setSize(700, 600);
        setLocationRelativeTo(null);
        boolean read= false;
    } //Cierre del Constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filePath = new javax.swing.JTextField();
        selectFileButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        uploadFileButton = new javax.swing.JButton();
        saveFileButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Incluya el archivo de texto requerido, para estructurar el grafo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 520, 40));

        filePath.setEditable(false);
        filePath.setBackground(new java.awt.Color(204, 204, 204));
        filePath.setForeground(new java.awt.Color(0, 0, 0));
        filePath.setOpaque(true);
        jPanel1.add(filePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 290, -1));

        selectFileButton.setBackground(new java.awt.Color(153, 204, 255));
        selectFileButton.setForeground(new java.awt.Color(0, 0, 0));
        selectFileButton.setText("Adjuntar");
        selectFileButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectFileButton.setBorderPainted(false);
        selectFileButton.setOpaque(true);
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 140, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cargar Archivo: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 370, -1));

        uploadFileButton.setBackground(new java.awt.Color(153, 204, 255));
        uploadFileButton.setForeground(new java.awt.Color(0, 0, 0));
        uploadFileButton.setText("Cargar");
        uploadFileButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        uploadFileButton.setBorderPainted(false);
        uploadFileButton.setOpaque(true);
        uploadFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadFileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(uploadFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 140, 30));

        saveFileButton.setBackground(new java.awt.Color(153, 204, 255));
        saveFileButton.setForeground(new java.awt.Color(0, 0, 0));
        saveFileButton.setText("Guardar");
        saveFileButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        saveFileButton.setBorderPainted(false);
        saveFileButton.setOpaque(true);
        saveFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(153, 204, 255));
        jSeparator1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 40));

        jLabel1.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gesti??n de Archivo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 220, -1));

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("<  Atr??s");
        backButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backButton.setOpaque(true);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Guardar Archivo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 130, -1));

        jLabel5.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Si desea guardar o actualizar los datos, en su archivo de texto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 440, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * M??todo invocado cuando el usuario realiza una acci??n, selectFileButton cuando ha sido presionado. 
     * @param evt El par??metro evt contiene la informaci??n del evento llevado a cabo por el usuario.
     */
    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        if (loaded){JOptionPane.showMessageDialog(this, "Advertencia: si carga otro archivo, se borrar?? su informaci??n previa.", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png"));}
        JFileChooser chooser = new JFileChooser();
        try{
        if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            file=chooser.getSelectedFile();
            filePath.setText(file.getAbsolutePath());
            read = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo!", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png"));
            read = false;
        }}
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error adjuntando el archivo", "Importante", JOptionPane.INFORMATION_MESSAGE, windowMain.auxFunc.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/PROYECTO/Proyecto-1/Proyecto-1/src/proyecto/pkg1/interfaces/images/alertIcon.png"));
        }
    }//GEN-LAST:event_selectFileButtonActionPerformed
    //Cierre del m??todo
    
    /**
     * M??todo invocado cuando el usuario realiza una acci??n, uploadFileButton cuando ha sido presionado. 
     * @param evt El par??metro evt contiene la informaci??n del evento llevado a cabo por el usuario.
     */
    private void uploadFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFileButtonActionPerformed
        
        if(read){
           windowMain.grafo = new Grafo();
            functions.read_txt(file, windowMain.grafo); 
            try{
            NodoV last = (NodoV) windowMain.grafo.getList().getpLast();
            windowMain.WareId= last.getId()+1;
            loaded = true;}
            catch(Exception e){
                    loaded = false;
            }
        }
        else {
           loaded = false;
       }
    }//GEN-LAST:event_uploadFileButtonActionPerformed
    //Cierre del metodo
    
    /**
     * M??todo invocado cuando el usuario realiza una acci??n, saveFileButton cuando ha sido presionado. 
     * @param evt El par??metro evt contiene la informaci??n del evento llevado a cabo por el usuario.
     */
    private void saveFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileButtonActionPerformed
        functions.write_txt(file, windowMain.grafo);
    }//GEN-LAST:event_saveFileButtonActionPerformed
    //Cierre del m??todo
    
    /**
     * M??todo invocado cuando el usuario realiza una acci??n, backButton cuando ha sido presionado. 
     * @param evt El par??metro evt contiene la informaci??n del evento llevado a cabo por el usuario.
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        windowMain main = new windowMain();
        main.show();
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed
    //Cierre del m??todo
    
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
            java.util.logging.Logger.getLogger(windowUploadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowUploadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowUploadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowUploadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowUploadFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField filePath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton saveFileButton;
    private javax.swing.JButton selectFileButton;
    private javax.swing.JButton uploadFileButton;
    // End of variables declaration//GEN-END:variables
}   //Cierre de la clase
