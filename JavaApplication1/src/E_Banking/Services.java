/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_Banking;

/**
 *
 * @author Digital
 */
public class Services {

    private double saldo;

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Constructor
    public Services(double saldo) {
        this.saldo = saldo;
    }

    // Method Informasi Saldo
    public void ceksaldo() {
        System.out.println("Saldo Anda Adalah : " + getSaldo());

    }

    // Method Tarik Tunai
    public double tariktunai(double uang) {

        if (getSaldo() < uang) {
            System.out.println("Uang Anda Tidak Mencukupi Untuk Melakukan Transaksi Ini");

        } else {
            uang = getSaldo() - uang;
            System.out.println("Transaksi Berhasil");
            System.out.println("Sisa Uang Anda Rp. " + uang);

        }

        return uang;

    }

    // Method Setor Tunai
    public double setortunai(double uang) {
        uang += getSaldo();
        System.out.println("Uang Anda Sebelumnya Rp. " + getSaldo());
        System.out.println("Uang Anda Sekarang Rp. " + uang);

        return uang;

    }

    // Method Transfer Pengirim
    public double transfer(double uang) {
        if (getSaldo() < uang) {
            System.out.println("Uang Anda Tidak Mencukupi Untuk Melakukan Transfer");

        } else {
            uang = getSaldo() - uang;
            System.out.println("Sisa Uang Anda Rp. " + uang);
        }

        return uang;
    }

    // Method Transfer Penerima
    public double tranferPenerima(double uang) {
        uang += getSaldo();
        System.out.println("Jumlah Uang Anda Rp. " + uang);
        return uang;

    }

}
