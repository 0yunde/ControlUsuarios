
package interfaces;

import java.sql.*;
import conexion_bd_cu.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * @author Victor Alejandro Rojas Yovaniniz
 */

public class RestaurarContrasena extends javax.swing.JFrame {

    String user = "", user_update = "";
    public RestaurarContrasena() {
        initComponents();
        //Recuperar el nombre usuario desde la interfaz de login para ocuparlo en la interfaz administrador
        user = Login.user;
        user_update = GestionarUsuarios.user_update;
        
        //Variable con de función bandera para las jerarquías
        setResizable(false);//Negar que sea modificable la interfaz
        setTitle("Restaurar contraseña de " + user_update); //Nombre de la interfaz y nombre de usuario
        setLocationRelativeTo(null); //Centrar interfaz
        //Evita que el programa finalice al cerrar registro de usuarios
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); 
    }
    
    //Icono de barra de tareas y programa 
     @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
        return retValue;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_cambioContrasena = new javax.swing.JLabel();
        lbl_contrasenaUno = new javax.swing.JLabel();
        lbl_contrasenaDos = new javax.swing.JLabel();
        txt_contrasenaUno = new javax.swing.JPasswordField();
        txt_contrasenaDos = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        chk_contrasenaUno = new javax.swing.JCheckBox();
        chk_contrasenaDos = new javax.swing.JCheckBox();
        lbl_acl = new javax.swing.JLabel();
        lbl_oyunde = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cambioContrasena.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_cambioContrasena.setForeground(new java.awt.Color(204, 204, 204));
        lbl_cambioContrasena.setText("Restaurar contraseña");
        getContentPane().add(lbl_cambioContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbl_contrasenaUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_contrasenaUno.setForeground(new java.awt.Color(204, 204, 204));
        lbl_contrasenaUno.setText("Ingrese contraseña");
        getContentPane().add(lbl_contrasenaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lbl_contrasenaDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_contrasenaDos.setForeground(new java.awt.Color(204, 204, 204));
        lbl_contrasenaDos.setText("Repita la contraseña");
        getContentPane().add(lbl_contrasenaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txt_contrasenaUno.setBackground(new java.awt.Color(204, 204, 204));
        txt_contrasenaUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_contrasenaUno.setForeground(new java.awt.Color(51, 51, 51));
        txt_contrasenaUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contrasenaUno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_contrasenaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));

        txt_contrasenaDos.setBackground(new java.awt.Color(204, 204, 204));
        txt_contrasenaDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_contrasenaDos.setForeground(new java.awt.Color(51, 51, 51));
        txt_contrasenaDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contrasenaDos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_contrasenaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restablecer.png"))); // NOI18N
        jButton1.setText("Restaurar contraseña");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 260, 30));

        chk_contrasenaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_contrasenaUnoActionPerformed(evt);
            }
        });
        getContentPane().add(chk_contrasenaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        chk_contrasenaDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_contrasenaDosActionPerformed(evt);
            }
        });
        getContentPane().add(chk_contrasenaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        lbl_acl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aclLogo.png"))); // NOI18N
        getContentPane().add(lbl_acl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 30));

        lbl_oyunde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/oyu.png"))); // NOI18N
        getContentPane().add(lbl_oyunde, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoNegro.png"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String contrasena_1 , contrasena_2;
        
        contrasena_1 = txt_contrasenaUno.getText().trim();
        contrasena_2 = txt_contrasenaDos.getText().trim();
        //Condición para vacías
        if (!contrasena_1.equals("") && !contrasena_2.equals("")) {
            //Condición de coincidencias
            if(contrasena_1.equals(contrasena_2)){
                try {
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement(
                            "update usuarios set password=? where username= '" + user_update + "'");
                    pst.setString(1, contrasena_1);
                    pst.executeUpdate();
                    cn.close();
                    
                    txt_contrasenaUno.setBackground(Color.green);
                    txt_contrasenaDos.setBackground(Color.green);
                    
                    JOptionPane.showMessageDialog(null, "Restauracion exitosa.");
                    this.dispose();
                } catch(SQLException e) {
                    System.err.println("Error en restaurar contraseña" + e);
                }
            }else{
                txt_contrasenaDos.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            }
        }else {
            txt_contrasenaUno.setBackground(Color.red);
            txt_contrasenaDos.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "No se admiten contraseñas vacias.");
            
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chk_contrasenaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_contrasenaUnoActionPerformed
        if(chk_contrasenaUno.isSelected()) {
            txt_contrasenaUno.setEchoChar((char)0);
        }else {
            txt_contrasenaUno.setEchoChar('*');
        }
    }//GEN-LAST:event_chk_contrasenaUnoActionPerformed

    private void chk_contrasenaDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_contrasenaDosActionPerformed
        // TODO add your handling code here:
        if(chk_contrasenaDos.isSelected()) {
            txt_contrasenaDos.setEchoChar((char)0);
        }else {
            txt_contrasenaDos.setEchoChar('*');
        }
    }//GEN-LAST:event_chk_contrasenaDosActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarContrasena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk_contrasenaDos;
    private javax.swing.JCheckBox chk_contrasenaUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_acl;
    private javax.swing.JLabel lbl_cambioContrasena;
    private javax.swing.JLabel lbl_contrasenaDos;
    private javax.swing.JLabel lbl_contrasenaUno;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_oyunde;
    private javax.swing.JPasswordField txt_contrasenaDos;
    private javax.swing.JPasswordField txt_contrasenaUno;
    // End of variables declaration//GEN-END:variables
}
