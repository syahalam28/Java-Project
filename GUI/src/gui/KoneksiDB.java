/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KoneksiDB {
    // Membuat Variabel bertipe connection
    public static java.sql.Connection con; //con adalah nama variabel

    public static Connection getkoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public java.sql.Connection getKoneksi() throws SQLException{
    //Method yang berfungsi untuk membuat koneksi ke Mysql
        
            try {
                String url = "jdbc:mysql://localhost/mahasiswa";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url,user,pass);
                
                JOptionPane.showMessageDialog(null,"Berhasil Koneksi");
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
 


