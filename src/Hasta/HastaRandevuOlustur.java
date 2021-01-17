package Hasta;

import Admin.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class HastaRandevuOlustur extends javax.swing.JFrame {

    public HastaRandevuOlustur() {
        initComponents();
        combobox();
    }
    
    public void randevuOlustur(){
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sorgu = "INSERT INTO `hasta_randevu`(`randevu_hastaisimsoyisim`, `randevu_hastatcno`, `randevu_klinik`, `randevu_doktor`, `randevu_tarih`, `randevu_saat`) VALUES (?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/hastaneotomasyonu", "root", "");
            pst = con.prepareStatement(sorgu);
            pst.setString(1, hasta_isimSoyisim.getText());
            pst.setString(2, hasta_tc.getText());
            pst.setString(3, (String) hasta_klinik.getSelectedItem());
            pst.setString(4, (String) hasta_doktor.getSelectedItem());
            pst.setString(5, (String) hasta_randevuTarih.getSelectedItem());
            pst.setString(6, (String) hasta_randevuSaat.getSelectedItem());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Randevunuz Oluşturulmuştur.");
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       }  
        public void temizle(){
        hasta_isimSoyisim.setText("");
        hasta_tc.setText("");
        hasta_klinik.setSelectedItem("Seçiniz");
        hasta_doktor.setSelectedItem("Seçiniz");
        hasta_randevuTarih.setSelectedItem("Seçiniz");
        hasta_randevuSaat.setSelectedItem("Seçiniz");
        
        
        }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hasta_klinik = new javax.swing.JComboBox<>();
        hasta_doktor = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        hasta_randevuTarih = new javax.swing.JComboBox<>();
        hasta_randevuSaat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        hasta_isimSoyisim = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hasta_tc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/geri icon.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 505, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Klinik");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Doktor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Randevu Tarihi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Randevu Saati");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        hasta_klinik.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hasta_klinik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Genel Cerrahi", "Nöroloji", "Dahiliye", "Cildiye", "Göz", "Diş", "Üroloji" }));
        hasta_klinik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_klinikActionPerformed(evt);
            }
        });
        getContentPane().add(hasta_klinik, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 210, -1));

        hasta_doktor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hasta_doktor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz" }));
        hasta_doktor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_doktorActionPerformed(evt);
            }
        });
        getContentPane().add(hasta_doktor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 210, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/onayla icon.png"))); // NOI18N
        jButton2.setText("Onayla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 140, 50));

        hasta_randevuTarih.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hasta_randevuTarih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma" }));
        getContentPane().add(hasta_randevuTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 210, 28));

        hasta_randevuSaat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hasta_randevuSaat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "09.00", "10.00", "11.00", "12.00", "14.00", "15.00", "16.00" }));
        getContentPane().add(hasta_randevuSaat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 210, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("İsim Soyisim");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));
        getContentPane().add(hasta_isimSoyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 210, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("TC Kimlik Numarası");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        getContentPane().add(hasta_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 210, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/hasta randevu ekrani.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hasta_klinikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_klinikActionPerformed


    }//GEN-LAST:event_hasta_klinikActionPerformed

    private void hasta_doktorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_doktorActionPerformed

    }//GEN-LAST:event_hasta_doktorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        randevuOlustur();
        temizle();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    private void combobox() {

        PreparedStatement pst = null;
  
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hastaneotomasyonu", "root", "");
            String sql = "select *from doktor_ekle";

            pst = con.prepareStatement(sql);

            
            
            rs = pst.executeQuery();
            while (rs.next()) {
                String isim = rs.getString("doktor_isimsoyisim");
                hasta_doktor.addItem(isim);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaRandevuOlustur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> hasta_doktor;
    private javax.swing.JTextField hasta_isimSoyisim;
    private javax.swing.JComboBox<String> hasta_klinik;
    private javax.swing.JComboBox<String> hasta_randevuSaat;
    private javax.swing.JComboBox<String> hasta_randevuTarih;
    private javax.swing.JTextField hasta_tc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
