/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author user
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//Create
public class KoneksiDB {
     // Membuat Variabel bertipe connection
    private static Connection con; //con adalah nama variabel

    public static Connection getKoneksi() throws SQLException{
    //Method yang berfungsi untuk membuat koneksi ke Mysql
        
            try {
                String url = "jdbc:mysql://localhost/pbo";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url,user,pass);
                
//                JOptionPane.showMessageDialog(null,"Berhasil Koneksi");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Gagal Koneksi");
            }
      return con;
      
      
    }
    
    public static void main(String[] args) throws SQLException {
        KoneksiDB KD = new KoneksiDB();
        KD.getKoneksi();
        
    }
}
