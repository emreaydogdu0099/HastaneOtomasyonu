
package Veriler;

public class HizmetliEkle extends KullaniciEkle{
    private String gorev;

    public HizmetliEkle(int id, String isimSoyisim, String tcNo, String yas, String cinsiyet, String gorev, String iletisimNo, String adres) {
        super(id, isimSoyisim, tcNo, yas, cinsiyet, iletisimNo, adres);
        this.gorev = gorev;
    }
    public HizmetliEkle(){}
    
}
