package View;


import Controller.Controller_Ders;
import Controller.Controller_Ogrenci;
import Controller.Controller_Puan;

public class View_PanelOgrenci extends javax.swing.JFrame {

    int Id;
    public View_PanelOgrenci(int _Id) {
        initComponents();
        setLocationRelativeTo(null);
        this.Id = _Id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnDers = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnBolum = new javax.swing.JButton();
        btnPuan = new javax.swing.JButton();
        btnKullanici = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ÖĞRENCİ PANELİ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("ÖĞRENCİ PANELİ");

        btnDers.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDers.setText("ALINAN DERSLER");
        btnDers.setToolTipText("");
        btnDers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersActionPerformed(evt);
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

        btnBolum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBolum.setText("KAYITLI BÖLÜM");
        btnBolum.setToolTipText("");
        btnBolum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolumActionPerformed(evt);
            }
        });

        btnPuan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPuan.setText("ALINAN NOTLAR");
        btnPuan.setToolTipText("");
        btnPuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuanActionPerformed(evt);
            }
        });

        btnKullanici.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnKullanici.setText("PAROLA DEĞİŞTİR");
        btnKullanici.setToolTipText("");
        btnKullanici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDers, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBolum, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDers, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBolum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersActionPerformed
        new View_ListeOgrenci(new Controller_Ders(), Id).setVisible(true);
    }//GEN-LAST:event_btnDersActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnBolumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolumActionPerformed
        new View_EkleBolum(Id, false).setVisible(true);
    }//GEN-LAST:event_btnBolumActionPerformed

    private void btnPuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuanActionPerformed
        new View_ListeOgrenci(new Controller_Puan(), Id).setVisible(true);
    }//GEN-LAST:event_btnPuanActionPerformed

    private void btnKullaniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciActionPerformed
        new View_ParolaOgrenci(Id).setVisible(true);
    }//GEN-LAST:event_btnKullaniciActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnBolum;
    private javax.swing.JButton btnDers;
    private javax.swing.JButton btnKullanici;
    private javax.swing.JButton btnPuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
