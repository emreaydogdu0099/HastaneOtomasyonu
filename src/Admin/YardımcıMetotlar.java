
package Admin;

import javax.swing.JOptionPane;

public class YardımcıMetotlar {
    
    public static void MesajVer(String str){
    String mesaj;
    switch(str){
        case "bos":
        JOptionPane.showMessageDialog(null,"Lütfen tüm alanları doldurunuz.");
        break;
        
        case "yanlis":
        JOptionPane.showMessageDialog(null,"Lütfen bilgilerinizi kontrol ediniz.");
        break;
        
        case "dogru":
        JOptionPane.showMessageDialog(null,"Giriş Başarılı!");
        
        default: mesaj=str;
    } 
    }
}
