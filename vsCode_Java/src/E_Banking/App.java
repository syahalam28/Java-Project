package E_Banking;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
    // Instance Of Class
    services layanan = new services(8000000);
    System.out.println("Silahkan Pilih Layanan Dibawah Ini");
    System.out.println("1. Cek Saldo");
    layanan.cekSaldo();
    Scanner input = new Scanner(System.in);
    System.out.println("2. Tarik Tunai");
    double penarikan = input.nextDouble();
    layanan.tarikTunai(penarikan);

   }
}
