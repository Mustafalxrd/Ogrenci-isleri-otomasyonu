package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Bolum extends Model_Main{
	
    private String ad;
    private String kod;
    private String lisans_tur;
    
    public Model_Bolum(String ad) {
        this.ad = ad;
    }

    public Model_Bolum() {
        super.setTabloAd("bolum");
    }

    public Model_Bolum(int Id) {
        super(Id);
    }

    public Model_Bolum(int Id, String ad, String kod, String lisans_tur) {
        super(Id);
        this.ad = ad;
        this.kod = kod;
        this.lisans_tur = lisans_tur;
    }

    public Model_Bolum(String ad, String kod, String lisans_tur) {
        this.ad = ad;
        this.kod = kod;
        this.lisans_tur = lisans_tur;
    }

    public Model_Bolum(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            ad = resultSet.getString("ad");
            kod = resultSet.getString("kod");
            lisans_tur = resultSet.getString("lisans_tur");
        } catch (SQLException ex) {
            Logger.getLogger(Model_Bolum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String[] getKolonlar() {
        return new String[]{"Id", "Ad", "Kod","Tür"};
    }

    @Override
    public Object[] getObject() {
        return new Object[]{super.getId(), ad, kod, lisans_tur};
    }

    @Override
    public String getInsert() {
        String sorgu = "insert into " + super.getTabloAd()
                + " (ad, kod, lisans_tur) values("
                + "'" + ad + "', '" + 
                kod + "', '" +
                lisans_tur + "' " 
                + ")";
        return sorgu;
    }

    @Override
    public String getUpdate() {
        String sorgu = "update " + super.getTabloAd() + " set "
                + "ad='" + ad + "', "
                + "kod='" + kod + "',"
                + "lisans_tur='" + lisans_tur + "'"
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

    public String getLisans_tur() {
        return lisans_tur;
    }

    public void setLisans_tur(String lisans_tur) {
        this.lisans_tur = lisans_tur;
    }

    
	
}
