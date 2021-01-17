
package Veriler;

public class DoktorEkle extends KullaniciEkle{
    private String bolum;
    private final int doktorSayisi=20;
    
    public DoktorEkle(int id, String isimSoyisim, String tcNo, String yas, String cinsiyet, String bolum, String iletisimNo, String adres) {
        super(id, isimSoyisim, tcNo, yas, cinsiyet, iletisimNo, adres);
        this.bolum = bolum;
    }
   

    public DoktorEkle(){
        
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
}
