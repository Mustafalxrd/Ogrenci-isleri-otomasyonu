package View;

import Controller.Controller_Bolum;
import Controller.Controller_Ders;
import Controller.Controller_Ogrenci;
import Controller.Controller_Ogretmen;
import Controller.Controller_Puan;
import Controller.Controller_Veritabani;
import javax.swing.JOptionPane;

public class View_PanelYonetici extends javax.swing.JFrame {

    int Id;
    
    public View_PanelYonetici(int _Id) {
        initComponents();
        setLocationRelativeTo(null);
        this.Id = _Id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnOgrenciIslemleri = new javax.swing.JButton();
        btnNotIslemleri = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnDersIslemleri = new javax.swing.JButton();
        btnBolumIslemleri = new javax.swing.JButton();
        btnParolaDegistir = new javax.swing.JButton();
        btnOgretmenIslemleri = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("YÖNETİM PANELİ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("YÖNETİM PANELİ");

        btnOgrenciIslemleri.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOgrenciIslemleri.setText("ÖĞRENCİ İŞLEMLERİ");
        btnOgrenciIslemleri.setToolTipText("");
        btnOgrenciIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrenciIslemleriActionPerformed(evt);
            }
        });

        btnNotIslemleri.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNotIslemleri.setText("NOT İŞLEMLERİ");
        btnNotIslemleri.setToolTipText("");
        btnNotIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotIslemleriActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn8.setText("ÇIKIŞ");
        btn8.setToolTipText("");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnDersIslemleri.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDersIslemleri.setText("DERS İŞLEMLERİ");
        btnDersIslemleri.setToolTipText("");
        btnDersIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersIslemleriActionPerformed(evt);
            }
        });

        btnBolumIslemleri.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBolumIslemleri.setText("BÖLÜM İŞLEMLERİ");
        btnBolumIslemleri.setToolTipText("");
        btnBolumIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolumIslemleriActionPerformed(evt);
            }
        });

        btnParolaDegistir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnParolaDegistir.setText("PAROLA DEĞİŞTİR");
        btnParolaDegistir.setToolTipText("");
        btnParolaDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParolaDegistirActionPerformed(evt);
            }
        });

        btnOgretmenIslemleri.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOgretmenIslemleri.setText("ÖĞRETMEN İŞLEMLERİ");
        btnOgretmenIslemleri.setToolTipText("");
        btnOgretmenIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgretmenIslemleriActionPerformed(evt);
            }
        });

        jMenu1.setText("Dosya");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Kapat");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Veritabanı");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Sıfırla");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnOgrenciIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBolumIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNotIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDersIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOgretmenIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnParolaDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOgrenciIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOgretmenIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBolumIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDersIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNotIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParolaDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        if (new Controller_Veritabani().Sifirla()) {
            JOptionPane.showMessageDialog(null, "Veritabanı sıfılandı !");
            return;
        }
        JOptionPane.showMessageDialog(null, "İşlem başarısız");
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void btnOgrenciIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrenciIslemleriActionPerformed
         new View_Liste(new Controller_Ogrenci()).setVisible(true);
    }//GEN-LAST:event_btnOgrenciIslemleriActionPerformed

    private void btnNotIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotIslemleriActionPerformed
        new View_Liste(new Controller_Puan()).setVisible(true);
    }//GEN-LAST:event_btnNotIslemleriActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnDersIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersIslemleriActionPerformed
        new View_Liste(new Controller_Ders()).setVisible(true);
    }//GEN-LAST:event_btnDersIslemleriActionPerformed

    private void btnBolumIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolumIslemleriActionPerformed
       new View_Liste(new Controller_Bolum()).setVisible(true);
    }//GEN-LAST:event_btnBolumIslemleriActionPerformed

    private void btnParolaDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParolaDegistirActionPerformed
          new View_ParolaYonetici(this.Id).setVisible(true);
    }//GEN-LAST:event_btnParolaDegistirActionPerformed

    private void btnOgretmenIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgretmenIslemleriActionPerformed
         new View_Liste(new Controller_Ogretmen()).setVisible(true);
    }//GEN-LAST:event_btnOgretmenIslemleriActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnBolumIslemleri;
    private javax.swing.JButton btnDersIslemleri;
    private javax.swing.JButton btnNotIslemleri;
    private javax.swing.JButton btnOgrenciIslemleri;
    private javax.swing.JButton btnOgretmenIslemleri;
    private javax.swing.JButton btnParolaDegistir;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
