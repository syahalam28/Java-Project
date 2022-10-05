/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mbanking_Interface;

import java.util.Scanner;

/**
 *
 * @author Digital
 */
public class Main {

    /**
     * @param args the command line arguments
     */
//    Instance Of Class 
    public static void main(String[] args) {
        Service services = new ServiceImpl();
//    Input
        Scanner masukan = new Scanner(System.in);
        while (true) {
            System.out.println("OCTO CIMB NIAGA");
            System.out.println("1. Informasi Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("Masukan Pilihan Anda");

            int i = masukan.nextInt();

            switch (i) {
                case 1:
                    services.cekSaldo();
                    break;

                case 2:
                    services.tarikTunai();
                    break;

                case 3:
                    services.setorTunai();
                    break;

                case 4:
                    services.transfer();
                    break;
                default:
                    System.out.println("Sistem Dalam Pengembangan");
            }

        }
    }

}
