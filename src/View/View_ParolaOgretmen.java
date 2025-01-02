package View;

import Controller.Controller_Ogretmen;
import Model.Model_Ogretmen;
import javax.swing.JOptionPane;

public final class View_ParolaOgretmen extends javax.swing.JFrame {

    int Id = 0;
    String baslik = "PAROLA DEĞİŞTİR";

    Controller_Ogretmen controller = new Controller_Ogretmen();

    public View_ParolaOgretmen() {
        initComponents();
        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);
    }

    public View_ParolaOgretmen(int _Id) {
        initComponents();
        this.Id = _Id;

        setLocationRelativeTo(null);
        lbBaslik.setText(baslik);
        
        btnKaydet.setText("GÜNCELLE ("+ String.valueOf(Id));
        Getir();
    }

    public void Getir() {
        Model_Ogretmen model = controller.Getir(new Model_Ogretmen(Id));
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBaslik = new javax.swing.JLabel();
        btnKaydet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtYeniParola = new javax.swing.JTextField();

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

        jLabel1.setText("Yeni Parola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtYeniParola, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbBaslik)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBaslik)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtYeniParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        if (txtYeniParola.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Gerekli alanları doldurunuz !!");
            return;
        }
        else {
            boolean sonuc = controller.ParolaDegistir(this.Id, txtYeniParola.getText());
            
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Parola güncellendi.");
            } else {
                JOptionPane.showMessageDialog(null, "Parola güncelleme başarısız.");
            }
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBaslik;
    private javax.swing.JTextField txtYeniParola;
    // End of variables declaration//GEN-END:variables
}
