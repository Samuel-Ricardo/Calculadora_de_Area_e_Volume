/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CalcVolumeController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Samuel
 */
public class CalcVolume extends javax.swing.JFrame {

    private final CalcVolumeController controller;

    /**
     * Creates new form CalcVolume
     */
    public CalcVolume() {
        initComponents();
        controller = new CalcVolumeController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldResposta = new javax.swing.JTextField();
        jButtonEsfe = new javax.swing.JButton();
        jButtonCil = new javax.swing.JButton();
        jButtonCo = new javax.swing.JButton();
        jLabelR = new javax.swing.JLabel();
        jLabelH = new javax.swing.JLabel();
        jTextFieldHaltura = new javax.swing.JTextField();
        jTextFieldRaio = new javax.swing.JTextField();
        jButtonEsfera = new javax.swing.JButton();
        jButtonCilindro = new javax.swing.JButton();
        jButtonCone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("2020");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 40, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("Feito por: Samuel 2°DS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 200, 20));

        jTextFieldResposta.setEditable(false);
        jTextFieldResposta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldResposta.setForeground(new java.awt.Color(0, 204, 0));
        jTextFieldResposta.setText("Resposta");
        this.jTextFieldResposta.setVisible(false);
        getContentPane().add(jTextFieldResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 160, 40));

        jButtonEsfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/calculo.png"))); // NOI18N
        jButtonEsfe.setText("Calcular");
        this.jButtonCil.setVisible(false);
        this.jButtonCo.setVisible(false);
        this.jButtonEsfe.setVisible(false);
        jButtonEsfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEsfeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEsfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 130, 50));

        jButtonCil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/calculo.png"))); // NOI18N
        jButtonCil.setText("Calcular");
        jButtonCil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCilActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 130, 50));

        jButtonCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/calculo.png"))); // NOI18N
        jButtonCo.setText("Calcular");
        jButtonCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 130, 50));

        jLabelR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelR.setText("Digite o Raio \"R\":");
        this.jLabelH.setVisible(false);
        this.jLabelR.setVisible(false);
        this.jTextFieldHaltura.setVisible(false);
        this.jTextFieldRaio.setVisible(false);
        getContentPane().add(jLabelR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 230, -1));

        jLabelH.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelH.setText("Digite a Altura \"H\":");
        getContentPane().add(jLabelH, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 230, -1));

        jTextFieldHaltura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldHaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 280, 30));

        jTextFieldRaio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldRaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 280, 30));

        jButtonEsfera.setBackground(new java.awt.Color(153, 0, 153));
        jButtonEsfera.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonEsfera.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEsfera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/esfera.png"))); // NOI18N
        jButtonEsfera.setText(" Esfera");
        jButtonEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEsferaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEsfera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, 90));

        jButtonCilindro.setBackground(new java.awt.Color(153, 0, 153));
        jButtonCilindro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCilindro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCilindro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/cilindro.png"))); // NOI18N
        jButtonCilindro.setText("Cilindro");
        jButtonCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCilindroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCilindro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, 80));

        jButtonCone.setBackground(new java.awt.Color(153, 0, 153));
        jButtonCone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCone.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/cone.png"))); // NOI18N
        jButtonCone.setText("Cone");
        jButtonCone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/volumMenu.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEsferaActionPerformed
      this.controller.limpar();
      this.controller.mostrarEsfera();
    }//GEN-LAST:event_jButtonEsferaActionPerformed

    private void jButtonCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCilindroActionPerformed
    this.controller.limpar();
    this.controller.mostrarCilindro();
    
    }//GEN-LAST:event_jButtonCilindroActionPerformed

    private void jButtonConeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConeActionPerformed
       this.controller.limpar();
       this.controller.mostrarCone();
        
    }//GEN-LAST:event_jButtonConeActionPerformed

    private void jButtonCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCoActionPerformed
  this.controller.volumeCone();
        
    }//GEN-LAST:event_jButtonCoActionPerformed

    private void jButtonCilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCilActionPerformed
    this.controller.volumeCilindro();
    
    }//GEN-LAST:event_jButtonCilActionPerformed

    private void jButtonEsfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEsfeActionPerformed
    this.controller.volumeEsfera();
    }//GEN-LAST:event_jButtonEsfeActionPerformed

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
            java.util.logging.Logger.getLogger(CalcVolume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcVolume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcVolume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcVolume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcVolume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCil;
    private javax.swing.JButton jButtonCilindro;
    private javax.swing.JButton jButtonCo;
    private javax.swing.JButton jButtonCone;
    private javax.swing.JButton jButtonEsfe;
    private javax.swing.JButton jButtonEsfera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelH;
    private javax.swing.JLabel jLabelR;
    private javax.swing.JTextField jTextFieldHaltura;
    private javax.swing.JTextField jTextFieldRaio;
    private javax.swing.JTextField jTextFieldResposta;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonCil() {
        return jButtonCil;
    }

    public void setjButtonCil(JButton jButtonCil) {
        this.jButtonCil = jButtonCil;
    }

    public JButton getjButtonCilindro() {
        return jButtonCilindro;
    }

    public void setjButtonCilindro(JButton jButtonCilindro) {
        this.jButtonCilindro = jButtonCilindro;
    }

    public JButton getjButtonCo() {
        return jButtonCo;
    }

    public void setjButtonCo(JButton jButtonCo) {
        this.jButtonCo = jButtonCo;
    }

    public JButton getjButtonCone() {
        return jButtonCone;
    }

    public void setjButtonCone(JButton jButtonCone) {
        this.jButtonCone = jButtonCone;
    }

    public JButton getjButtonEsfe() {
        return jButtonEsfe;
    }

    public void setjButtonEsfe(JButton jButtonEsfe) {
        this.jButtonEsfe = jButtonEsfe;
    }

    public JButton getjButtonEsfera() {
        return jButtonEsfera;
    }

    public void setjButtonEsfera(JButton jButtonEsfera) {
        this.jButtonEsfera = jButtonEsfera;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabelH() {
        return jLabelH;
    }

    public void setjLabelH(JLabel jLabelH) {
        this.jLabelH = jLabelH;
    }

    public JLabel getjLabelR() {
        return jLabelR;
    }

    public void setjLabelR(JLabel jLabelR) {
        this.jLabelR = jLabelR;
    }

    public JTextField getjTextFieldHaltura() {
        return jTextFieldHaltura;
    }

    public void setjTextFieldHaltura(JTextField jTextFieldHaltura) {
        this.jTextFieldHaltura = jTextFieldHaltura;
    }

    public JTextField getjTextFieldRaio() {
        return jTextFieldRaio;
    }

    public void setjTextFieldRaio(JTextField jTextFieldRaio) {
        this.jTextFieldRaio = jTextFieldRaio;
    }

    public JTextField getjTextFieldResposta() {
        return jTextFieldResposta;
    }

    public void setjTextFieldResposta(JTextField jTextFieldResposta) {
        this.jTextFieldResposta = jTextFieldResposta;
    }


}
