/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.remob.motorista;

/**
 *
 * @author aluno
 */
public class Veiculo extends javax.swing.JDialog {

    /**
     * Creates new form Veiculo
     */
    public Veiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CloseBtn = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        UsernameField1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        UsernameField2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        UsernameField6 = new javax.swing.JTextField();
        UsernameField7 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        UsernameField8 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        Enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/remob/signup/BannerMotorista.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(320, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        CloseBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseBtn.setText("x");
        CloseBtn.setToolTipText("Fechar");
        CloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
        });

        UsernameField.setBackground(new java.awt.Color(51, 51, 51));
        UsernameField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField.setText("Modelo*");
        UsernameField.setBorder(null);
        UsernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFieldFocusLost(evt);
            }
        });
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Cadastre seu veiculo");
        Title.setMaximumSize(new java.awt.Dimension(330, 45));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        UsernameField1.setBackground(new java.awt.Color(51, 51, 51));
        UsernameField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernameField1.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField1.setText("Ano*");
        UsernameField1.setToolTipText("");
        UsernameField1.setBorder(null);
        UsernameField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameField1FocusLost(evt);
            }
        });
        UsernameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameField1ActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));

        UsernameField2.setBackground(new java.awt.Color(51, 51, 51));
        UsernameField2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernameField2.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField2.setText("Placa*");
        UsernameField2.setBorder(null);
        UsernameField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameField2FocusLost(evt);
            }
        });
        UsernameField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameField2ActionPerformed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Hatch", "Sedan", "SUV", "Pickup", "Caminhonete", "Furgão", "Esportivo", "Outros" }));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));

        UsernameField6.setBackground(new java.awt.Color(51, 51, 51));
        UsernameField6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernameField6.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField6.setText("Marca*");
        UsernameField6.setBorder(null);
        UsernameField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameField6FocusLost(evt);
            }
        });
        UsernameField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameField6ActionPerformed(evt);
            }
        });

        UsernameField7.setBackground(new java.awt.Color(51, 51, 51));
        UsernameField7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernameField7.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField7.setText("Cor*");
        UsernameField7.setBorder(null);
        UsernameField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameField7FocusLost(evt);
            }
        });
        UsernameField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameField7ActionPerformed(evt);
            }
        });

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));

        UsernameField8.setBackground(new java.awt.Color(51, 51, 51));
        UsernameField8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernameField8.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField8.setText("Renavam*");
        UsernameField8.setBorder(null);
        UsernameField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameField8FocusLost(evt);
            }
        });
        UsernameField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameField8ActionPerformed(evt);
            }
        });

        jSeparator14.setBackground(new java.awt.Color(255, 255, 255));

        Enter.setBackground(new java.awt.Color(51, 51, 51));
        Enter.setForeground(new java.awt.Color(255, 255, 255));
        Enter.setText("Concluir");
        Enter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(CloseBtn)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameField8, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameField7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UsernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(UsernameField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(UsernameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void UsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusGained
        UsernameField.setText("");
    }//GEN-LAST:event_UsernameFieldFocusGained

    private void UsernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusLost

    }//GEN-LAST:event_UsernameFieldFocusLost

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void UsernameField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField1FocusGained

    private void UsernameField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField1FocusLost

    private void UsernameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField1ActionPerformed

    private void UsernameField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField2FocusGained

    private void UsernameField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField2FocusLost

    private void UsernameField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField2ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered

    }//GEN-LAST:event_jPanel3MouseEntered

    private void UsernameField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField6FocusGained

    private void UsernameField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField6FocusLost

    private void UsernameField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField6ActionPerformed

    private void UsernameField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField7FocusGained

    private void UsernameField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField7FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField7FocusLost

    private void UsernameField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField7ActionPerformed

    private void UsernameField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField8FocusGained

    private void UsernameField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameField8FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField8FocusLost

    private void UsernameField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameField8ActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        carregaDadosUsuario();
    }//GEN-LAST:event_EnterActionPerformed

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
            java.util.logging.Logger.getLogger(Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Veiculo dialog = new Veiculo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JTextField UsernameField1;
    private javax.swing.JTextField UsernameField2;
    private javax.swing.JTextField UsernameField6;
    private javax.swing.JTextField UsernameField7;
    private javax.swing.JTextField UsernameField8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
