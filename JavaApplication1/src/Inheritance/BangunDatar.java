
package Inheritance;

import java.util.Scanner;
public class BangunDatar { //Class Induk
    float luas;
    float keliling;

    public float getLuas() { //Akses dasar publik pada method getter untuk mengemballikan nilai dari luas
        return luas;
    }

    public float getKeliling() { //Akses dasar publik pada method getter untuk mengemballikan nilai dari Keliling
        return keliling;
    }

    public void setLuas(float luas) {//Akses dasar publik pada sethod getter untuk memberikan nilai dari luas
        this.luas = luas;
    }

    public void setKeliling(float keliling) {//Akses dasar publik pada sethod getter untuk memberikan nilai dari keliling
        this.keliling = keliling;
    }
    
}

class persegi extends BangunDatar{ //Class Turunan
private float sisi;

  

    public float getSisi() { //Akses dasar publik pada method getter untuk mengemballikan nilai dari sisi
        return sisi; 
    }

    public float  setSisi(float sisi) {//Akses dasar publik pada sethod setter untuk memberikan nilai dari sisi
        this.sisi = sisi;
        return sisi;
    }   
    public void getHitungLuas(float sisi){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    luas = sisi * sisi;
  System.out.println("Luas Persegi Adalah : " +luas);
    }
  
    public void getHitungKeliling(float sisi){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    keliling = sisi * 4;
      System.out.println("Luas Keliling Adalah :" +keliling);
   
  }
    
}

class PersegiPanjang extends BangunDatar{ // Class Turunan
private float panjang;
private float lebar;

    

    public float setPanjang(float panjang) { //Akses dasar publik pada method setter untuk memberikan nilai dari Panjang
        this.panjang = panjang;
        return panjang;
    }

    public float setLebar(float lebar) {//Akses dasar publik pada method setter untuk memberikan nilai dari Lebar
        this.lebar = lebar;
        return lebar;
    }

    public float getPanjang() { //Akses dasar publik pada method getter untuk mengemballikan nilai dari Panjang
        return panjang;
    }

    public float getLebar() { //Akses dasar publik pada method getter untuk mengemballikan nilai dari Lebar
        return lebar;
    }
public void getHitungLuas(float panjang , float lebar){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
luas = panjang * lebar;
    System.out.println("Luas :"+luas);

}
 public void getHitungKeliling(float panjang , float lebar){//Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    keliling = panjang * 2 + 2 * lebar;
     System.out.println("Keliling :"+keliling);
  
 }

 
}

class Lingkaran extends BangunDatar{ // Class Turunan
    float r;

    

    public float getR() { // Akses dasar public pada method getter untuk mengembalikan nilai r
        return r;
    }

    public float setR(float r) { // Akses dasar public pada method setter untuk memberikan nilai r
        this.r = r;
        return r;
    }
    
    public void getHitungLuas(float r){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
   
    luas =  (float) (Math.PI * r * r);
   System.out.println("Luas Lingkaran :" +luas);
    }
    
    public void getHitungKeliling(float r){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
 
    keliling = (float) (2 * Math.PI * r);
     System.out.println("Keliling Lingkaran :" +keliling);
    
    }


}

class segitiga extends BangunDatar{ // class Turunan
float alas,tinggi,sisi;

    public float getAlas() { // Akses dasar public pada method getter untuk mengembalikan nilai alas
        return alas;
    }

    public float getTinggi() {// Akses dasar public pada method getter untuk mengembalikan nilai tinggi
        return tinggi;
    }

    public float getSisi() {// Akses dasar public pada method getter untuk mengembalikan nilai sisi
        return sisi;
    }

    public void setAlas(float alas) { //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
        this.alas = alas;
    }

    public void setTinggi(float tinggi) { //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
        this.tinggi = tinggi;
    }

    public void setSisi(float sisi) { //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
        this.sisi = sisi;
    }
    


public void getHitungLuas( float alas, float tinggi){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai

luas = alas * tinggi / 2;
    System.out.println("Luas :"+luas);
}

public void getHitungKeliling(float alas, float tinggi , float sisi){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai   
keliling = sisi * alas * tinggi; 
    System.out.println("Keliling : " +keliling);

}

}

class main{
    public static void main(String[] args) {
   
        Scanner a = new Scanner(System.in);
        System.out.println("***PERSEGI***");
        System.out.println("Masukan sisi");
        float a1 = a.nextFloat();
        persegi per = new persegi();
        per.getHitungKeliling(a1);
        per.getHitungLuas(a1);
        System.out.println("");
        
        Scanner b = new Scanner(System.in);
        System. out .println("***PERSEGI PANJANG***");
        System.out.println("Masukan Panjang");
        float a2 = a.nextFloat();
        System.out.println("Masukan Tinggi");
        float a3 = b.nextFloat();
        PersegiPanjang pers = new PersegiPanjang();
        pers.getHitungKeliling(a2, a3);
        pers.getHitungLuas(a2, a3);
        System.out.println("");
        
        
        System. out .println("***LINGKARAN***");
        System.out.println("Masukan Jari");
        float a4 = a.nextFloat();
        Lingkaran ling = new Lingkaran();
        ling.getHitungKeliling(a4);
        ling.getHitungLuas(a4);
        System.out.println("");
        
        
        Scanner ccc = new Scanner(System.in);
        System. out .println("***SEGITIGA***");
        System.out.println("Masukan Alas");
        float a5 = a.nextFloat();
        System.out.println("Masukan Tinggi");
        float a6 = ccc.nextFloat();
        System.out.println("Masukan Sisi");
        float a7 = ccc.nextFloat();
        segitiga iga = new segitiga();
        iga.getHitungKeliling(a7, a6, a5);
        iga.getHitungLuas(a5, a6);
        System.out.println("");
        
        

    }
    



}
