/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mbanking_Interface;

import java.util.Scanner;

/**
 *
 * @author Digital
 */
public class ServiceImpl implements Service {

//    Deklarasi Input
    Scanner masukan = new Scanner(System.in);
//Instance Of Class From Domain Class
    Domain nasabah1 = new Domain(8000000);

    @Override
    public void cekSaldo() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        System.out.println("Saldo Anda Adalah : Rp. " + nasabah1.getSaldo());

    }

    @Override
    public double tarikTunai() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double uang = 0;
        System.out.println("Masukan PIN Anda !");
        int i = masukan.nextInt();
        int pin = 123;
        if (i == pin) {
            System.out.println("Masukan Nominal Uang Rp.");
            double j = masukan.nextDouble();
            if (nasabah1.getSaldo() < j) {
                System.out.println("Mohon Maaf Uang Anda Tidak Cukup");
            } else {
                uang = nasabah1.getSaldo() - j;
                System.out.println("Silahkan Ambil Uang Anda");
                System.out.println("Jumlah Uang Rp." + uang);
            }

        } else {
            for (int j = 1; j <= 3; j++) {
                System.out.println("PIN Anda Salah");
                System.out.println("Batas Anda " + j + " Dari 3");
                System.out.println("Silahkan Masukan Pin Anda ");
                int k = masukan.nextInt();
                if (k == pin) {
                    System.out.println("Masukan Nominal Uang Rp.");
                    double L = masukan.nextDouble();
                    if (nasabah1.getSaldo() < L) {
                        System.out.println("Mohon Maaf Uang Anda Tidak Cukup");
                        break;
                    } else {
                        uang = nasabah1.getSaldo() - L;
                        System.out.println("Silahkan Ambil Uang Anda");
                        System.out.println("Nominal Uang Yang Ditarik " + uang);
                        break;
                    }

                } else if (j == 3) {
                    System.out.println("Mohon Maaf Rekening Anda Kami Block");
                    System.out.println("Silahkan Mengubungi Call Center 14041");
                }

            }

        }
        return uang;
    }

    @Override
    public double setorTunai() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Masukan Jumlah Uang Rp.");
        double uang = masukan.nextDouble();
        uang += nasabah1.getSaldo();
        System.out.println("Jumlah Uang Anda Rp." + uang);
        return uang;

    }

    @Override
    public double transfer() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        System.out.println("Masukan Nomor Rekening");
        int no_rek = masukan.nextInt();
        System.out.println("Masukan Nominal Uang Rp.");
        double uang = masukan.nextDouble();
        double transfer = nasabah1.getSaldo() - uang;
        System.out.println("Anda Mentrasnfer Uang Sejumlah Rp. " + transfer);
        System.out.println("Kepada Nomor Rekening " + no_rek);
        System.out.println("(Y/N)");
        char pilihan = masukan.next().charAt(0);
        if (pilihan == 'Y') {
            System.out.println("Transfer Berhasil");
            System.out.println("Nomor Rekening Tujuan " + no_rek);
            System.out.println("Nominal Rp. " + uang);
            System.out.println("Apakah Anda Ingin Mencetak Struk ? ");
            System.out.println("Jika Tidak Saldo Akan ditampilkan dilayar (Y/N)");
            char pilihan2 = masukan.next().charAt(0);
            if (pilihan2 == 'Y') {
                System.out.println("Silahkan Ambil Struk Anda");

            }else{
                System.out.println("Saldo Anda Rp." +transfer);
            }
        } else {
            System.out.println("Transaksi Dibatalkan");
        }

        return transfer;
    }

}
