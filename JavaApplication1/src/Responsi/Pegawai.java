package Responsi;

import java.util.Scanner;

public class Pegawai {
    private String NPP;
    private String nama;
    private String bagian;
    private char sex;

    public void setNPP(String NPP) {
        this.NPP = NPP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNPP() {
        return NPP;
    }

    public String getNama() {
        return nama;
    }

    public String getBagian() {
        return bagian;
    }

    public char getSex() {
        return sex;
    }

    public void CetakPegawai() {
        System.out.println("NPP Anda : " + NPP);
        System.out.println("Nama Anda : " + nama);
        System.out.println("Bagian Anda : " + bagian);
        System.out.println("Jenis Klamin Anda " + sex);
    }
}

class Pegawai_Tetap extends Pegawai {
    private int gaji_pokok = 5000000;
    private float Tunjangan = 1500000;
    private float Bonus = 500000;

    public int getGaji_pokok() {
        return gaji_pokok;
    }

    public float getTunjangan() {
        return Tunjangan;
    }

    public float getBonus() {
        return Bonus;
    }

    public void setGaji_pokok(int gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public void setTunjangan(float Tunjangan) {
        this.Tunjangan = Tunjangan;
    }

    public void setBonus(float Bonus) {
        this.Bonus = Bonus;
    }

    public void HitungGaji() {
        gaji_pokok = (int) (gaji_pokok + Tunjangan + Bonus);
        System.out.println("Gaji Anda Bulan Ini " + getGaji_pokok());

    }
}

class Pegawai_Kontrak extends Pegawai {
    private int Gaji_Kontrak = 2500000;
    private int Jam_Lembur;

    public void setGaji_Kontrak(int Gaji_Kontrak) {
        this.Gaji_Kontrak = Gaji_Kontrak;
    }

    public void setJam_Lembur(int Jam_Lembur) {
        this.Jam_Lembur = Jam_Lembur;
    }

    public int getGaji_Kontrak() {
        return Gaji_Kontrak;
    }

    public int getJam_Lembur() {
        return Jam_Lembur;
    }

    public void HitungGaji() {
        int GajiLembur;
        GajiLembur = Jam_Lembur * 10000;
        Gaji_Kontrak = Gaji_Kontrak + GajiLembur;
        System.out.println("Gaji Anda Bulan Ini " + getGaji_Kontrak());
    }

}

class main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("PT SYAHALAM PROGRAMMER");
            System.out.println("*****Menu*****");
            System.out.println("1. Informasi Karyawan Tetap");
            System.out.println("2. Informasi Karyawan Kontrak");

            int angka;
            Scanner masukan = new Scanner(System.in);
            angka = masukan.nextInt();
            if (angka == 1) {
                Pegawai_Tetap PT = new Pegawai_Tetap();
                PT.setNama("Izaaz Azaam Syahalam");
                PT.setNPP("5180411386");
                PT.setSex('L');
                PT.setBagian("Teknik Informatika");
                System.out.println("Informasi Karyawan");
                PT.CetakPegawai();
                System.out.println("");
                PT.HitungGaji();
                System.out.println("");
            } else {
                Pegawai_Kontrak PK = new Pegawai_Kontrak();
                PK.setNama("Izaaz Azaam Syahalam");
                PK.setNPP("5180411386");
                PK.setSex('L');
                PK.setBagian("Teknik Informatika");
                PK.setJam_Lembur(5);
                System.out.println("Informasi Karyawan");
                PK.CetakPegawai();
                System.out.println("");
                PK.HitungGaji();
                System.out.println("");
            }
        }

    }
}