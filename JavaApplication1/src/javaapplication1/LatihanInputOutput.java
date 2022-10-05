
package javaapplication1;
/*
Class Scanner;
Class BufferReader;
dan Class Console
*/
import java.util.Scanner;

public class LatihanInputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int usia,gaji;
        String nama,alamat;
        
        // Membuat scanner baru 
        Scanner masukan = new Scanner(System.in); // membuat deklarasi inputan (masukan) itu adalah variabel bebas
        
        System.out.println("Pendaftaran Karyawan PT.Syahalam");
        System.out.println("Masukan Nama Anda");
     
        // Menggunakan scanner dan menyimpan apa yang di ketik di variabel masukan
        nama = masukan. nextLine();
        
        // Menampilkan output lagi
        System.out.println("Masukan Alamat Anda");
        
        alamat = masukan. nextLine();
        
        // Menampilkan apa yang sudah di simpan di variabel
         System.out.println("Nama Karyawan " +nama); // mengambil variabel harus menggunakan (+)
         System.out.println("Alamat " +alamat);
        
        
        
    
    }
    
    
    
}
