/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E_Banking;

import java.util.Scanner;

/**
 *
 * @author Digital
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instance Of Class
        Services service = new Services(8000000);
        Services service2 = new Services(0);
        // Input
        Scanner masukan = new Scanner(System.in);
        System.out.println("CIMB NIAGA");

        while (true) {
            System.out.println("Silahkan Pilih Layanan Di Bawah Ini");
            System.out.println("1. Informasi Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");

            int i = masukan.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Saldo Anda Adalah :");
                    service.ceksaldo();
                    service2.ceksaldo();
                    break;
                case 2:
                    System.out.println("Silahkan Masukan Pin Anda ");
                    int pin = masukan.nextInt();

                    if (pin == 123) {
                        System.out.println("Silahkan Masukan Nominal Uang Rp.");
                        double nominal = masukan.nextDouble();
                        service.tariktunai(nominal);

                    } else if (pin != 123) {
                        for (int j = 1; j <= 3; j++) {
                            System.out.println("PIN ANDA SALAH ! ");
                            System.out.println("Kesempatan Anda : " + j + " Dari 3");
                            System.out.println("Silahkan Masukan Pin Anda : ");
                            int pin_2 = masukan.nextInt();
                            if (pin_2 == 123) {
                                System.out.println("Silahkan Masukan Nominal Uang Rp.");
                                double nominal = masukan.nextDouble();
                                service.tariktunai(nominal);
                            } else if (j == 3) {
                                System.out.println("Mohon Maaf Akun Ada Di Blokir");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Masukan Nominal Rp. ");
                    double nominal_uang = masukan.nextDouble();
                    service.setortunai(nominal_uang);
                    break;

                case 4:
                    System.out.println("Masukan Nominal Rp. ");
                    double jumlah_uang = masukan.nextDouble();
                    service.transfer(jumlah_uang);
                    System.out.println("Saldo Tujuan Rp. ");
                    service2.tranferPenerima(jumlah_uang);
                    break;
                default:
                    System.out.println("Mohon Maaf Fitur Masih Belum Tersedia");
            }

        }
    }

}
