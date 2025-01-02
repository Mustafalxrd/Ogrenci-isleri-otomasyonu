package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Ogretmen extends Model_Main {

    private String tc_no;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private String dogum_tarihi;
    private String telefon;
    private String eposta;
    private String adres;
    private int bolum_id;
    private String parola;

    public Model_Ogretmen(String tcno) {
        this.tc_no = tcno;
    }

    public Model_Ogretmen() {
        super.setTabloAd("ogretmen");
    }

    public Model_Ogretmen(int Id) {
        super(Id);
    }

    public Model_Ogretmen(String tc_no, String parola) {
        this.tc_no = tc_no;
        this.parola = parola;
    }

    public Model_Ogretmen(String tc_no, String ad, String soyad, String cinsiyet, String dogum_tarihi, String telefon, String eposta, String adres, int bolum_id, String parola) {
        this.tc_no = tc_no;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.dogum_tarihi = dogum_tarihi;
        this.telefon = telefon;
        this.eposta = eposta;
        this.adres = adres;
        this.bolum_id = bolum_id;
        this.parola = parola;
    }

    public Model_Ogretmen(int Id, String tc_no, String ad, String soyad, String cinsiyet, String dogum_tarihi, String telefon, String eposta, String adres, int bolum_id, String parola) {
        super(Id);
        this.tc_no = tc_no;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.dogum_tarihi = dogum_tarihi;
        this.telefon = telefon;
        this.eposta = eposta;
        this.adres = adres;
        this.bolum_id = bolum_id;
        this.parola = parola;
    }
    
   
    
    public Model_Ogretmen(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            tc_no = resultSet.getString("tc_no");
            ad = resultSet.getString("ad");
            soyad = resultSet.getString("soyad");
            cinsiyet = resultSet.getString("cinsiyet");
            dogum_tarihi = resultSet.getString("dogum_tarihi");
            telefon = resultSet.getString("telefon");
            eposta = resultSet.getString("eposta");
            adres = resultSet.getString("adres");
            bolum_id = resultSet.getInt("bolum_id");
            parola = resultSet.getString("parola");

        } catch (SQLException ex) {
            Logger.getLogger(Model_Ogretmen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String[] getKolonlar() {
        return new String[]{"Id", "Tc No", "Ad", "Soyad", "Cinsiyer", "Doğum", "Telefon", "Eposta", "Adres", "Bolum"};
    }

    @Override
    public Object[] getObject() {
        return new Object[]{super.getId(),
            tc_no,
            ad,
            soyad,
            cinsiyet,
            dogum_tarihi,
            telefon,
            eposta,
            adres,
            bolum_id,
            parola
        };
    }

    @Override
    public String getInsert() {
        String sorgu = "insert into " + super.getTabloAd()
                + " (tc_no, ad, soyad,cinsiyet,dogum_tarihi,telefon,eposta,adres,parola,bolum_id) values("
                + "'" + tc_no + "',"
                + " '" + ad + "', "
                + " '" + soyad + "', "
                + " '" + cinsiyet + "', "
                + " '" + dogum_tarihi + "', "
                + " '" + telefon + "', "
                + " '" + eposta + "', "
                + " '" + adres + "', "
                + " '" + parola + "', "
                + bolum_id
                + ")";
        return sorgu;
    }

    @Override
    public String getUpdate() {
        String sorgu = "update " + super.getTabloAd() + " set "
                + "tc_no='" + tc_no
                + "', ad='" + ad
                + "', soyad='" + soyad
                + "', cinsiyet='" + cinsiyet
                + "', dogum_tarihi='" + dogum_tarihi
                + "', telefon='" + telefon
                + "', eposta='" + eposta
                + "', adres='" + adres
                + "', parola='" + parola
                + "', bolum_id=" + bolum_id
                + " Where Id=" + super.getId();
        return sorgu;
    }

    @Override
    public String getSearch(String value) {
        String sorgu = "select * from " + super.getTabloAd()
                + "tc_no LIKE '%" + value + "%' or"
                + "ad" + value + "%'";
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
                + " Where tc_no='" + tc_no + "' and parola='"+ parola+"'";
        return sorgu;
    }

    public String getTc_no() {
        return tc_no;
    }

    public void setTc_no(String tc_no) {
        this.tc_no = tc_no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDogum_tarihi() {
        return dogum_tarihi;
    }

    public void setDogum_tarihi(String dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getBolum_id() {
        return bolum_id;
    }

    public void setBolum_id(int bolum_id) {
        this.bolum_id = bolum_id;
    }

}
