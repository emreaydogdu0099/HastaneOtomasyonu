package Yönetici;

import Admin.YardımcıMetotlar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class HizmetliEkle extends javax.swing.JFrame {

    public HizmetliEkle() {
        initComponents();
    }
    Connection con = null;
    PreparedStatement pst = null;
    
    public void ekle(){
        String isimSoyisim = hizmetli_isimSoyisim.getText();
        String tcNo = hizmetli_tcNo.getText();
        String yas = hizmetli_yas.getText();
        String cinsiyet = (String) hizmetli_cinsiyet.getSelectedItem();
        String gorev = (String) hizmetli_gorev.getSelectedItem();
        String iletisimNo = hizmetli_iletisimNo.getText();
        String adres = hizmetli_adres.getText();
        
        if(isimSoyisim.length()==0 || tcNo.length()==0 || yas.length()==0 || cinsiyet.equals("Seçiniz") || gorev.equals("Seçiniz") || iletisimNo.length()==0 || adres.length()==0)
            YardımcıMetotlar.MesajVer("bos");
        else{
        try {
            String sorgu = "INSERT INTO `hizmetli_ekle`(`hizmetli_isimsoyisim`, `hizmetli_tcno`, `hizmetli_yas`, `hizmetli_cinsiyet`, `hizmetli_gorev`, `hizmetli_iletisimno`, `hizmetli_adres`) VALUES (?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/hastaneotomasyonu", "root", "");
            pst = con.prepareStatement(sorgu);
            pst.setString(1, isimSoyisim);
            pst.setString(2, tcNo);
            pst.setString(3, yas);
            pst.setString(4, cinsiyet);
            pst.setString(5, gorev);
            pst.setString(6, iletisimNo);
            pst.setString(7, adres);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hizmetli Eklendi.");
            setVisible(false);
            new HizmetliEkle().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hizmetli_cinsiyet = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hizmetli_gorev = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        hizmetli_iletisimNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hizmetli_adres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        hizmetli_isimSoyisim = new javax.swing.JTextField();
        hizmetli_tcNo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        hizmetli_yas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hizmetli_cinsiyet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hizmetli_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Erkek", "Kadın" }));
        getContentPane().add(hizmetli_cinsiyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 340, 200, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("TC Kimlik Numarası");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 147, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 102));
        jLabel3.setText("Yaş");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 247, -1, -1));

        hizmetli_gorev.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hizmetli_gorev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Sekreter", "Yemekhane", "Ameliyathane", "Temizlik", "Muhasebe" }));
        getContentPane().add(hizmetli_gorev, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 423, 200, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 102));
        jLabel4.setText("Cinsiyet");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 343, -1, -1));

        hizmetli_iletisimNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hizmetli_iletisimNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 52, 200, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 102));
        jLabel5.setText("Görevi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 426, -1, -1));

        hizmetli_adres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hizmetli_adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 144, 200, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 102));
        jLabel6.setText("İletişim Numarası");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 55, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/ekle icon.png"))); // NOI18N
        jButton1.setText("Ekle");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 151, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 51));
        jLabel7.setText("Adres");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 147, -1, -1));

        hizmetli_isimSoyisim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hizmetli_isimSoyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 52, 200, -1));

        hizmetli_tcNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hizmetli_tcNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 144, 200, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/geri icon.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 505, 100, -1));

        hizmetli_yas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(hizmetli_yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 244, 200, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("İsim Soyisim");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 55, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/hizmetli ekrani.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        setVisible(false);
        new HizmetliSecim().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ekle();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HizmetliEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hizmetli_adres;
    private javax.swing.JComboBox<String> hizmetli_cinsiyet;
    private javax.swing.JComboBox<String> hizmetli_gorev;
    private javax.swing.JTextField hizmetli_iletisimNo;
    private javax.swing.JTextField hizmetli_isimSoyisim;
    private javax.swing.JTextField hizmetli_tcNo;
    private javax.swing.JTextField hizmetli_yas;
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
