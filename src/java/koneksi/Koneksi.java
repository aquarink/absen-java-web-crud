/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Peb Dev
 */
public class Koneksi {
    
    public static PreparedStatement getPS(String sql) throws ClassNotFoundException, SQLException {
        
        PreparedStatement ps = null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/absensalary";
        String user = "root";
        String pass = "";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        ps = con.prepareStatement(sql);
        
        return ps;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        getPS("select * from absensi");
    }
}
