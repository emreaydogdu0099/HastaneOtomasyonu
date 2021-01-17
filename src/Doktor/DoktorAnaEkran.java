package Doktor;

import Admin.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class DoktorAnaEkran extends javax.swing.JFrame {

    public DoktorAnaEkran() {
        initComponents();
    }
    
        public void goster(){
            
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hastaneotomasyonu", "root", "");
        Statement st = con.createStatement();
        String sql = "SELECT * FROM hasta_randevu";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String isimSoyisim = rs.getString("randevu_hastaisimsoyisim");
            String tcNo = rs.getString("randevu_hastatcno");
            String klinik = rs.getString("randevu_klinik");
            String doktor = rs.getString("randevu_doktor");
            String tarih = rs.getString("randevu_tarih");
            String saat = rs.getString("randevu_saat");
            
            Object [] tabloVeritabani = {isimSoyisim,tcNo,klinik,doktor,tarih,saat};
            DefaultTableModel tabloModel = (DefaultTableModel)tbl_randevu.getModel();
            
            tabloModel.addRow(tabloVeritabani);
        }
        
    }
        catch(Exception e){
            e.printStackTrace();;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_randevu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/geri icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 100, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("HAFTALIK RANDEVU TAKVİMİ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 78, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Sorgula");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 145, -1, -1));

        tbl_randevu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İsim Soyisim", "TC", "Yaş", "Cinsiyet", "İletişim No", "Adres"
            }
        ));
        jScrollPane2.setViewportView(tbl_randevu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 235, 567, 227));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arkaplanveiconlar/doktor randevu goruntule.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       goster();

    }//GEN-LAST:event_jButton2ActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorAnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_randevu;
    // End of variables declaration//GEN-END:variables
}
