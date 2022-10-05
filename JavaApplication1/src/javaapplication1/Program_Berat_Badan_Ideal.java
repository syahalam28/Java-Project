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

public class Program_Berat_Badan_Ideal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int tinggi = 0;
 int BBI=0;
 int total=0;
 String gender="";
 Scanner masukan = new Scanner(System.in);
        System.out.println("Program Menghitung Berat Badan Ideal");
        System.out.println("Masukan Jenis Kelamin Anda " + "( PRIA )" + " || " + "( WANITA )");
        gender = masukan.nextLine();
        if ((gender.equals("PRIA") || (gender.equals("pria")) )) { //Jika Menggunakan String Gunakan Equals
        
        System.out.println("Masukan Tinggi Anda !");
            tinggi=masukan.nextInt();
            BBI = (tinggi - 100)-((tinggi - 100) * 10 / 100); 
              System.out.println("Nilai BBI Kamu  " + BBI);
        } else {
             System.out.println("Masukan Tinggi Anda !");
            tinggi=masukan.nextInt();
            BBI = (tinggi - 100)-((tinggi - 100) * 15 / 100); 
              System.out.println("Nilai BBI Kamu  " + BBI);
            
        }
        System.out.println("Jika Berat Badan Mu Lebih Besar Dari Nilai BBI nya");
        System.out.println("Maka Berat Badan Mu Tidak Ideal");
      
 
   
    }
      
        
    }
    


