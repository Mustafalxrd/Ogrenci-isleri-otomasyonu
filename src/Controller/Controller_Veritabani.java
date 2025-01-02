package Controller;

import Interface.Interface_Veritabani;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller_Veritabani implements Interface_Veritabani {

    private static final String URL = "jdbc:mysql://localhost:3306/okul"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "12345678";

    @Override
    public Connection Baglanti() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller_Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Sorgu(String sorgu) {
        try (Connection connection = Baglanti(); Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sorgu);
            return true;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean TabloOlustur() {
        try (Connection connection = Baglanti(); Statement statement = connection.createStatement()) {
            
            String tbl_yonetici = "CREATE TABLE IF NOT EXISTS yonetici ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "kullanici_adi VARCHAR(255),"
                    + "parola VARCHAR(255)"
                    + ")";

            String tbl_bolum = "CREATE TABLE IF NOT EXISTS bolum ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "ad VARCHAR(255),"
                    + "kod VARCHAR(255),"
                    + "lisans_tur VARCHAR(255)"
                    + ")";
            
            String tbl_ders = "CREATE TABLE IF NOT EXISTS ders ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "ad VARCHAR(255),"
                    + "kod VARCHAR(255),"
                    + "kredi VARCHAR(255),"
                    + "bolum_id INT,"
                    + "FOREIGN KEY (bolum_id) REFERENCES bolum(id)"
                    + ")";

            String tbl_puan = "CREATE TABLE IF NOT EXISTS puan ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "ogrenci_id INT,"
                    + "ders_id INT,"
                    + "tur VARCHAR(255),"
                    + "puan INT,"
                    + "tarih VARCHAR(255),"
                    + "FOREIGN KEY (ogrenci_id) REFERENCES ogrenci(id),"
                    + "FOREIGN KEY (ders_id) REFERENCES ders(id)"
                    + ")";
            
            String tbl_ogretmen = "CREATE TABLE IF NOT EXISTS ogretmen ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "tc_no VARCHAR(255),"
                    + "ad VARCHAR(255),"
                    + "soyad VARCHAR(255),"
                    + "cinsiyet VARCHAR(255),"
                    + "dogum_tarihi VARCHAR(255),"
                    + "telefon VARCHAR(255),"
                    + "eposta VARCHAR(255),"
                    + "adres TEXT,"
                    + "bolum_id INT,"
                    + "parola VARCHAR(255),"
                    + "FOREIGN KEY (bolum_id) REFERENCES bolum(id)"
                    + ")";
                   
            String tbl_ogrenci = "CREATE TABLE IF NOT EXISTS ogrenci ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "tc_no VARCHAR(255),"
                    + "ad VARCHAR(255),"
                    + "soyad VARCHAR(255),"
                    + "cinsiyet VARCHAR(255),"
                    + "dogum_tarihi VARCHAR(255),"
                    + "telefon VARCHAR(255),"
                    + "eposta VARCHAR(255),"
                    + "adres TEXT,"
                    + "bolum_id INT,"
                    + "parola TEXT,"
                    + "FOREIGN KEY (bolum_id) REFERENCES bolum(id)"
                    + ")";

            statement.executeUpdate(tbl_yonetici);
            statement.executeUpdate(tbl_bolum);
            statement.executeUpdate(tbl_ders);
            statement.executeUpdate(tbl_ogretmen);
            statement.executeUpdate(tbl_ogrenci);
            statement.executeUpdate(tbl_puan);
            
            String varsayilan_yonetici = "INSERT INTO yonetici (kullanici_adi, parola) values('yonetici','12345678')";
            statement.executeUpdate(varsayilan_yonetici);
            
            
            String fix = "ALTER DATABASE okul CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;";
            statement.executeUpdate(fix);

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Veritabani.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean Sifirla() {
        try (Connection connection = Baglanti(); Statement statement = connection.createStatement()) {

            statement.executeUpdate("DROP TABLE IF EXISTS ogrenci");
            statement.executeUpdate("DROP TABLE IF EXISTS ogretmen");
            statement.executeUpdate("DROP TABLE IF EXISTS bolum");
            statement.executeUpdate("DROP TABLE IF EXISTS ders");
            statement.executeUpdate("DROP TABLE IF EXISTS puan");

            return TabloOlustur();
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Veritabani.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
