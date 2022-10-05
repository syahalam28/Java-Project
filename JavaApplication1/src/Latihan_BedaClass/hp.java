/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_BedaClass;

import java.util.Scanner;

public class hp {
    String merk, type, warna;
    int harga;

    public void CetakData() {
        System.out.println("Merk Handphone : " + merk);
        System.out.println("Type HandPhone : " + type);
        System.out.println("Warna Handphone : " + warna);
        System.out.println("Rp. " + harga);
    }

    public void InputData() {
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukan Merk HandPhone");
        merk = masuk.nextLine();

        System.out.println("Masukan Type Handphone");
        type = masuk.nextLine();

        System.out.println("Masukan Warna HandPhone");
        warna = masuk.nextLine();

        System.out.print("Masukan Harga Rp.");
        harga = masuk.nextInt();

    }

}
