/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;
import java.sql.*;
import conexion_bd_cu.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
//Interaccion con puntero
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author Victor Alejandro Rojas Yovaniniz
 */
public class GestionarUsuarios extends javax.swing.JFrame {
    
    //Variable para almacenar nombre de usuario
    String user;
    //Variable para consultar al usuario seleccionado y que se desea modificar
    public static String user_update =  "";
    //Objeto que permite acceso a los métodos necesarios para modificar datos de la tabla
    DefaultTableModel model = new DefaultTableModel();
    
    public GestionarUsuarios() {
        initComponents();
        //Recuperar el nombre de usuario de la interfaz 
        user = Login.user;
        
        //Variable con de funcion bandera para las jerarquias
        setSize(630,330);//Tamaño de la interfaz
        setResizable(false);//Negar que sea modificable la interfaz
        setTitle("Gestion de usuarios registrados - Administrador " + user); //Nombre de la interfaz y nombre de usuario
        setLocationRelativeTo(null); //Centrar interfaz
        
        //Evitar que finalice el programa 
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        //Obtener los datos que se colocaran dentro de la tabla
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select id_usuario ,nombre_usuario, username, tipo_nivel, estatus from usuarios");
            
            //Crear objeto resultSet para ejecutar consulta
            ResultSet rs = pst.executeQuery();
            
            //Declarando la tabla, ya que no se conoce la cantidad de registros almacenados
            table_usuarios = new JTable(model);
            //Indicando con la sintaxis que la tabla estará dentro de Jscrollpane para no perder de vista los registros dentro de esta
            jScrollPane1.setViewportView(table_usuarios);
            
            //Modificando los títulos de la tabla
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Cuenta");
            model.addColumn("Jerarquía");
            model.addColumn("Estatus");
            
            //Para ver si se encontraron coincidencias en la base de datos. El primer índice es 1.
            while (rs.next()){
                //Vector de tipo Object para ir encontrando y vaciando las filas encontradas en la base de datos
                Object[] fila = new Object[5];
                
                for(int i = 0; i < 5; i++) {
                    //Comenzamos con 1 no 0
                    fila[i] = rs.getObject(i + 1);
                }
                //Añadir el modelo a la fila completa
                model.addRow(fila);
            }
            //Cerrando la conexión
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al llenar la tabla" + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar la información, contactar al administrador");
        }
        
        //Evento para obtener el campo que se está apuntando por parte del cliente
        table_usuarios.addMouseListener(new MouseAdapter() {
            
            //Sobre escribiendo el metodo para realizar el evento dandole una variable para guardar lo que se esta apuntando
            @Override
            public void mouseClicked(MouseEvent e){
                //indicar fila, y columna
                int fila_point = table_usuarios.rowAtPoint(e.getPoint());
                int columna_point = 2 ;
                
                if(fila_point > -1 ){
                    //Casteo las cordenadas de las columnas a obtener 
                    user_update = (String)model.getValueAt(fila_point, columna_point);
                    //Apertura de la ventana gestion de usuarios
                    ActualizarUsuario informacionUsuario = new ActualizarUsuario();
                    informacionUsuario.setVisible(true);
                }
            }
        });
    }
    
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
        return retValue;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tituloGestionar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuarios = new javax.swing.JTable();
        lbl_oyunde = new javax.swing.JLabel();
        lbl_acl = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tituloGestionar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_tituloGestionar.setForeground(new java.awt.Color(204, 204, 204));
        lbl_tituloGestionar.setText("Gestión de usuarios");
        getContentPane().add(lbl_tituloGestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        table_usuarios.setBackground(new java.awt.Color(204, 204, 204));
        table_usuarios.setForeground(new java.awt.Color(51, 51, 51));
        table_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_usuarios.setRowHeight(30);
        jScrollPane1.setViewportView(table_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 600, 150));

        lbl_oyunde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/oyu.png"))); // NOI18N
        getContentPane().add(lbl_oyunde, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        lbl_acl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aclLogo.png"))); // NOI18N
        getContentPane().add(lbl_acl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 30));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoNegro.png"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
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
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_acl;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_oyunde;
    private javax.swing.JLabel lbl_tituloGestionar;
    private javax.swing.JTable table_usuarios;
    // End of variables declaration//GEN-END:variables
}
