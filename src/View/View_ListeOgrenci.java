package View;

import Controller.Controller_Ders;
import Controller.Controller_Main;
import Controller.Controller_Ogrenci;
import Controller.Controller_Puan;
import Model.Model_Main;
import Model.Model_Ogrenci;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public final class View_ListeOgrenci extends javax.swing.JFrame {

    Controller_Main controller;

    int Id = 0;
    int ogrenci_id;
    String baslik;
    String tur;

    public View_ListeOgrenci(Controller_Main controller, int _ogrenci_id) {
        initComponents();
        setLocationRelativeTo(null);
        
        this.controller = controller;
        this.ogrenci_id = _ogrenci_id;
        Ayarla();

        
    }
    
    public void Ayarla(){
        Model_Main model = controller.getModel();
        
        BaslikAyarla(model);
        setTitle(baslik);
        lb_Baslik.setText(baslik);
        tb_Kayitlar.setModel(new DefaultTableModel(new Object[][]{}, model.getKolonlar()));
        Listele();
    }

    public void BaslikAyarla(Model_Main model) {
        baslik = model.getTabloAd().toUpperCase();
    }

    
    public void Listele(){
        switch(controller.getTabloAd()){
                case "ders":
                    DersListele();
                case "puan":
                    PuanListele();
                default:
                    DersListele();
        }
    }
    
    public void DersListele() {
        Controller_Ogrenci controller_Ogrenci = new Controller_Ogrenci();
        int bolum_id = controller_Ogrenci.Getir(new Model_Ogrenci(ogrenci_id)).getBolum_id();
        new Controller_Ders().ListeleBolum(tb_Kayitlar, bolum_id);
    }
    
    public void PuanListele() {
        new Controller_Puan().ListeleOgrenci(tb_Kayitlar, ogrenci_id);
    }


    public void SatirSec(ListSelectionEvent evt) {
        try {
            Id = Integer.valueOf(tb_Kayitlar.getValueAt(tb_Kayitlar.getSelectedRow(), 0).toString());
        } catch (Exception ex) {

        }
    }

    //bütün nesne tanımlama ve konumlandırma işlemleri diğer sınıflarda aynı olduğundan tekrar açıklama eklenmemiştir
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_Baslik = new javax.swing.JLabel();
        btnYenile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Kayitlar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filmler");

        lb_Baslik.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lb_Baslik.setText("...");

        btnYenile.setText("YENİLE");
        btnYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenileActionPerformed(evt);
            }
        });

        tb_Kayitlar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_Kayitlar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_Baslik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lb_Baslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        //Listele methodunun çağrılması
        Listele();
    }//GEN-LAST:event_btnYenileActionPerformed

    //ilgili nesnelerin tanımlanması işlemi
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnYenile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Baslik;
    private javax.swing.JTable tb_Kayitlar;
    // End of variables declaration//GEN-END:variables
}
