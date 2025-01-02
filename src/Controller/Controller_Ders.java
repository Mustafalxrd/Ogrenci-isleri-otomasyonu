package Controller;

import Model.Model_Ders;
import Model.Model_Main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controller_Ders extends Controller_Main {

    public Controller_Ders() {
        super(new Model_Ders());
    }

    public boolean Kontrol(String ad) {
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            String sorgu = "Select * From " + super.getTabloAd()
                    + " Where ad='" + ad + "'";
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
            Logger.getLogger(Controller_Ders.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList<Model_Main> ListeleBolum(JTable Tablo, int bolum_id) {
        try {
            String sorgu = "Select * From " + super.getTabloAd()+ " Where bolum_id="+bolum_id;
            connection = new Controller_Veritabani().Baglanti();
            resultSet = statement.executeQuery(sorgu);

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();

            while (resultSet.next()) {
                Model_Ders kayit = new Model_Ders(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }

            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Ders.class.getName()).log(Level.SEVERE, null, ex);
            return null;
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
                Model_Ders kayit = new Model_Ders(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }

            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Ders.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public ArrayList<Model_Main> Ara(JTable Tablo, String aranan) {
        try {
            connection = new Controller_Veritabani().Baglanti();
            resultSet = statement.executeQuery(new Model_Ders().getSearch(aranan));

            DefaultTableModel model = (DefaultTableModel) Tablo.getModel();
            model.setRowCount(0);
            ArrayList<Model_Main> arrayList = new ArrayList<>();

            while (resultSet.next()) {
                Model_Ders kayit = new Model_Ders(resultSet);
                model.addRow(kayit.getObject());
                arrayList.add(kayit);
            }
            resultSet.close();
            connection.close();
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Ders.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean Ekle(Model_Main model) {
        Model_Ders model2 = (Model_Ders) model;
        model2.setTabloAd(super.getTabloAd());
        return new Controller_Veritabani().Sorgu(model2.getInsert());
    }

    @Override
    public boolean Guncelle(Model_Main model) {
        Model_Ders model2 = (Model_Ders) model;
        model2.setTabloAd(super.getTabloAd());
        return new Controller_Veritabani().Sorgu(model2.getUpdate());
    }

    @Override
    public Model_Ders Getir(Model_Main model) {
        Model_Ders model2 = (Model_Ders) model;
        model2.setTabloAd(super.getTabloAd());
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(model.getGet());
            while (resultSet.next()) {
                model2 = new Model_Ders(resultSet);
                resultSet.close();
                connection.close();
                return model2;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Ders.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Model_Ders Getir(String ad) {
        Model_Ders model = new Model_Ders(ad);
        model.setTabloAd(super.getTabloAd());
        try {
            connection = new Controller_Veritabani().Baglanti();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(model.getControl());

            while (resultSet.next()) {
                model = new Model_Ders(resultSet);
                resultSet.close();
                connection.close();
                return model;
            }
            resultSet.close();
            connection.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Ders.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Guncelle(int Id) {
        new View.View_EkleDers(Id).setVisible(true);
    }

    @Override
    public void Ac() {
        new View.View_EkleDers().setVisible(true);
    }

    @Override
    public boolean Kontrol(Model_Main model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
