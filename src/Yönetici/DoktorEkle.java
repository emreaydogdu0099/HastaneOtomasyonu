package Yönetici;

import Admin.YardımcıMetotlar;
import java.sql.*;
import javax.swing.JOptionPane;

public class DoktorEkle extends javax.swing.JFrame {

    public DoktorEkle() {
        initComponents();
    }
    Connection con = null;
    PreparedStatement pst = null;

    public void ekle() {
        String isimSoyisim = doktor_isimSoyisim.getText();
        String tcNo = doktor_tc.getText();
        String yas = doktor_yas.getText();
        String cinsiyet = (String) doktor_cinsiyet.getSelectedItem();
        String bolum = (String) doktor_bolum.getSelectedItem();
        String iletisimNo = doktor_iletisimNo.getText();
        String adres = doktor_adres.getText();

        if (isimSoyisim.length() == 0 || tcNo.length() == 0 || yas.length() == 0 || cinsiyet.equals("Seçiniz") || bolum.equals("Seçiniz") || iletisimNo.length() == 0 || adres.length() == 0) {
            YardımcıMetotlar.MesajVer("bos");
        } else {
            try {
                String sorgu = "INSERT INTO `doktor_ekle`(`doktor_isimsoyisim`, `doktor_tcno`, `doktor_yas`, `doktor_cinsiyet`, `doktor_bolum`, `doktor_iletisimno`, `doktor_adres`) VALUES (?,?,?,?,?,?,?)";
                con = DriverManager.getConnection("jdbc:mysql://localhost/hastaneotomasyonu", "root", "");
                pst = con.prepareStatement(sorgu);
                pst.setString(1, isimSoyisim);
                pst.setString(2, tcNo);
                pst.setString(3, yas);
                pst.setString(4, cinsiyet);
                pst.setString(5, bolum);
                pst.setString(6, iletisimNo);
                pst.setString(7, adres);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Doktor Eklendi.");
                setVisible(false);
                new DoktorEkle().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        doktor_isimSoyisim = new javax.swing.JTextField();
        doktor_tc = new javax.swing.JTextField();
        doktor_yas = new javax.swing.JTextField();
        doktor_cinsiyet = new javax.swing.JComboBox<>();
        doktor_bolum = new javax.swing.JComboBox<>();
        doktor_iletisimNo = new javax.swing.JTextField();
        doktor_adres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("İsim Soyisim");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 55, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("TC Kimlik Numarası");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 147, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Yaş");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 247, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Cinsiyet");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 343, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Bölüm");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 426, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("İletişim Numarası");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 55, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Adres");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 147, -1, -1));

        doktor_isimSoyisim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(doktor_isimSoyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 52, 200, -1));

        doktor_tc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(doktor_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 144, 200, -1));

        doktor_yas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(doktor_yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 244, 200, -1));

        doktor_cinsiyet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doktor_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Erkek", "Kadın" }));
        getContentPane().add(doktor_cinsiyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 340, 200, -1));

        doktor_bolum.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doktor_bolum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Genel Cerrahi", "Nöroloji", "Dahiliye", "Cildiye", "Göz", "Diş", "Üroloji" }));
        getContentPane().add(doktor_bolum, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 423, 200, -1));

        doktor_iletisimNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(doktor_iletisimNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 52, 200, -1));

        doktor_adres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(doktor_adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 144, 200, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/ekle icon.png"))); // NOI18N
        jButton1.setText("Ekle");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 151, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/geri icon.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 505, 100, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/doktor ana ekran.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        setVisible(false);
        new DoktorSecim().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ekle();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField doktor_adres;
    private javax.swing.JComboBox<String> doktor_bolum;
    private javax.swing.JComboBox<String> doktor_cinsiyet;
    private javax.swing.JTextField doktor_iletisimNo;
    private javax.swing.JTextField doktor_isimSoyisim;
    private javax.swing.JTextField doktor_tc;
    private javax.swing.JTextField doktor_yas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
