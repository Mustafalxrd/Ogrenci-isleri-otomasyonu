package View;

import Controller.Controller_Puan;
import Model.Model_Puan;
import javax.swing.JOptionPane;

public final class View_EklePuan extends javax.swing.JFrame {

    int Id = 0;
    String baslik = "PUAN";

    Controller_Puan controller = new Controller_Puan();

    public View_EklePuan() {
        initComponents();
        setTitle("EKLE");

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);
    }

    public View_EklePuan(int _Id) {
        initComponents();
        this.Id = _Id;
        setTitle("GÜNCELLE (" + Id + ")");

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);

        btnKaydet.setText("GÜNCELLE");
        Getir();
    }

    public void Getir() {
        Model_Puan model = controller.Getir(new Model_Puan(Id));
     
        txtOgrenci.setText(String.valueOf(model.getOgrenci_id()));
        txtDers.setText(String.valueOf(model.getDers_id()));
        txtTur.setText(model.getTur());
        txtPuan.setText(String.valueOf(model.getPuan()));
        txtTarih.setText(model.getTarih());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBaslik = new javax.swing.JLabel();
        btnKaydet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDers = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOgrenci = new javax.swing.JTextField();
        txtTarih = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPuan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTur = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbBaslik.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbBaslik.setText("...");

        btnKaydet.setText("KAYDET");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        jLabel1.setText("Ders");

        jLabel7.setText("Öğrenci");

        jLabel3.setText("Tarih");

        jLabel4.setText("Puan");

        jLabel2.setText("Tür");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lbBaslik)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtOgrenci, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTarih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtPuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtTur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBaslik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        if (txtOgrenci.getText().equals("") ||
                txtDers.getText().equals("") ||
                txtTarih.getText().equals("")||
                txtPuan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Gerekli alanları doldurunuz !!");
            return;
        }

        if (Id == 0) {

            boolean sonuc = controller.Ekle(
                    new Model_Puan(
                            Integer.valueOf(txtOgrenci.getText()),
                            Integer.valueOf(txtDers.getText()),
                            txtTur.getText(),
                            Integer.valueOf(txtPuan.getText()),
                            txtTarih.getText()
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Kayıt eklendi.");
            } else {
                JOptionPane.showMessageDialog(null, "Kayıt ekleme başarısız.");
            }
        } else {
            boolean sonuc = controller.Guncelle(
                    new Model_Puan(
                            Id,
                            Integer.valueOf(txtOgrenci.getText()),
                            Integer.valueOf(txtDers.getText()),
                            txtTur.getText(),
                            Integer.valueOf(txtPuan.getText()),
                            txtTarih.getText()
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Kayıt güncellendi.");
            } else {
                JOptionPane.showMessageDialog(null, "Kayıt güncelleme başarısız.");
            }
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbBaslik;
    private javax.swing.JTextField txtDers;
    private javax.swing.JTextField txtOgrenci;
    private javax.swing.JTextField txtPuan;
    private javax.swing.JTextField txtTarih;
    private javax.swing.JTextField txtTur;
    // End of variables declaration//GEN-END:variables
}
