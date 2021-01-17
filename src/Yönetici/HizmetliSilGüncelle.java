package Yönetici;

import Veritabani.Baglanti;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class HizmetliSilGüncelle extends javax.swing.JFrame {

    public HizmetliSilGüncelle() {
        initComponents();
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    public void sil() {
        String hizmetli_isim = txt_isim.getText();
        String hizmetli_tcNo = txt_tc.getText();
        String hizmetli_yas = txt_yas.getText();
        String hizmetli_cinsiyet = (String) cmb_cinsiyet.getSelectedItem();
        String hizmetli_gorev = (String) cmb_gorev.getSelectedItem();
        String hizmetli_iletisimNo = txt_iletisim.getText();
        String hizmetli_adres = txt_adres.getText();

        if (hizmetli_isim.length() == 0 || hizmetli_tcNo.length() == 0 || hizmetli_yas.length() == 0 || hizmetli_cinsiyet.equals("Seçiniz") || hizmetli_gorev.equals("Seçiniz") || hizmetli_iletisimNo.length() == 0 || hizmetli_adres.length() == 0) {
            JOptionPane.showMessageDialog(null, "Tüm alanların dolu olması gerekmektedir");
        } else {
            try {
                String kayitSil = "Delete from hizmetli_ekle where hizmetli_tcno=" + jTextField1.getText();
                Statement st = con.createStatement();
                st.execute(kayitSil);
                JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Silindi");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void guncelle() {
        String hizmetli_isim = txt_isim.getText();
        String hizmetli_tcNo = txt_tc.getText();
        String hizmetli_yas = txt_yas.getText();
        String hizmetli_cinsiyet = (String) cmb_cinsiyet.getSelectedItem();
        String hizmetli_gorev = (String) cmb_gorev.getSelectedItem();
        String hizmetli_iletisimNo = txt_iletisim.getText();
        String hizmetli_adres = txt_adres.getText();
        if (hizmetli_isim.length() == 0 || hizmetli_tcNo.length() == 0 || hizmetli_yas.length() == 0 || hizmetli_cinsiyet.equals("Seçiniz") || hizmetli_gorev.equals("Seçiniz") || hizmetli_iletisimNo.length() == 0 || hizmetli_adres.length() == 0) {
            JOptionPane.showMessageDialog(null, "Tüm alanların dolu olması gerekmektedir");
        } else {
            try {
                con = new Baglanti().connMYSQL();
                st = con.createStatement();
                st.executeUpdate("update hizmetli_ekle set hizmetli_isimsoyisim='" + hizmetli_isim + "',hizmetli_tcno='" + hizmetli_tcNo + "',hizmetli_yas='" + hizmetli_yas + "',hizmetli_cinsiyet='" + hizmetli_cinsiyet + "',hizmetli_gorev='" + hizmetli_gorev + "',hizmetli_iletisimno='" + hizmetli_iletisimNo + "',hizmetli_adres='" + hizmetli_adres + "'");
                JOptionPane.showMessageDialog(null, "Güncelleme işlemi başarılı!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void temizle() {
        jTextField1.setText("");
        txt_isim.setText("");
        txt_yas.setText("");
        txt_tc.setText("");
        txt_iletisim.setText("");
        txt_adres.setText("");
        cmb_cinsiyet.setSelectedItem("Seçiniz");
        cmb_gorev.setSelectedItem("Seçiniz");
    }

    public void ara() {
        String hizmetliTC = jTextField1.getText();
        if (jTextField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Lütfen aramak istediğiniz hizmetlinin TC Kimlik numarasını giriniz");
        } else {
            try {
                con = new Baglanti().connMYSQL();
                st = con.createStatement();
                rs = st.executeQuery("select * from hizmetli_ekle where hizmetli_tcno='" + hizmetliTC + "'");
                if (rs.next()) {
                    txt_isim.setText(rs.getString(2));
                    txt_tc.setText(rs.getString(3));
                    txt_yas.setText(rs.getString(4));
                    cmb_cinsiyet.setSelectedItem(rs.getString(5));
                    cmb_gorev.setSelectedItem(rs.getString(6));
                    txt_iletisim.setText(rs.getString(7));
                    txt_adres.setText(rs.getString(8));
                } else {
                    JOptionPane.showMessageDialog(null, "Hizmetli Bulunamadı");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txt_iletisim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_adres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_isim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_tc = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txt_yas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cmb_cinsiyet = new javax.swing.JComboBox<>();
        cmb_gorev = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("TC Kimlik Numarası");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txt_iletisim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_iletisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 131, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Yaş");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txt_adres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 131, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Cinsiyet");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/güncelle icon.png"))); // NOI18N
        jButton2.setText("Güncelle");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Görev");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/sil icon.png"))); // NOI18N
        jButton3.setText("Sil");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("İletişim Numarası");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Adres");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        txt_isim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 131, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("TC Kimlik Numarası");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        txt_tc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 131, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 126, -1));

        txt_yas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 131, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/ara icon.png"))); // NOI18N
        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 100, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("İsim Soyisim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/geri icon.png"))); // NOI18N
        jButton4.setText("Geri");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 503, 110, 50));

        cmb_cinsiyet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmb_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Erkek", "Kadın" }));
        getContentPane().add(cmb_cinsiyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, -1));

        cmb_gorev.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmb_gorev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Sekreter", "Yemekhane", "Ameliyathane", "Temizlik", "Muhasebe" }));
        getContentPane().add(cmb_gorev, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 130, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/sil veya güncelle ekrani.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        guncelle();
        temizle();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sil();
        temizle();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ara();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        setVisible(false);
        new HizmetliSecim().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HizmetliSilGüncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_cinsiyet;
    private javax.swing.JComboBox<String> cmb_gorev;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_adres;
    private javax.swing.JTextField txt_iletisim;
    private javax.swing.JTextField txt_isim;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_yas;
    // End of variables declaration//GEN-END:variables
}
