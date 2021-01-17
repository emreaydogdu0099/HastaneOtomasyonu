
package Veriler;

public class KullaniciEkle {
    private static int id;
    private String isimSoyisim,tcNo,yas,cinsiyet,iletisimNo,adres;

    public KullaniciEkle(int id, String isimSoyisim, String tcNo, String yas, String cinsiyet, String iletisimNo, String adres) {
        KullaniciEkle.id = id;
        this.isimSoyisim = isimSoyisim;
        this.tcNo = tcNo;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.iletisimNo = iletisimNo;
        this.adres = adres;
    }
    public KullaniciEkle(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        KullaniciEkle.id = id;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getIletisimNo() {
        return iletisimNo;
    }

    public void setIletisimNo(String iletisimNo) {
        this.iletisimNo = iletisimNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
}
