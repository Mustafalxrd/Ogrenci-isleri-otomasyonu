package Model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Model_Puan extends Model_Main{
	
	private int ogrenci_id;
	private int ders_id;
	private String tur;
	private int puan;
	private String tarih;

        public Model_Puan(int Id) {
            super(Id);
        }
	
        
	public Model_Puan() {
		super.setTabloAd("puan");
	}
	
	public Model_Puan(int Id, int ogrenci_id, int ders_id, String tur, int puan, String tarih) {
		super(Id);
		this.ogrenci_id = ogrenci_id;
		this.ders_id = ders_id;
		this.tur = tur;
		this.puan = puan;
		this.tarih = tarih;
	}

	public Model_Puan(int ogrenci_id, int ders_id, String tur, int puan, String tarih) {
		this.ogrenci_id = ogrenci_id;
		this.ders_id = ders_id;
		this.tur = tur;
		this.puan = puan;
		this.tarih = tarih;
	}
	
	public Model_Puan(ResultSet resultSet) {
        try {
            super.setId(resultSet.getInt("Id"));
            ogrenci_id = resultSet.getInt("ogrenci_id");
            ders_id = resultSet.getInt("ders_id");
            tur = resultSet.getString("tur");
            puan = resultSet.getInt("puan");
            tarih = resultSet.getString("tarih");
        } catch (SQLException ex) {
            Logger.getLogger(Model_Ders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        @Override
          public String[] getKolonlar() {
              return new String[]{"Id", "Öğrenci", "Ders","Tür", "Puan","Tarih"};
          }

          @Override
          public Object[] getObject() {
              return new Object[]{super.getId(), ogrenci_id, ders_id, tur,puan,tarih};
          }

          @Override
          public String getInsert() {
              String sorgu = "insert into " + super.getTabloAd()
                      + " (ogrenci_id, ders_id, tur, puan, tarih) values("
                      + ogrenci_id+","
                      + ders_id+","
                      + "'"+tur+"',"
                      + puan+","
                      +"'"+tarih+"'"
                      + ")";
              return sorgu;
          }

          @Override
          public String getUpdate() {
              String sorgu = "update " + super.getTabloAd() + " set "
                      + "ogrenci_id=" + ogrenci_id + ", "
                      + "ders_id=" + ders_id + ","
                      + "tur='" + tur + "'"
                      + "puan=" + puan + ""
                      + "tarih='" + tarih + "'"
                      + " Where Id=" + super.getId();
              return sorgu;
          }

          @Override
          public String getSearch(String value) {
              String sorgu = "select * from " + super.getTabloAd()
                      + "tur LIKE '" + tur + "%'";
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
                      + " Where Id='" + super.getId() + "'";
              return sorgu;
          }

	public int getOgrenci_id() {
		return ogrenci_id;
	}

	public void setOgrenci_id(int ogrenci_id) {
		this.ogrenci_id = ogrenci_id;
	}

	public int getDers_id() {
		return ders_id;
	}

	public void setDers_id(int ders_id) {
		this.ders_id = ders_id;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	
	
}
