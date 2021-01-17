package Veritabani;

import java.sql.*;

public class Baglanti {

    Connection con = null;

    public Baglanti() {
    }

    public Connection connMYSQL() {
        try {
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hastaneotomasyonu?user=root&password");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
