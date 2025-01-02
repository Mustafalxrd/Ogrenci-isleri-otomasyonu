package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Yonetici extends Model_Main{
	
    private String kullanici_adi;
    private String parola;
    
    public Model_Yonetici() {
        super.setTabloAd("yonetici");
    }

    public Model_Yonetici(int Id) {
        super(Id);
    }

    public Model_Yonetici(String kullanici_adi, String parola) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
    }

    public Model_Yonetici(int Id, String kullanici_adi, String parola) {
        super(Id);
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
    }

    public Model_Yonetici(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            kullanici_adi = resultSet.getString("kullanici_adi");
            parola = resultSet.getString("parola");
        } catch (SQLException ex) {
            Logger.getLogger(Model_Yonetici.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getParolaUpdate(){
        String sorgu = "update " + super.getTabloAd() + " set "
                + "parola='" + parola + "'"
                + " Where Id=" + super.getId();
        return sorgu;
    }
    
    @Override
    public String[] getKolonlar() {
        return new String[]{"Id", "Kullanıcı Adı", "Parola"};
    }

    @Override
    public Object[] getObject() {
        return new Object[]{super.getId(), kullanici_adi, parola};
    }

    @Override
    public String getInsert() {
        String sorgu = "insert into " + super.getTabloAd()
                + " (kullanici_adi, parola) values("
                + "'" + kullanici_adi + "', '" 
                + parola + "',"
                + ")";
        return sorgu;
    }

    @Override
    public String getUpdate() {
        String sorgu = "update " + super.getTabloAd() + " set "
                + "kullanici_adi='" + kullanici_adi + "', "
                + "parola='" + parola + "'"
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getSearch(String value) {
        String sorgu = "select * from " + super.getTabloAd()
                + "kullanici_adi LIKE '%" + value + "%'";
        return sorgu;
    }
    
    public String getGet(String kullanici_adi, String parola) {
        String sorgu = "select * from " + super.getTabloAd()
                + " Where kullanici_adi='" +kullanici_adi+"' and parola='"+parola+"'";
        return sorgu;
    }

    @Override
    public String getGet() {
        String sorgu = "select * from " + super.getTabloAd()
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getControl() {
        String sorgu = "select * from " + super.getTabloAd()
                + " Where kullanici_adi='" + kullanici_adi + "'";
        return sorgu;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

	
}
