/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.remob.motorista;

import br.com.remob.db.BDconnect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Motoristas extends javax.swing.JDialog {

    public Motoristas(java.awt.Frame parent, boolean modal) {
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CloseBtn = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        emailField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        telefoneField = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        cpfField = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        rgField = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        cnhField = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        Enter = new javax.swing.JButton();
        sexoField = new javax.swing.JComboBox<>();
        idadeField = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        nomeComp = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Banner3.png"))); // NOI18N

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

        UsernameField.setEditable(false);
        UsernameField.setBackground(new java.awt.Color(51, 51, 51));
        UsernameField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField.setText("Gênero:");
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
        Title.setText("Continue seu cadastro");
        Title.setMaximumSize(new java.awt.Dimension(330, 45));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        emailField.setBackground(new java.awt.Color(51, 51, 51));
        emailField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setText("Email*");
        emailField.setBorder(null);
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));

        telefoneField.setBackground(new java.awt.Color(51, 51, 51));
        telefoneField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        telefoneField.setForeground(new java.awt.Color(255, 255, 255));
        telefoneField.setText("Telefone*");
        telefoneField.setBorder(null);
        telefoneField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefoneFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefoneFieldFocusLost(evt);
            }
        });
        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));

        cpfField.setBackground(new java.awt.Color(51, 51, 51));
        cpfField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cpfField.setForeground(new java.awt.Color(255, 255, 255));
        cpfField.setText("CPF*");
        cpfField.setBorder(null);
        cpfField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfFieldFocusLost(evt);
            }
        });
        cpfField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFieldActionPerformed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));

        rgField.setBackground(new java.awt.Color(51, 51, 51));
        rgField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rgField.setForeground(new java.awt.Color(255, 255, 255));
        rgField.setText("RG*");
        rgField.setBorder(null);
        rgField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rgFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rgFieldFocusLost(evt);
            }
        });
        rgField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgFieldActionPerformed(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));

        cnhField.setBackground(new java.awt.Color(51, 51, 51));
        cnhField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cnhField.setForeground(new java.awt.Color(255, 255, 255));
        cnhField.setText("CNH*");
        cnhField.setBorder(null);
        cnhField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cnhFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cnhFieldFocusLost(evt);
            }
        });
        cnhField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnhFieldActionPerformed(evt);
            }
        });

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));

        Enter.setBackground(new java.awt.Color(51, 51, 51));
        Enter.setForeground(new java.awt.Color(255, 255, 255));
        Enter.setText("Próximo");
        Enter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        sexoField.setBackground(new java.awt.Color(51, 51, 51));
        sexoField.setForeground(new java.awt.Color(255, 255, 255));
        sexoField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outros" }));
        sexoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoFieldActionPerformed(evt);
            }
        });

        idadeField.setBackground(new java.awt.Color(51, 51, 51));
        idadeField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        idadeField.setForeground(new java.awt.Color(255, 255, 255));
        idadeField.setText("Idade*");
        idadeField.setBorder(null);
        idadeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idadeFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idadeFieldFocusLost(evt);
            }
        });
        idadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeFieldActionPerformed(evt);
            }
        });

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));

        nomeComp.setBackground(new java.awt.Color(51, 51, 51));
        nomeComp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nomeComp.setForeground(new java.awt.Color(255, 255, 255));
        nomeComp.setText("Nome Completo*");
        nomeComp.setBorder(null);
        nomeComp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeCompFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeCompFocusLost(evt);
            }
        });
        nomeComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCompActionPerformed(evt);
            }
        });

        jSeparator14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(CloseBtn)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnhField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sexoField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(nomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnhField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
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

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered

    }//GEN-LAST:event_jPanel3MouseEntered

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void UsernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusLost

    }//GEN-LAST:event_UsernameFieldFocusLost

    private void UsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusGained
        UsernameField.setText("");
    }//GEN-LAST:event_UsernameFieldFocusGained

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        emailField.setText("");
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldFocusLost

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void telefoneFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneFieldFocusGained
        telefoneField.setText("");
    }//GEN-LAST:event_telefoneFieldFocusGained

    private void telefoneFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldFocusLost

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void cpfFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfFieldFocusGained
        cpfField.setText("");
    }//GEN-LAST:event_cpfFieldFocusGained

    private void cpfFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfFieldFocusLost

    private void cpfFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfFieldActionPerformed

    private void rgFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgFieldActionPerformed

    private void rgFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rgFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_rgFieldFocusLost

    private void rgFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rgFieldFocusGained
        rgField.setText("");
    }//GEN-LAST:event_rgFieldFocusGained

    private void cnhFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnhFieldFocusGained
        cnhField.setText("");
    }//GEN-LAST:event_cnhFieldFocusGained

    private void cnhFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnhFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cnhFieldFocusLost

    private void cnhFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnhFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnhFieldActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
    }//GEN-LAST:event_EnterActionPerformed
        //atualizarMotorista();
    private void sexoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoFieldActionPerformed

    private void idadeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idadeFieldFocusGained
        idadeField.setText("");
    }//GEN-LAST:event_idadeFieldFocusGained

    private void idadeFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idadeFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeFieldFocusLost

    private void idadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeFieldActionPerformed

    private void nomeCompFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeCompFocusGained
        nomeComp.setText("");
    }//GEN-LAST:event_nomeCompFocusGained

    private void nomeCompFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeCompFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCompFocusLost

    private void nomeCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCompActionPerformed

    public static void main(String args[]) {
    }
    
    public void atualizarMotorista(){
        try {
            BDconnect banco = new BDconnect();
            banco.conectaDB();
            
            String sql = "update motorista set nome = ?, email = ?, telefone = ?, CPF = ?, RG = ?, CNH = ?, idade = ?, sexo = ? where ";
            
            String nome = this.nomeComp.getText();
            String email = this.emailField.getText();
            String telefone = this.telefoneField.getText();
            String cpf = this.cpfField.getText();
            String rg = this.rgField.getText();
            String cnh = this.cnhField.getText();
            String idade = this.idadeField.getText();
            String sexo = (String) sexoField.getSelectedItem();
            
            PreparedStatement ps = banco.getPreparedStatement(sql);
            
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, telefone);
            ps.setString(4, cpf);
            ps.setString(5, rg);
            ps.setString(6, cnh);
            ps.setString(7, idade);
            ps.setString(8, sexo);
            
            ps.execute();
            ps.close();
            banco.encerrarConexao();
     
        } catch (SQLException ex) {
            Logger.getLogger(Motoristas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, 
            "Não foi possível cadastrar seu usuário. Erro: " + ex.getMessage());
        }
        }
             

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JTextField cnhField;
    private javax.swing.JTextField cpfField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField idadeField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nomeComp;
    private javax.swing.JTextField rgField;
    private javax.swing.JComboBox<String> sexoField;
    private javax.swing.JTextField telefoneField;
    // End of variables declaration//GEN-END:variables
}
