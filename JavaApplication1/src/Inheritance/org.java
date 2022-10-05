/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class org {
public String nama,alamat;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }


}

class mhs extends org{
String nim;

    public static void main(String[] args) {
        mhs m1 = new mhs();
       Scanner masukan = new Scanner(System.in);
       m1.nama = masukan.nextLine();
        System.out.println("Nama Anda Adalah :" +m1.getNama());
    }


}
