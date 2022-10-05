/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */

import java.util.Scanner;
public class Program_Kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      int pilihan;
      int i,j;
      int total = 0;
      int pesanan;
      int harga;
      int jumlah = 0;
      int qty = 0;
      int a;
      int tot = 0;
      
      
   
        System.out.println("UTY'S COFFEE");
        System.out.println("Daftar Menu");
        System.out.println("1. Late Coffee");
        System.out.println("2. Apache Coffee");
        System.out.println("3. Code Coffee");
        System.out.println("4. Basic Coffee");
        System.out.println("5. Original Coffee");
        
        System.out.println("Apakah Anda Seorang Member ");
        
        System.out.println("1.Member " + "2.Non Member");
        
       //Membuat Scanner 
       Scanner inputan = new Scanner(System.in);
        pilihan = inputan.nextInt();
       
         if (pilihan == 1){
             System.out.println("Selamat Anda Mendapatkan Diskon 15%");
             System.out.println("Pilih Pesanan Anda : ");
            
       String[] kopi = new String[5];
       int x;

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for(  i = 1; i < kopi.length; i++ ){
            System.out.print("Menu ke-" + i + ": ");
            kopi[i] = scan.nextLine();
   
        
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
             System.out.println("Jumlah Pesanan");
             pesanan = inputan.nextInt();
            
             for ( j = 1; j <= pesanan ; j++) {
                 System.out.println("Harga Pesanan Ke -" + j + ":" );
                 
                 harga = inputan.nextInt();
                 System.out.println("Jumlah Pesanan ");
                 qty = inputan.nextInt();
                 a = harga * qty;
                 total = a + total;
                 jumlah = total * 15 / 100;
                 total = total - jumlah;
                 
             }
                 for( String b : kopi ){
            System.out.println("Pesanan Anda Adalah : " +b);
                     
        }
             System.out.println("Jumlah Pesanan : " +pesanan);
             System.out.println("Rp" +total);
             System.out.println("Yang Harus Dibayarkan Rp." +total);
         


        
  
        
        
       
    }
         else {
             System.out.println("Selamat Anda Mendapatkan Diskon 5%");
             System.out.println("Pilih Pesanan Anda : ");
            
       String[] kopi = new String[5];
       int x;

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for(  i = 1; i < kopi.length; i++ ){
            System.out.print("Menu ke-" + i + ": ");
            kopi[i] = scan.nextLine();
   
        
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
             System.out.println("Jumlah Pesanan");
             pesanan = inputan.nextInt();
            
             for ( j = 1; j <= pesanan ; j++) {
                 System.out.println("Harga Pesanan Ke -" + j + ":" );
                 
                 harga = inputan.nextInt();
                 System.out.println("Jumlah Pesanan ");
                 qty = inputan.nextInt();
                 a = harga * qty;
                 total = a + total;
                 jumlah = total * 5 / 100;
                 total = total - jumlah;
                 
             }
                 for( String b : kopi ){
            System.out.println("Pesanan Anda Adalah : " +b);
                     
        }
             System.out.println("Jumlah Pesanan : " +pesanan);
             System.out.println("Rp" +total);
             System.out.println("Yang Harus Dibayarkan Rp." +total);  
             
         }
    
} 
}
