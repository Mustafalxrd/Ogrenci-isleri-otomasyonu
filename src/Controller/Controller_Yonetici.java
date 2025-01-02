package Controller;

import Model.Model_Yonetici;
import Model.Model_Main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller_Yonetici extends Controller_Main {

    public Controller_Yonetici() {
        super(new Model_Yonetici());
    }
    
    public boolean ParolaDegistir(int id, String yeni){
         String sorgu ="update " + super.getTabloAd() + " set "
                + "parola='" + yeni + "'"
                + " Where Id=" + id;
         return new Controller_Veritabani().Sorgu(sorgu);
    }

    public boolean Kontrol(String kullanici_adi, String parola) {
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            String sorgu = "Select * From " + super.getTabloAd()
                    + " Where kullanici_adi='" + kullanici_adi + "' and parola='"+ parola+"'";
            resultSet = statement.executeQuery(sorgu);
            while (resultSet.next()) {
                resultSet.close();
                connection.close();
                return true;
            }
            resultSet.close();
            connection.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
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
                Model_Yonetici kayit = new Model_Yonetici(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }

            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public ArrayList<Model_Main> Ara(JTable Tablo, String aranan) {
        try {
            connection = new Controller_Veritabani().Baglanti();
            resultSet = statement.executeQuery(new Model_Yonetici().getSearch(aranan));

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();

            while (resultSet.next()) {
                Model_Yonetici kayit = new Model_Yonetici(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }
            resultSet.close();
            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean Ekle(Model_Main model) {
        Model_Yonetici model2 = (Model_Yonetici) model;
        model2.setTabloAd(super.getTabloAd());
        return new Controller_Veritabani().Sorgu(model2.getInsert());
    }

    @Override
    public boolean Guncelle(Model_Main model) {
        Model_Yonetici model2 = (Model_Yonetici) model;
        model2.setTabloAd(super.getTabloAd());
        return new Controller_Veritabani().Sorgu(model2.getUpdate());
    }
    
    public Model_Yonetici Getir(String kullanic_adi, String parola) {
        Model_Yonetici model2 = new Model_Yonetici(kullanic_adi, parola);
        model2.setTabloAd(super.getTabloAd());
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(model2.getGet(kullanic_adi, parola));
            
            while (resultSet.next()) {
                model2 = new Model_Yonetici(resultSet);
                resultSet.close();
                connection.close();
                return model2;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Model_Yonetici Getir(Model_Main model) {
        Model_Yonetici model2 = (Model_Yonetici) model;
        model2.setTabloAd(super.getTabloAd());
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(model2.getGet());
            while (resultSet.next()) {
                model2 = new Model_Yonetici(resultSet);
                resultSet.close();
                connection.close();
                return model2;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Guncelle(int Id) {
        //new View.View_EkleBolum(Id).setVisible(true);
    }

    @Override
    public void Ac() {
       //
    }

    @Override
    public boolean Kontrol(Model_Main model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
