package View;

import Controller.Controller_Ogretmen;
import Model.Model_Ogretmen;
import javax.swing.JOptionPane;

public final class View_EkleOgretmen extends javax.swing.JFrame {

    int Id = 0;
    String baslik = "ÖĞRETMEN";
    Controller_Ogretmen controller = new Controller_Ogretmen();
    
      public View_EkleOgretmen(int _Id, boolean pasif) {
        initComponents();
        setTitle("BİLGİLER");

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);
        
        btnKaydet.setVisible(false);
        txtAd.setEnabled(false);
        txtAdres.setEnabled(false);
        txtBolum.setEnabled(false);
        txtCinsiyet.setEnabled(false);
        txtDogum.setEnabled(false);
        txtEposta.setEnabled(false);
        txtParola.setEnabled(false);
        txtSoyad.setEnabled(false);
        txtTcno.setEnabled(false);
        txtTelefon.setEnabled(false);

        this.Id = _Id;
        Getir();
    }

    public View_EkleOgretmen() {
        initComponents();
        setTitle("EKLE");

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);
    }

    public View_EkleOgretmen(int _Id) {
        initComponents();
        this.Id = _Id;
        setTitle("GÜNCELLE (" + Id + ")");

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);

        btnKaydet.setText("GÜNCELLE");
        Getir();
    }

    public void Getir() {
        Model_Ogretmen model = controller.Getir(new Model_Ogretmen(Id));
        txtTcno.setText(model.getTc_no());
        txtAd.setText(model.getAd());
        txtSoyad.setText(model.getSoyad());
        txtDogum.setText(model.getDogum_tarihi());
        txtTelefon.setText(model.getTelefon());
        txtEposta.setText(model.getEposta());
        txtAdres.setText(model.getAdres());
        txtCinsiyet.setText(model.getCinsiyet());
        txtParola.setText(model.getParola());
        txtBolum.setText(String.valueOf(model.getBolum_id()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBaslik = new javax.swing.JLabel();
        btnKaydet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTcno = new javax.swing.JTextField();
        txtAd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDogum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEposta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAdres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBolum = new javax.swing.JTextField();
        txtCinsiyet = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtParola = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lbBaslik.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbBaslik.setText("...");

        btnKaydet.setText("KAYDET");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        jLabel1.setText("TcNo");

        jLabel2.setText("Ad");

        jLabel3.setText("Soyad");

        jLabel4.setText("Doğum");

        jLabel5.setText("Telefon");
        jLabel5.setToolTipText("");

        jLabel6.setText("Eposta");

        jLabel8.setText("Adres");

        jLabel9.setText("Bölüm");

        jLabel10.setText("Cinsiyet");

        jLabel12.setText("Parola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBolum)
                            .addComponent(txtParola)
                            .addComponent(txtAdres)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAd)
                                    .addComponent(txtTcno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoyad)
                                    .addComponent(txtCinsiyet, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDogum, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEposta)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbBaslik)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBaslik)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDogum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        if (Id == 0 && controller.Kontrol(new Model_Ogretmen(txtTcno.getText()))) {
            JOptionPane.showMessageDialog(null, "Aynı TcNo ya sahip kayıt bulunmakta !");
            return;
        }
        if (Id == 0) {

            boolean sonuc = controller.Ekle(
                    new Model_Ogretmen(
                            txtTcno.getText(),
                            txtAd.getText(),
                            txtSoyad.getText(),
                            txtCinsiyet.getText(),
                            txtDogum.getText(),
                            txtTelefon.getText(),
                            txtEposta.getText(),
                            txtAdres.getText(),
                            Integer.valueOf(txtBolum.getText()),
                            txtParola.getText()
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Kayıt eklendi.");
            } else {
                JOptionPane.showMessageDialog(null, "Kayıt ekleme başarısız.");
            }
        } else {
            boolean sonuc = controller.Guncelle(
                    new Model_Ogretmen(
                            Id,
                            txtTcno.getText(),
                            txtAd.getText(),
                            txtSoyad.getText(),
                            txtCinsiyet.getText(),
                            txtDogum.getText(),
                            txtTelefon.getText(),
                            txtEposta.getText(),
                            txtAdres.getText(),
                            Integer.valueOf(txtBolum.getText()),
                            txtParola.getText()
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbBaslik;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtBolum;
    private javax.swing.JTextField txtCinsiyet;
    private javax.swing.JTextField txtDogum;
    private javax.swing.JTextField txtEposta;
    private javax.swing.JTextField txtParola;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTcno;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
