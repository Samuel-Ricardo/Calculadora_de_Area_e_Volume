/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MenuController;
import javax.swing.JLabel;

/**
 *
 * @author Samuel
 */
public class Menu extends javax.swing.JFrame {

    private final MenuController controller;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        controller = new MenuController(this);  // create connection to the controller  // cria conexoa com o conroller
        
    }
    
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMenuPrincpal = new javax.swing.JLabel();
        jMenuBarPrincp = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemArea = new javax.swing.JMenuItem();
        jMenuItemVolume = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("2020");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 40, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Feito por: Samuel 2°DS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 200, 20));

        jLabelMenuPrincpal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/quadro-de-matematica.jpg"))); // NOI18N
        getContentPane().add(jLabelMenuPrincpal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jMenu1.setText("Calcular");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItemArea.setBackground(new java.awt.Color(0, 204, 0));
        jMenuItemArea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItemArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/trianulo_regua.png"))); // NOI18N
        jMenuItemArea.setText("Calcular Área");
        jMenuItemArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAreaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemArea);

        jMenuItemVolume.setBackground(new java.awt.Color(0, 204, 0));
        jMenuItemVolume.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItemVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/3d_bloc.png"))); // NOI18N
        jMenuItemVolume.setText("Calcular Volume");
        jMenuItemVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVolumeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemVolume);

        jMenuBarPrincp.add(jMenu1);

        setJMenuBar(jMenuBarPrincp);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAreaActionPerformed
      this.controller.abrirCalcArea();
    }//GEN-LAST:event_jMenuItemAreaActionPerformed

    private void jMenuItemVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVolumeActionPerformed
        this.controller.abrirCalcVolume();
    }//GEN-LAST:event_jMenuItemVolumeActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMenuPrincpal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBarPrincp;
    private javax.swing.JMenuItem jMenuItemArea;
    private javax.swing.JMenuItem jMenuItemVolume;
    // End of variables declaration//GEN-END:variables
}