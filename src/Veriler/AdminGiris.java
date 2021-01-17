
package Veriler;

public class AdminGiris extends KullaniciGiris{

    public AdminGiris(int id) {
        id++;
    }

    public AdminGiris(int id, String kullaniciAdi, String sifre, String tip) {
        super(id, kullaniciAdi, sifre, tip);
    }
    
}
