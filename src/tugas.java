public class tugas extends javax.swing.JFrame {
    
    double nilai1,nilai2,hsl;

    public tugas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JNilaiX = new javax.swing.JLabel();
        JNilaiY = new javax.swing.JLabel();
        JHasil = new javax.swing.JLabel();
        RKurang = new javax.swing.JRadioButton();
        RKali = new javax.swing.JRadioButton();
        RTambah = new javax.swing.JRadioButton();
        RBagi = new javax.swing.JRadioButton();
        TfX = new javax.swing.JTextField();
        TfY = new javax.swing.JTextField();
        TfHasil = new javax.swing.JTextField();
        JHitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JNilaiX.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JNilaiX.setForeground(new java.awt.Color(255, 153, 153));
        JNilaiX.setText("Nilai X     :");

        JNilaiY.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JNilaiY.setForeground(new java.awt.Color(255, 153, 153));
        JNilaiY.setText("Nilai Y     :");

        JHasil.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JHasil.setForeground(new java.awt.Color(0, 0, 255));
        JHasil.setText("Hasil     :");

        buttonGroup1.add(RKurang);
        RKurang.setText("Kurang");

        buttonGroup1.add(RKali);
        RKali.setText("Kali");
        RKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RKaliActionPerformed(evt);
            }
        });

        buttonGroup1.add(RTambah);
        RTambah.setText("Tambah");
        RTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTambahActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBagi);
        RBagi.setText("Bagi");

        TfX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfXActionPerformed(evt);
            }
        });

        TfHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfHasilActionPerformed(evt);
            }
        });

        JHitung.setText("HITUNG");
        JHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(RTambah))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JNilaiX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JNilaiY, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RKurang)
                        .addGap(38, 38, 38)
                        .addComponent(RKali, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(RBagi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TfHasil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addComponent(TfY, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TfX, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JHitung)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JNilaiX)
                    .addComponent(TfX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JNilaiY)
                    .addComponent(TfY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RKurang)
                    .addComponent(RKali)
                    .addComponent(RTambah)
                    .addComponent(RBagi))
                .addGap(29, 29, 29)
                .addComponent(JHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JHasil)
                    .addComponent(TfHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RKaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RKaliActionPerformed

    private void RTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTambahActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_RTambahActionPerformed

    private void TfHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfHasilActionPerformed

    private void JHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JHitungActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(TfX.getText());
        int bil2 = Integer.parseInt(TfY.getText());
        double hasil=0;
        if (RTambah.isSelected())
        {
        hasil=bil1+bil2;
        }
        else if (RKurang.isSelected())
        {
        hasil=bil1-bil2;
        }
       else if (RKali.isSelected())
        {
        hasil=bil1*bil2;
        }
        else if (RBagi.isSelected())
        {
        hasil=bil1/bil2;
        }
TfHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_JHitungActionPerformed

    private void TfXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfXActionPerformed

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
            java.util.logging.Logger.getLogger(tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JHasil;
    private javax.swing.JButton JHitung;
    private javax.swing.JLabel JNilaiX;
    private javax.swing.JLabel JNilaiY;
    private javax.swing.JRadioButton RBagi;
    private javax.swing.JRadioButton RKali;
    private javax.swing.JRadioButton RKurang;
    private javax.swing.JRadioButton RTambah;
    private javax.swing.JTextField TfHasil;
    private javax.swing.JTextField TfX;
    private javax.swing.JTextField TfY;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
