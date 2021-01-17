
package Veriler;

public class KullaniciGiris {
    private static int id;
    private String kullaniciAdi,sifre,tip;
    
    public KullaniciGiris(){}

    public KullaniciGiris(int id, String kullaniciAdi, String sifre, String tip) {
        KullaniciGiris.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.tip = tip;
    }
    
    public KullaniciGiris(int id){
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        KullaniciGiris.id = id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
