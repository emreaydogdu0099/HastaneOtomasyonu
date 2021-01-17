package Yönetici;

import java.sql.Connection;
import javax.swing.JOptionPane;
import Veritabani.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DoktorSilGüncelle extends javax.swing.JFrame {

    public DoktorSilGüncelle() {
        initComponents();
    }
    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public void sil() {
        try {
            String kayitSil = "Delete from doktor_ekle where doktor_tcno=" + jTextField1.getText();
            Statement st = con.createStatement();
            st.execute(kayitSil);
            JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Silindi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void guncelle() {
        try {
            String doktor_isim = txt_isim.getText();
            String doktor_tcNo = txt_tc.getText();
            String doktor_yas = txt_yas.getText();
            String doktor_cinsiyet = (String) cmb_cinsiyet.getSelectedItem();
            String doktor_bolum = (String) cmb_bolum.getSelectedItem();
            String doktor_iletisimNo = txt_iletisim.getText();
            String doktor_adres = txt_adres.getText();

            String sql = "update doktor_ekle set doktor_isimsoyisim='" + doktor_isim + "',doktor_tcno='" + doktor_tcNo + "',doktor_yas='" + doktor_yas + "',doktor_cinsiyet='" + doktor_cinsiyet + "',doktor_bolum='" + doktor_bolum + "',doktor_iletisimno='" + doktor_iletisimNo + "',doktor_adres='" + doktor_adres + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Güncelleme işlemi başarılı!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void temizle() {
        jTextField1.setText("");
        txt_isim.setText("");
        txt_tc.setText("");
        txt_yas.setText("");
        cmb_cinsiyet.setSelectedItem("Seçiniz");
        cmb_bolum.setSelectedItem("Seçiniz");
        txt_iletisim.setText("");
        txt_adres.setText("");
    }

    public void ara() {
        String doktorTC = jTextField1.getText();

        if (jTextField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Lütfen aramak istediğiniz doktorun TC Kimlik numarasını giriniz");
        } else {
            try {
                con = new Baglanti().connMYSQL();
                st = con.createStatement();
                rs = st.executeQuery("select * from doktor_ekle where doktor_tcno='" + doktorTC + "'");
                if (rs.next()) {
                    txt_isim.setText(rs.getString(2));
                    txt_tc.setText(rs.getString(3));
                    txt_yas.setText(rs.getString(4));
                    cmb_cinsiyet.setSelectedItem(rs.getString(5));
                    cmb_bolum.setSelectedItem(rs.getString(6));
                    txt_iletisim.setText(rs.getString(7));
                    txt_adres.setText(rs.getString(8));
                } else {
                    JOptionPane.showMessageDialog(null, "Doktor Bulunamadı");
                    temizle();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_isim = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        txt_yas = new javax.swing.JTextField();
        txt_iletisim = new javax.swing.JTextField();
        txt_adres = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cmb_cinsiyet = new javax.swing.JComboBox<>();
        cmb_bolum = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("TC Kimlik Numarası");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 42, -1, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 39, 126, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 88, 35));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("İsim Soyisim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 216, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("TC Kimlik Numarası");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 265, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Yaş");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 318, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Cinsiyet");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 372, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Bölüm");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 426, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("İletişim Numarası");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Adres");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        txt_isim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 213, 131, -1));

        txt_tc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 262, 131, -1));

        txt_yas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 315, 131, -1));

        txt_iletisim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_iletisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 131, -1));

        txt_adres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txt_adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 131, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/güncelle icon.png"))); // NOI18N
        jButton2.setText("Güncelle");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 410, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/sil icon.png"))); // NOI18N
        jButton3.setText("Sil");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 410, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/geri icon.png"))); // NOI18N
        jButton4.setText("Geri");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 520, 112, 50));

        cmb_cinsiyet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmb_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Erkek", "Kadın" }));
        cmb_cinsiyet.setPreferredSize(new java.awt.Dimension(6, 23));
        getContentPane().add(cmb_cinsiyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 130, -1));

        cmb_bolum.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmb_bolum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Genel Cerrahi", "Göğüs Cerrahisi", "Göz Hastalıkları", "Kadın Hastalıkları", "KBB", "İç Hastalıkları", "Nöroloji" }));
        cmb_bolum.setPreferredSize(new java.awt.Dimension(6, 23));
        getContentPane().add(cmb_bolum, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 130, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/sil veya güncelle ekrani.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ara();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        guncelle();
        temizle();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sil();
        temizle();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        setVisible(false);
        new DoktorSecim().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorSilGüncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_bolum;
    private javax.swing.JComboBox<String> cmb_cinsiyet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
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
