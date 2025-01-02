package View;

public class View_AnaPencere extends javax.swing.JFrame {
    
    public View_AnaPencere() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnCikis = new javax.swing.JButton();
        btnOgretmen = new javax.swing.JButton();
        btnOgrenci = new javax.swing.JButton();
        btnMisafir = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ana Pencere");
        setResizable(false);

        btnCikis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCikis.setText("ÇIKIŞ");
        btnCikis.setToolTipText("");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        btnOgretmen.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOgretmen.setText("ÖĞRETMEN GİRİŞİ");
        btnOgretmen.setToolTipText("");
        btnOgretmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgretmenActionPerformed(evt);
            }
        });

        btnOgrenci.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOgrenci.setText("ÖĞRENCİ GİRİŞİ");
        btnOgrenci.setToolTipText("");
        btnOgrenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrenciActionPerformed(evt);
            }
        });

        btnMisafir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMisafir.setText("YÖNETİCİ GİRİŞİ");
        btnMisafir.setToolTipText("");
        btnMisafir.setActionCommand("YÖNETİCİ GİRİŞİ");
        btnMisafir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisafirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMisafir, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOgretmen, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOgretmen, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMisafir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnOgretmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgretmenActionPerformed
        new View_GirisOgretmen().setVisible(true);
    }//GEN-LAST:event_btnOgretmenActionPerformed

    private void btnOgrenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrenciActionPerformed
       new View_GirisOgrenci().setVisible(true);
    }//GEN-LAST:event_btnOgrenciActionPerformed

    private void btnMisafirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisafirActionPerformed
      new View_GirisYonetici().setVisible(true);
    }//GEN-LAST:event_btnMisafirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnMisafir;
    private javax.swing.JButton btnOgrenci;
    private javax.swing.JButton btnOgretmen;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
