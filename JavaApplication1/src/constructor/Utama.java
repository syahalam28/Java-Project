/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import java.io.*;
public class Utama {

    public static void main(String[] args) throws Exception  { // Main class
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in)); // Melakukan Inputan
        //Instance of class (objek)
        Login user1 = new Login();
        Login user2 = new Login ("","");
        
        //Menu
        while (true) {            
            System.out.println("=============");
            System.out.println("MENU LOGIN");
            System.out.println("=============");
            System.out.println("1.Login admin");
            System.out.println("2.Ubah Password admin");
            System.out.println("3.Buat user");
            System.out.println("4.Lihat Data User");
            System.out.println("5.Keluar");
            System.out.println("=============");
            
            //Inputan
            System.out.println("Masukan Pilihan");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println();
            //Proses + output
            switch(pilih){
            case 1:
                System.out.print("Masukan Username :");
                String my_user = br.readLine();
                System.out.print("Masukan Password :");
                String my_password = br.readLine();
                
                
               // Pengecekan User dan password apakah sesuai
                if (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword())) {
                    System.out.println("***LOGIN SUKSES***");
                   
                } 
                
                else {
                    System.out.println("***LOGIN GAGAL***");
                }
                break;
                
            case 2:
                System.out.println("Masukan Password Lama ");
                String old_password = br.readLine();
                System.out.println("Masukan Password baru");
                String new_password = br.readLine();
                // Membuat password baru
                if (old_password.equals(user1.getPassword())) {
                    user1.setPassword(new_password);
                    System.out.println("Password Berhasil Dibuat");
                    
                } else {
                    System.out.println("Anda Salah Memasukan Password Lama");
                }
                break;
            case 3:
                System.out.println("Masukan Username = ");
                String create_user = br.readLine();
                System.out.println("Masukan Password");
                String create_password = br.readLine();
                //Membuat username dan password baru
                user2 = new Login(create_user,create_password);
                System.out.println("");
                System.out.println("***USER BERHASIL DIBUAT***");
                break;
            case 4:
                // Menampilkan data dari user 1 dan user 2
                System.out.println("User1");
                System.out.println("Username : " +user1.getUsername());
                System.out.println("Password : " +user1.getPassword());
                System.out.println("");
                System.out.println("User2");
                System.out.println("username : " +user2.getUsername());
                System.out.println("password : " +user2.getPassword());
                break;
            default:
                System.exit(0);
            
            }
        }
        
    }
    
}
