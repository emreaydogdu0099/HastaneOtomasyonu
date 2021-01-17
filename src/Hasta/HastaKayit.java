package Hasta;

import Admin.YardımcıMetotlar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class HastaKayit extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;

    public HastaKayit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hasta_isimSoyisim = new javax.swing.JTextField();
        hasta_tcNo = new javax.swing.JTextField();
        hasta_iletisimNo = new javax.swing.JTextField();
        hasta_sifre = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("İsim Soyisim");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 44, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("TC Kimlik Numarası");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 126, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("İletişim Numarası");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 209, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Şifre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 299, -1, -1));

        hasta_isimSoyisim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hasta_isimSoyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 41, 255, -1));

        hasta_tcNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hasta_tcNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 120, 255, -1));

        hasta_iletisimNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hasta_iletisimNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 206, 255, -1));

        hasta_sifre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hasta_sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 293, 255, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/kayıt ol icon.png"))); // NOI18N
        jButton1.setText("Kayıt Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 387, 150, 63));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/geri icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 507, 100, 48));

        jLabel5.setForeground(new java.awt.Color(255, 51, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/hasta kayit ekrani.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setVisible(false);
        new HastaGirisEkrani().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String isimSoyisim = hasta_isimSoyisim.getText();
        String tcNo = hasta_tcNo.getText();
        String iletisimNo = hasta_iletisimNo.getText();
        String sifre = hasta_sifre.getText();
        
        if(isimSoyisim.length()==0 || tcNo.length()==0 || iletisimNo.length()==0 || sifre.length()==0)
            YardımcıMetotlar.MesajVer("bos");
        else{
        try {
            String sorgu = "INSERT INTO `hasta_kayit`(`hasta_isimsoyisim`, `hasta_tcno`, `hasta_telno`, `hasta_sifre`) VALUES (?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/hastaneotomasyonu", "root", "");
            pst = con.prepareStatement(sorgu);
            pst.setString(1, hasta_isimSoyisim.getText());
            pst.setString(2, hasta_tcNo.getText());
            pst.setString(3, hasta_iletisimNo.getText());
            pst.setString(4, hasta_sifre.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt işlemi başarıyla gerçekleşti.");
            setVisible(false);
            new HastaGirisEkrani().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hasta_iletisimNo;
    private javax.swing.JTextField hasta_isimSoyisim;
    private javax.swing.JPasswordField hasta_sifre;
    private javax.swing.JTextField hasta_tcNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
