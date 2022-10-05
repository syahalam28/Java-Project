/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sikadu;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class connSikadu {
  //Membuat variabel connection
    public static Connection con; //con adalah nama variabel
    Statement stm;

    public static Connection getKoneksi() throws SQLException{
    //Method yang berfungsi untuk membuat koneksi ke Mysql
        try {
            String url = "jdbc:mysql://localhost/sikadu";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url,user,pass);
//            stm = con.createStatement();
//            JOptionPane.showMessageDialog(null, "Connected");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Disconnected");
        }
    return con;
    }
    public static void main(String[] args) throws SQLException{
        connSikadu CS = new connSikadu();
        CS.getKoneksi();
    }
 
    
}
