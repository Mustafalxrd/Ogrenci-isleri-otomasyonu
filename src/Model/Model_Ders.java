package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Ders extends Model_Main{
	
    private String ad;
    private String kod;
    private int kredi;
    private int bolum_id; 
    
    public Model_Ders(String ad) {
        this.ad = ad;
    }

    public Model_Ders() {
        super.setTabloAd("ders");
    }

    public Model_Ders(int Id) {
        super(Id);
    }

    public Model_Ders(int Id, String ad, String kod, int kredi, int bolum_id) {
        super(Id);
        this.ad = ad;
        this.kod = kod;
        this.kredi = kredi;
        this.bolum_id = bolum_id;
    }

    public Model_Ders(String ad, String kod, int kredi, int bolum_id) {
        this.ad = ad;
        this.kod = kod;
        this.kredi = kredi;
        this.bolum_id = bolum_id;
    }

    public Model_Ders(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            ad = resultSet.getString("ad");
            kod = resultSet.getString("kod");
            kredi = resultSet.getInt("kredi");
            bolum_id = resultSet.getInt("bolum_id");
        } catch (SQLException ex) {
            Logger.getLogger(Model_Ders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String[] getKolonlar() {
        return new String[]{"Id", "Ad", "Kod", "Kredi", "Bolum"};
    }

    @Override
    public Object[] getObject() {
        return new Object[]{super.getId(), ad, kod, kredi, bolum_id};
    }

    @Override
    public String getInsert() {
        String sorgu = "insert into " + super.getTabloAd()
                + " (ad, kod, kredi, bolum_id) values("
                + "'" + ad + "', '" + kod + "', " + kredi+ ", "+ bolum_id
                + ")";
        return sorgu;
    }

    @Override
    public String getUpdate() {
        String sorgu = "update " + super.getTabloAd() + " set "
                + "ad='" + ad + "', kod='" + kod + "', kredi=" + kredi + ", bolum_id=" + bolum_id
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getSearch(String value) {
        String sorgu = "select * from " + super.getTabloAd()
                + "ad LIKE '%" + value + "%' or"
                + "kod LIKE '%" + value + "%'";
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
                + " Where kod='" + kod + "'";
        return sorgu;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    public int getBolum_id() {
        return bolum_id;
    }

    public void setBolum_id(int bolum_id) {
        this.bolum_id = bolum_id;
    }

    
	
}
