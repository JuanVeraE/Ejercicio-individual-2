/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parte2;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class datos extends javax.swing.JFrame {

    /**
     * Creates new form datos
     */
    public datos() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        txtLado = new javax.swing.JTextField();
        txtAlturaRect = new javax.swing.JTextField();
        txtAlturaTri = new javax.swing.JTextField();
        txtAcirculo = new javax.swing.JTextField();
        txtAcuadrado = new javax.swing.JTextField();
        txtArect = new javax.swing.JTextField();
        txtAtri = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBaseRect = new javax.swing.JTextField();
        txtBaseTri = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPcirculo = new javax.swing.JTextField();
        txtPcuadrado = new javax.swing.JTextField();
        txtPrect = new javax.swing.JTextField();
        txtPtri = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnCcirculo = new javax.swing.JButton();
        btnCcuadrado = new javax.swing.JButton();
        btnCrect = new javax.swing.JButton();
        btnCtri = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Figura");

        jLabel2.setText("Circulo:");

        jLabel3.setText("Cuadrado:");

        jLabel4.setText("Rectangulo:");

        jLabel5.setText("Triangulo:");

        txtRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadioActionPerformed(evt);
            }
        });

        txtLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoActionPerformed(evt);
            }
        });

        txtAcirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcirculoActionPerformed(evt);
            }
        });

        txtArect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArectActionPerformed(evt);
            }
        });

        txtAtri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtriActionPerformed(evt);
            }
        });

        jLabel6.setText("r =");

        jLabel7.setText("l =");

        jLabel8.setText("h =");

        jLabel9.setText("h =");

        jLabel10.setText("b =");

        jLabel11.setText("b =");

        txtBaseTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseTriActionPerformed(evt);
            }
        });

        jLabel12.setText("Resultados");

        jLabel13.setText("Area");

        txtPcirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPcirculoActionPerformed(evt);
            }
        });

        txtPcuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPcuadradoActionPerformed(evt);
            }
        });

        txtPrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrectActionPerformed(evt);
            }
        });

        jLabel14.setText("Perimetro");

        btnCcirculo.setText("Calcular");
        btnCcirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCcirculoActionPerformed(evt);
            }
        });

        btnCcuadrado.setText("Calcular");
        btnCcuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCcuadradoActionPerformed(evt);
            }
        });

        btnCrect.setText("Calcular");
        btnCrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrectActionPerformed(evt);
            }
        });

        btnCtri.setText("Calcular");
        btnCtri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCtriActionPerformed(evt);
            }
        });

        jLabel15.setText("Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAlturaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAlturaRect, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBaseTri, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBaseRect, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(69, 69, 69)))
                    .addComponent(txtAcirculo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAcuadrado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArect, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAtri, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(txtPcirculo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtPcuadrado)
                    .addComponent(txtPrect)
                    .addComponent(txtPtri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCcirculo)
                    .addComponent(btnCcuadrado)
                    .addComponent(btnCrect)
                    .addComponent(btnCtri))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22)
                                .addComponent(btnCcirculo)
                                .addGap(18, 18, 18)
                                .addComponent(btnCcuadrado)
                                .addGap(20, 20, 20)
                                .addComponent(btnCrect)
                                .addGap(18, 18, 18)
                                .addComponent(btnCtri))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(168, 168, 168))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPcirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAcirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPcuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAcuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPrect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtArect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPtri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAtri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel6))
                                            .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtAlturaRect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel11)
                                        .addComponent(txtBaseRect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(125, 125, 125)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBaseTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(txtAlturaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9)))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRadioActionPerformed

    private void txtBaseTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseTriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaseTriActionPerformed

    private void txtAcirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcirculoActionPerformed

    private void txtArectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArectActionPerformed

    private void txtPcirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPcirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPcirculoActionPerformed

    private void txtPrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrectActionPerformed

    private void txtLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoActionPerformed

    private void btnCcirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCcirculoActionPerformed
        int radio;
        try {
        radio = Integer.parseInt(txtRadio.getText());
        
        Circulo figura1 = new Circulo(radio);
        
        txtAcirculo.setText(String.valueOf(figura1.calcularArea()));
        txtPcirculo.setText(String.valueOf(figura1.calcularPerimetro()));
        
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Tipo de dato incorrecto.");
        }
    }//GEN-LAST:event_btnCcirculoActionPerformed

    private void txtPcuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPcuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPcuadradoActionPerformed

    private void btnCcuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCcuadradoActionPerformed
        int lado;
        try {
        lado = Integer.parseInt(txtLado.getText());
        
        Cuadrado figura2 = new Cuadrado(lado);
        
        txtAcuadrado.setText(String.valueOf(figura2.calcularArea()));
        txtPcuadrado.setText(String.valueOf(figura2.calcularPerimetro()));
        
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Tipo de dato incorrecto.");
        }
    }//GEN-LAST:event_btnCcuadradoActionPerformed

    private void txtAtriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtriActionPerformed

    private void btnCrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrectActionPerformed
        int base, altura;
        try {
        base = Integer.parseInt(txtBaseRect.getText());
        altura = Integer.parseInt(txtAlturaRect.getText());
        
        Rectangulo figura3 = new Rectangulo(base, altura);
        
        txtArect.setText(String.valueOf(figura3.calcularArea()));
        txtPrect.setText(String.valueOf(figura3.calcularPerimetro()));
        
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Tipo de dato incorrecto.");
        }
    }//GEN-LAST:event_btnCrectActionPerformed

    private void btnCtriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCtriActionPerformed
        int base, altura;
        try {
        base = Integer.parseInt(txtBaseTri.getText());
        altura = Integer.parseInt(txtAlturaTri.getText());
        
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base, altura);
        
        txtAtri.setText(String.valueOf(figura4.calcularArea()));
        txtPtri.setText(String.valueOf(figura4.calcularPerimetro()));
        JOptionPane.showMessageDialog(null, figura4.determinarTipoTriangulo());
        
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Tipo de dato incorrecto.");
        }
    }//GEN-LAST:event_btnCtriActionPerformed

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
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCcirculo;
    private javax.swing.JButton btnCcuadrado;
    private javax.swing.JButton btnCrect;
    private javax.swing.JButton btnCtri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAcirculo;
    private javax.swing.JTextField txtAcuadrado;
    private javax.swing.JTextField txtAlturaRect;
    private javax.swing.JTextField txtAlturaTri;
    private javax.swing.JTextField txtArect;
    private javax.swing.JTextField txtAtri;
    private javax.swing.JTextField txtBaseRect;
    private javax.swing.JTextField txtBaseTri;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtPcirculo;
    private javax.swing.JTextField txtPcuadrado;
    private javax.swing.JTextField txtPrect;
    private javax.swing.JTextField txtPtri;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
