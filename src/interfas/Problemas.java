
package interfas;

import javax.swing.JOptionPane;
import static proyectofinal.ProyectoFinal.CuidadoresXY;
import static proyectofinal.ProyectoFinal.borrarFeriados;
import static proyectofinal.ProyectoFinal.eliminar11;
import static proyectofinal.ProyectoFinal.mayorC;
import static proyectofinal.ProyectoFinal.mostrarB;

import static proyectofinal.ProyectoFinal.mostrarCuidadoresCentro;
import static proyectofinal.ProyectoFinal.mostrarH;

/**
 *
 * @author LENOVO
 */
public class Problemas extends javax.swing.JFrame {

      private PRINCIPAL ejer;
    public Problemas() {
        initComponents();
    }
    public Problemas(PRINCIPAL p) {
        
         ejer=p; 
         
        initComponents();
    }

    public PRINCIPAL getEjer() {
        return ejer;
    }

    public void setEjer(PRINCIPAL ejer) {
        this.ejer = ejer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("PROBLEMAS DEL PROYECTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel2.setText("1.Mostrara al cuidador X con su Centro y  con los niños menores  a Y");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel3.setText("2.Determinar y mostrar el centro con el mayor número de niños");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel4.setText("3.Mostrar a los Cuidadores que entres a las Y");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 540, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel5.setText("4.Buscar Del Centro C y Eliminar el Feriado F ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 480, -1));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel6.setText("5.De los centros de dia eliminar a los niños mayores a Y");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 550, 25));

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1129, 503, 96, -1));

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 503, 86, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 158, 100, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 158, 88, -1));

        jButton3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 153, 99, -1));

        jButton4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton4.setText("Mostrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 227, 99, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 100, -1));

        jButton5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton5.setText("Hora");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 303, 99, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 378, 100, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 88, -1));

        jButton6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 373, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 447, 100, -1));

        jButton7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 450, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\imagene\\paper-1074131_640.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -10, 640, 470));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\imagene\\paper-1074131_640.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 630, 260));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\imagene\\paper-1074131_640.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 450));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\imagene\\paper-1074131_640.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 630, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ejer.setVisible(true);
        this.setVisible(false);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String res=CuidadoresXY(ejer.getB(),ejer.getD1(),this.jTextField1.getText(),Integer.parseInt(jTextField2.getText()));
        JOptionPane.showMessageDialog(null, res);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      String res=mayorC(ejer.getB());
      JOptionPane.showMessageDialog(null, "EL CENTRO CON MAS NIÑOS ES: "+res);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String res=mostrarCuidadoresCentro(ejer.getD1(),jTextField3.getText());
       JOptionPane.showMessageDialog(null, res);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String res22=mostrarH(ejer.getH());
        String res=borrarFeriados(ejer.getH(),jTextField4.getText(),jTextField5.getText());
        String res2=mostrarH(ejer.getH());
         JOptionPane.showMessageDialog(null, res22);
         JOptionPane.showMessageDialog(null, res);
         JOptionPane.showMessageDialog(null, res2);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String res22=mostrarB(ejer.getB());
        String res=eliminar11(ejer.getB(),Integer.parseInt(jTextField6.getText()));
        String res2=mostrarB(ejer.getB());
       
       JOptionPane.showMessageDialog(null, res22);
       JOptionPane.showMessageDialog(null, res);
       JOptionPane.showMessageDialog(null, res2);
        
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Problemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Problemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Problemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Problemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
