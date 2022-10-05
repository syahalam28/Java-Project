package Handphone;

import java.util.Scanner;

public class Handphone {
String merk,type,warna;
int harga;



public void CetakData(){
    System.out.println("Merk Handphone : " +merk);
    System.out.println("Type HandPhone : " +type);
    System.out.println("Warna Handphone : "+warna);
    System.out.println("Rp. " +harga);
}

public void InputData(){
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

public void UbahHarga(int HargaBaru){
    harga = HargaBaru;
    
}
    public static void main(String[] args) {
        Handphone hp1 = new Handphone();
        Handphone hp2 = new Handphone();
        hp1.InputData();
        hp1.UbahHarga(1500000);
        hp1.CetakData();
        System.out.println("Promo Harga Menjadi ");
        hp1.UbahHarga(15000000);
        hp1.CetakData();
        hp2.InputData();
        hp2.CetakData();
        
        
    }
}




