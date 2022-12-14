/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;
import java.sql.*;
import conexion_bd_cu.Conexion;
import conexion_bd_cu.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Victor Alejandro Rojas Yovaniniz
 */
public class ActualizarUsuario extends javax.swing.JFrame {
    
    //Declarando variables , abstraer el nombre de usuario, actualizar el usuario seleccionado, y id para identificarlo
    String user = "" , user_update = "" ;
    int ID;
    
    public ActualizarUsuario() {
        initComponents();
        user = Login.user;
        //recuperando usuario seleccionado
        user_update = GestionarUsuarios.user_update;
        
        setSize(599, 430);
        setResizable(false);
        setTitle("Gestión de la cuenta " + user_update + " - Administrador " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        lbl_tituloMasNombre.setText("Gestion de la cuenta: " + user_update);
        
        //llenar los campos abstrayendo la info desde bd
        try {
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from usuarios where username = '" + user_update + "'");
            ResultSet rs = pst.executeQuery();
            
            //Estructura condicional dado que se hayan encontrado las concidencias de la consulta
            if(rs.next()){
                //recuperando el id de la base de datos
                ID = rs.getInt("id_usuario");
                txt_nombre.setText(rs.getString("nombre_usuario"));
                txt_email.setText(rs.getString("email"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_cuenta.setText(rs.getString("username"));
                txt_responsable.setText(rs.getString("registrado_por"));
                
                cmb_niveles.setSelectedItem(rs.getString("tipo_nivel"));
                cmb_estatus.setSelectedItem(rs.getString("estatus"));
            }
            cn.close();
        } catch (SQLException e) {
                System.err.println("Error al cargar usuario."+ e);
                JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");            
        }
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
        return retValue;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tituloMasNombre = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_tipoNivel = new javax.swing.JLabel();
        lbl_estatus = new javax.swing.JLabel();
        lbl_registradoPor = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_cuenta = new javax.swing.JTextField();
        cmb_niveles = new javax.swing.JComboBox<>();
        cmb_estatus = new javax.swing.JComboBox<>();
        btn_actualizar = new javax.swing.JButton();
        btn_RestaurarContrasena = new javax.swing.JButton();
        txt_responsable = new javax.swing.JTextField();
        lbl_acl = new javax.swing.JLabel();
        lbl_oyunde = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tituloMasNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_tituloMasNombre.setForeground(new java.awt.Color(204, 204, 204));
        lbl_tituloMasNombre.setText("Gestión del usuario: ");
        getContentPane().add(lbl_tituloMasNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lbl_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(204, 204, 204));
        lbl_nombre.setText("Nombre");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(204, 204, 204));
        lbl_email.setText("Email");
        getContentPane().add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lbl_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(204, 204, 204));
        lbl_telefono.setText("Teléfono");
        getContentPane().add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        lbl_username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(204, 204, 204));
        lbl_username.setText("Cuenta");
        getContentPane().add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        lbl_tipoNivel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_tipoNivel.setForeground(new java.awt.Color(204, 204, 204));
        lbl_tipoNivel.setText("Jerarquia");
        getContentPane().add(lbl_tipoNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        lbl_estatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_estatus.setForeground(new java.awt.Color(204, 204, 204));
        lbl_estatus.setText("Estatus");
        getContentPane().add(lbl_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        lbl_registradoPor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_registradoPor.setForeground(new java.awt.Color(204, 204, 204));
        lbl_registradoPor.setText("Responsable de registro ");
        getContentPane().add(lbl_registradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(51, 51, 51));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, -1));

        txt_email.setBackground(new java.awt.Color(204, 204, 204));
        txt_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(51, 51, 51));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, -1));

        txt_telefono.setBackground(new java.awt.Color(204, 204, 204));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(51, 51, 51));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));

        txt_cuenta.setBackground(new java.awt.Color(204, 204, 204));
        txt_cuenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_cuenta.setForeground(new java.awt.Color(51, 51, 51));
        txt_cuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 210, -1));

        cmb_niveles.setBackground(new java.awt.Color(204, 204, 204));
        cmb_niveles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmb_niveles.setForeground(new java.awt.Color(51, 51, 51));
        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        cmb_niveles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 210, -1));

        cmb_estatus.setBackground(new java.awt.Color(204, 204, 204));
        cmb_estatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmb_estatus.setForeground(new java.awt.Color(51, 51, 51));
        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmb_estatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 210, -1));

        btn_actualizar.setBackground(new java.awt.Color(204, 204, 204));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(51, 51, 51));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 210, -1));

        btn_RestaurarContrasena.setBackground(new java.awt.Color(204, 204, 204));
        btn_RestaurarContrasena.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_RestaurarContrasena.setForeground(new java.awt.Color(51, 51, 51));
        btn_RestaurarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restablecer.png"))); // NOI18N
        btn_RestaurarContrasena.setText("Restaurar contraseña");
        btn_RestaurarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestaurarContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_RestaurarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 210, -1));

        txt_responsable.setBackground(new java.awt.Color(204, 204, 204));
        txt_responsable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_responsable.setForeground(new java.awt.Color(51, 51, 51));
        txt_responsable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_responsable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_responsable.setEnabled(false);
        txt_responsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_responsableActionPerformed(evt);
            }
        });
        getContentPane().add(txt_responsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, -1));

        lbl_acl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aclLogo.png"))); // NOI18N
        getContentPane().add(lbl_acl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 30));

        lbl_oyunde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/oyu.png"))); // NOI18N
        getContentPane().add(lbl_oyunde, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 60, 60));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoGrande.png"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        int permisos_cmb , estatus_cmb, validacion = 0;
        String nombre , mail, telefono, username, pass , permisos_string = "", estatus_string = "" ;
        
        mail = txt_email.getText().trim();
        username = txt_cuenta.getText().trim();
        nombre = txt_nombre.getText().trim();
        telefono = txt_telefono.getText().trim();
        permisos_cmb = cmb_niveles.getSelectedIndex()+ 1;
        estatus_cmb = cmb_estatus.getSelectedIndex() + 1;
        
        //Estructura condicional para evitar campos vacios
        if(mail.equals("")){
            txt_email.setBackground(Color.red);
            //Si la condición se cumple, incrementar la variable en 1, evitar que el programa no inicie en ejecución bucle 
            validacion ++;
        }
        
        if(username.equals("")){
            txt_cuenta.setBackground(Color.red);
            validacion ++;
        }
        if(nombre.equals("")){
            txt_nombre.setBackground(Color.red);
            validacion ++;
        }
        if(telefono.equals("")){
            txt_telefono.setBackground(Color.red);
            validacion ++;
        }
        
        //valida que todos los campos estan llenos 
        if(validacion == 0){
            //Cambiar los valores enteros a caracteres de jerarquia
            if(permisos_cmb == 1){
                permisos_string = "Administrador";
            }else if (permisos_cmb == 2){
                permisos_string = "Usuario";
            }
            //Cambiar los valores enteros a caracteres de estatus
            if(estatus_cmb == 1){
                estatus_string = "Activo";
            }else if (estatus_cmb == 2){
                estatus_string = "Inactivo";
            }
            
            //Capturar datos de usuario de la base de dato y comparar nombre de la cuenta
            try {
                Connection cn = Conexion.conectar();
                //Realiza consulta referente a los nombres de usuarios excepto el que se está actualizando por el ID 
                PreparedStatement pst = cn.prepareStatement(
                "select username from usuarios where username = '" + username + "' and not id_usuario = '" + ID + "'");
                
                ResultSet rs =  pst.executeQuery();
                
                //
                if(rs.next()){
                    txt_cuenta.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible.");            
                    cn.close();
                }else {
                    //Actualizando los datos del usuario seleccionado 
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                    "update usuarios set nombre_usuario=?, email=?, telefono=?, username=?, tipo_nivel=?, estatus=? "
                            + "where id_usuario= '" + ID + "'");
                    
                    pst2.setString(1, nombre );
                    pst2.setString(2, mail );
                    pst2.setString(3, telefono );
                    pst2.setString(4, username);
                    pst2.setString(5, permisos_string);
                    pst2.setString(6, estatus_string);
                    
                    pst2.executeUpdate();
                    cn2.close();
                    
                    JOptionPane.showMessageDialog(null, "Modificación exitosa");        
                }
            } catch (SQLException e) {
                System.err.println("Error al actualizar " + e );
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");        
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_RestaurarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestaurarContrasenaActionPerformed
        // TODO add your handling code here:
        RestaurarContrasena restaurarContrasena = new RestaurarContrasena();
        restaurarContrasena.setVisible(true);
    }//GEN-LAST:event_btn_RestaurarContrasenaActionPerformed

    private void txt_responsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_responsableActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txt_responsableActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RestaurarContrasena;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JLabel lbl_acl;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_estatus;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_oyunde;
    private javax.swing.JLabel lbl_registradoPor;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_tipoNivel;
    private javax.swing.JLabel lbl_tituloMasNombre;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JTextField txt_cuenta;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_responsable;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
