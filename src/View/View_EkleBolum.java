package View;

import Controller.Controller_Bolum;
import Model.Model_Bolum;
import javax.swing.JOptionPane;

public final class View_EkleBolum extends javax.swing.JFrame {

    int Id = 0;
    String baslik = "BÖLÜM";

    Controller_Bolum controller = new Controller_Bolum();

     public View_EkleBolum(int _Id, boolean pasif) {
        initComponents();
        setTitle("BİLGİLER");

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);
        
        btnKaydet.setVisible(false);
        txtAd.setEnabled(false);
        txtKod.setEnabled(false);
        cbTur.setEnabled(false);
        
        this.Id = _Id;
        Getir();
    }

    public View_EkleBolum() {
        initComponents();
        setTitle("EKLE");

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);
    }

    public View_EkleBolum(int _Id) {
        initComponents();
        this.Id = _Id;
        setTitle("GÜNCELLE (" + Id + ")");

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);

        btnKaydet.setText("GÜNCELLE");
        Getir();
    }

    public void Getir() {
        Model_Bolum model = controller.Getir(new Model_Bolum(Id));
     
        txtAd.setText(model.getAd());
        txtKod.setText(model.getKod());
        secTur(model.getLisans_tur());
    }

    public void secTur(String tur){
        if(tur.equals("")){
            return;
        }
        for (int i = 0; i < cbTur.getItemCount(); i++) {
            if(cbTur.getItemAt(i).equals(tur)){
                cbTur.setSelectedIndex(i);
                return;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBaslik = new javax.swing.JLabel();
        btnKaydet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtKod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        cbTur = new javax.swing.JComboBox<>();

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

        jLabel1.setText("Bölüm Kodu");

        jLabel2.setText("Lisans Türü");

        jLabel7.setText("Bölüm Adı");

        cbTur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ön Lisans", "Lisans", "Yüksek Lisans", "Doktora" }));

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
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1))
                            .addComponent(jLabel7)
                            .addComponent(lbBaslik)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtKod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtAd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTur, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBaslik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        if (txtAd.getText().equals("") || txtKod.getText().equals("") || cbTur.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Gerekli alanları doldurunuz !!");
            return;
        }
        if (Id == 0 && controller.Kontrol(txtAd.getText())) {
            JOptionPane.showMessageDialog(null, "Aynı değere sahip kayıt bulunmakta !");
            return;
        }
        if (Id == 0) {

            boolean sonuc = controller.Ekle(
                    new Model_Bolum(
                            txtAd.getText(),
                            txtKod.getText(),
                            cbTur.getSelectedItem().toString()
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Kayıt eklendi.");
            } else {
                JOptionPane.showMessageDialog(null, "Kayıt ekleme başarısız.");
            }
        } else {
            boolean sonuc = controller.Guncelle(
                    new Model_Bolum(
                            Id,
                            txtAd.getText(),
                            txtKod.getText(),
                            cbTur.getSelectedItem().toString()
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
    private javax.swing.JComboBox<String> cbTur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbBaslik;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtKod;
    // End of variables declaration//GEN-END:variables
}
