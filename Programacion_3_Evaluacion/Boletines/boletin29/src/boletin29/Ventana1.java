
package boletin29;

import javax.swing.JOptionPane;


public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        TxtFullName = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        TxtUserID = new javax.swing.JTextField();
        CbGroup6 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        TxtHomeDirectory = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        CbGroup = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        JpConfirm = new javax.swing.JPasswordField();
        jLabel42 = new javax.swing.JLabel();
        JpPassword = new javax.swing.JPasswordField();
        JbOK3 = new javax.swing.JButton();
        JbCancel3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        JtxtUserName = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(210, 228, 246));

        jLabel33.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel33.setText("Crate a new user");

        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setText("User Name:");

        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setText("Full Name:");

        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setText("User ID:");

        TxtFullName.setName("TxtFullName"); // NOI18N
        TxtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFullNameTxtFullNameActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setText("Group:");

        TxtUserID.setName("TxtUserID"); // NOI18N
        TxtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUserIDTxtUserIDActionPerformed(evt);
            }
        });

        CbGroup6.setEditable(true);
        CbGroup6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbGroup6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff" }));
        CbGroup6.setName(""); // NOI18N
        CbGroup6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbGroup6CbGroupItemStateChanged(evt);
            }
        });
        CbGroup6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbGroup6CbGroupActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setText("Home Directory:");

        TxtHomeDirectory.setName("TxtUserID"); // NOI18N
        TxtHomeDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHomeDirectoryTxtHomeDirectoryActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setText("Login Shell:");

        CbGroup.setEditable(true);
        CbGroup.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CbGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/bin/ksh" }));
        CbGroup.setName(""); // NOI18N
        CbGroup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbGroupCbGroup1ItemStateChanged(evt);
            }
        });
        CbGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbGroupCbGroup1ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel41.setText("Password:");

        JpConfirm.setText("jPasswordField1");
        JpConfirm.setEchoChar('*');
        JpConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JpConfirmJpConfirmActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setText("Confirm:");

        JpPassword.setText("jPasswordField1");
        JpPassword.setEchoChar('*');
        JpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JpPasswordJpPasswordActionPerformed(evt);
            }
        });

        JbOK3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JbOK3.setText("Ok");
        JbOK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbOK3JbOKActionPerformed(evt);
            }
        });

        JbCancel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JbCancel3.setText("Cancel");
        JbCancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCancel3JbCancelActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(JtxtUserName);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel33))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CbGroup6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(TxtUserID)
                                    .addComponent(jScrollPane5)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtHomeDirectory)
                                    .addComponent(JpConfirm)
                                    .addComponent(JpPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JbCancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbOK3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel33)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(TxtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(TxtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbGroup6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(TxtHomeDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(CbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(JpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(JpConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbOK3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbCancel3))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFullNameTxtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFullNameTxtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFullNameTxtFullNameActionPerformed

    private void TxtUserIDTxtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUserIDTxtUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUserIDTxtUserIDActionPerformed

    private void CbGroup6CbGroupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbGroup6CbGroupItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CbGroup6CbGroupItemStateChanged

    private void CbGroup6CbGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbGroup6CbGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbGroup6CbGroupActionPerformed

    private void TxtHomeDirectoryTxtHomeDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHomeDirectoryTxtHomeDirectoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHomeDirectoryTxtHomeDirectoryActionPerformed

    private void CbGroupCbGroup1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbGroupCbGroup1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CbGroupCbGroup1ItemStateChanged

    private void CbGroupCbGroup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbGroupCbGroup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbGroupCbGroup1ActionPerformed

    private void JpConfirmJpConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JpConfirmJpConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JpConfirmJpConfirmActionPerformed

    private void JpPasswordJpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JpPasswordJpPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JpPasswordJpPasswordActionPerformed

    private void JbOK3JbOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbOK3JbOKActionPerformed
        String Posword1 = JpPassword.getText();
        if (Posword1.equalsIgnoreCase("win")){
            Principal ventana = new Principal();
            ventana.show();
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(this," El acceso es incorreto","Error",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_JbOK3JbOKActionPerformed

    private void JbCancel3JbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCancel3JbCancelActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_JbCancel3JbCancelActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbGroup;
    private javax.swing.JComboBox<String> CbGroup6;
    private javax.swing.JButton JbCancel3;
    private javax.swing.JButton JbOK3;
    private javax.swing.JPasswordField JpConfirm;
    private javax.swing.JPasswordField JpPassword;
    private javax.swing.JTextPane JtxtUserName;
    private javax.swing.JTextField TxtFullName;
    private javax.swing.JTextField TxtHomeDirectory;
    private javax.swing.JTextField TxtUserID;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
