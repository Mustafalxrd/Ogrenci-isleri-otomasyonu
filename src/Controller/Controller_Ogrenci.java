package Controller;

import Model.Model_Ogrenci;
import Model.Model_Main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller_Ogrenci extends Controller_Main {

    public Controller_Ogrenci() {
        super(new Model_Ogrenci());
    }

    public boolean ParolaDegistir(int id, String yeni){
         String sorgu ="update " + super.getTabloAd() + " set "
                + "parola='" + yeni + "'"
                + " Where Id=" + id;
         return new Controller_Veritabani().Sorgu(sorgu);
    }
        
    @Override
    public boolean Kontrol(Model_Main model) {
        Model_Ogrenci model2 = (Model_Ogrenci) model;
        model2.setTabloAd(super.getTabloAd());
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            System.out.println(model2.getControl());
            resultSet = statement.executeQuery(model2.getControl());
            while (resultSet.next()) {
                resultSet.close();
                connection.close();
                return true;
            }
            resultSet.close();
            connection.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Ogrenci.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<Model_Main> Listele(JTable Tablo) {
        try {
            String sorgu = "Select * From " + super.getTabloAd();
            connection = new Controller_Veritabani().Baglanti();
            resultSet = statement.executeQuery(sorgu);

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();

            while (resultSet.next()) {
                Model_Ogrenci kayit = new Model_Ogrenci(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }

            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Ogrenci.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public ArrayList<Model_Main> Ara(JTable Tablo, String aranan) {
        try {
            connection = new Controller_Veritabani().Baglanti();
            resultSet = statement.executeQuery(new Model_Ogrenci().getSearch(aranan));

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();

            while (resultSet.next()) {
                Model_Ogrenci kayit = new Model_Ogrenci(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }
            resultSet.close();
            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Ogrenci.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean Ekle(Model_Main model) {
        Model_Ogrenci model2 = (Model_Ogrenci) model;
        model2.setTabloAd(super.getTabloAd());
        return new Controller_Veritabani().Sorgu(model2.getInsert());
    }

    @Override
    public boolean Guncelle(Model_Main model) {
        Model_Ogrenci model2 = (Model_Ogrenci) model;
        model2.setTabloAd(super.getTabloAd());
        return new Controller_Veritabani().Sorgu(model2.getUpdate());
    }

    @Override
    public Model_Ogrenci Getir(Model_Main model) {
        Model_Ogrenci model2 = (Model_Ogrenci) model;
        model2.setTabloAd(super.getTabloAd());
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(model2.getGet());
            while (resultSet.next()) {
                model2 = new Model_Ogrenci(resultSet);
                resultSet.close();
                connection.close();
                return model2;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Ogrenci.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Guncelle(int Id) {
        new View.View_EkleOgrenci(Id).setVisible(true);
    }

    @Override
    public void Ac() {
        new View.View_EkleOgrenci().setVisible(true);
    }

    public Model_Ogrenci Getir(String tcno) {
        Model_Ogrenci model2 = new Model_Ogrenci();
        model2.setTc_no(tcno);
        model2.setTabloAd(super.getTabloAd());
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(model2.getTc_no());
            while (resultSet.next()) {
                model2 = new Model_Ogrenci(resultSet);
                resultSet.close();
                connection.close();
                return model2;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Ogrenci.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
