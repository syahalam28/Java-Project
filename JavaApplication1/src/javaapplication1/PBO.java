
package javaapplication1;
import java.util.Scanner;
public class PBO {
float jari;
double luas,x,y,z,rata;
int a;


public void HitungLuas(){
Scanner masukan = new Scanner(System.in);
    System.out.println("Masukan Nilai Jari Jari");
jari = masukan.nextFloat();
    luas = 3.14 * jari * jari;
    System.out.println("Luas Lingkara : " +luas);
}
public void GanjilGenap(){
    Scanner inputan = new Scanner(System.in);
    System.out.println("Masukan Angka ");
  a = inputan.nextInt();
    if((a > 0) && (a % 2 == 0)) {
         System.out.println(a + " Adalah bilangan genap Positif");
      }
     else if ((a < 0) && (a % 2 == 0) ){
         System.out.println(a + " Adalah bilangan genap negatif");    
     }
     else if ((a > 0) && (a % 2 != 0) ){
         System.out.println(a + " Adalah bilangan ganjil positif");    
     }
     else { System.out.println(a + " Adalah bilangan Ganjil Negativ");}
  }
public void RataNilaiBesar(){
    System.out.println("Menetukan Bilangan Terbesar, Terkecil, dan Rata-rata");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama (X): ");
        x = input.nextDouble();
        System.out.print("Masukkan Bilangan Kedua (Y) : ");
        y = input.nextDouble();
        System.out.print("Masukkan Bilangan Ketiga (Z) : ");
        z = input.nextDouble();
        rata = (x + y + z) / 3;
        System.out.println("\nHasil:");
    System.out.println("Rata-ratanya adalah : " + rata);
     if (x == y && y == z) {System.out.println("Ketiga Bilangan Sama Besar");
        } else if (x > y && x > z) {System.out.println(x + " adalah bilangan terbesar");
        } else if (y > z && y > x) {System.out.println(y + " adalah bilangan terbesar");
        } else if (z > x && z > y) {System.out.println(z + " adalah bilangan terbesar");
        } else if (x == y && x > z) {System.out.println(x + " adalah bilangan terbesar");
        } else if (x == z && x > y) {System.out.println(x + " adalah bilangan terbesar");
        } else {System.out.println(y + " adalah bilangan terbesar");
        }        
      if (x == y && y == z) {System.out.println("Ketiga Bilangan Sama Kecil");
        } else if (x < y && x < z) {System.out.println(x + " adalah bilangan terkecil");
        } else if (y < z && y < x) {System.out.println(y + " adalah bilangan terkecil");
        } else if (z < x && z < y) {System.out.println(z + " adalah bilangan terkecil");
        } else if (x == y && x < z) {System.out.println(x + " adalah bilangan terkecil");
        } else if (x == z && x < y) {System.out.println(x + " adalah bilangan terkecil");
        } else {System.out.println(y + " adalah bilangan terkecil");
        }
    
}
    public static void main(String[] args) {
        int masukan;
        PBO A=new PBO();
        System.out.println("Pilih Program Yang Ingin Anda Gunakan");
        System.out.println("1. Menghitung Luas Lingkaran \n2. Menentukan Bilangan Genap / Ganjil \n3. Rata Rata Suatu Nilai Dan Nilai Terbesar Dan Terkecilnya" );
    Scanner c = new Scanner(System.in);
    masukan = c.nextInt();
    switch (masukan) {
        case 1:
            A.HitungLuas();
            break;
        case 2:
            A.GanjilGenap();
            break;
        default:
            A.RataNilaiBesar();
            break;
    }
            
    
    }
}
