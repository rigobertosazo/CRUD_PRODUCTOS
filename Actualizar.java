/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package producto_vistas;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import producto.actualizar;
import producto.eliminar;
import producto.insertar;

/**
 *
 * @author Rib
 */
public class Actualizar extends javax.swing.JFrame {

    /**
     * Creates new form Actualizar
     */
    public Actualizar() {
        initComponents();
        this.setLocationRelativeTo(null); //centrar el Jframe
         setIconImage(new ImageIcon(getClass().getResource("/IMG/Loguito2.png")).getImage()); //icono del jframe
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_fabricacion = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_enviar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Codigo.setEnabled(false);

        txt_fecha.setForeground(new java.awt.Color(153, 153, 153));
        txt_fecha.setText("Formato: 0000-00-00 (ano-mes-dias)");
        txt_fecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fechaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fechaFocusLost(evt);
            }
        });
        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha:");

        btn_enviar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/update4.png"))); // NOI18N
        btn_enviar2.setText("Actualizar");
        btn_enviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviar2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo:");

        jLabel3.setText("Cantidad:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Lugar de Fabricaci??n: ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Loguito3.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Actualizar Producto");

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete.png"))); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_fabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btn_enviar2)
                        .addGap(46, 46, 46)
                        .addComponent(btn_Cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_fabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_enviar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fechaFocusGained
        // TODO add your handling code here:
        if(txt_fecha.getText().equals("Formato: 0000-00-00 (ano-mes-dias)")){
            txt_fecha.setText("");
            txt_fecha.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txt_fechaFocusGained

    private void txt_fechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fechaFocusLost
        // TODO add your handling code here:
        if(txt_fecha.getText().equals(""))
        {
            txt_fecha.setText("Formato: 0000-00-00 (ano-mes-dias)");
            txt_fecha.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_fechaFocusLost

    private void btn_enviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviar2ActionPerformed
        actualizar(); //insert
        limpiar();//Limpiar cajas de texto
          Menu_Principal m = new Menu_Principal(); //mandar a llamar el objeto
          m.setVisible(true);  //ver el menu
          dispose(); //cerrar el formulario
       
        //dispose();
    }//GEN-LAST:event_btn_enviar2ActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Menu_Principal m = new Menu_Principal(); //mandar a llamar el objeto
        m.setVisible(true);  //ver el menu
        dispose(); //cerrar el formulario
    }//GEN-LAST:event_btn_CancelarActionPerformed

   //Funcion Actualizar en Mysql
     public void actualizar(){
         ProductoDao p1 = new ProductoDao(); //Clase ProductoDAO donde estan las funciones de crear, actualizar, eliminar, select.
         p1.actualizar(Integer.parseInt(txt_Codigo.getText()), 
         txt_nombre.getText(), 
         Integer.parseInt(txt_cantidad.getText()), 
         txt_fabricacion.getText(), 
         txt_fecha.getText());
         JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
    }
    
     //funcion limpiar cajas de texto
     public void limpiar()
     {
         txt_Codigo.setText(null);
         txt_nombre.setText(null);
         txt_cantidad.setText(null);
         txt_fabricacion.setText(null);
         txt_fecha.setText(null);
     }
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
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }
    
           //enviar datos de modificar a las cajitas
    public void mostrar(int codigo, String nombre, int cantidad, String fabricacion, String fecha)
    {
         txt_Codigo.setText(codigo+"");
         txt_nombre.setText(nombre);
         txt_cantidad.setText(cantidad+"");
         txt_fabricacion.setText(fabricacion);  
         txt_fecha.setText(fecha);  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_enviar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_fabricacion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
