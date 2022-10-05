/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author user
 */
import java.util.Scanner;
interface operasi{
// Deklarasi Variabel dan atau method
    public void penjumlahan();
    public void pengurangan();
    public double perkalian();
    public double pembagian();


}
public class L_interface implements operasi{
private double bil1,bil2;
public L_interface(){

}
public L_interface(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double getBil1() {
    return bil1;
  
    }

    public double getBil2() {
        return bil2;
    }



    
    @Override
public void penjumlahan(){
        System.out.println(bil1+bil2);
};
@Override
public void pengurangan(){
    System.out.println(bil1-bil2);
};
@Override
public double perkalian(){
   
return (bil1*bil2);
};
@Override
public double pembagian(){
    
return (bil1/bil2);
};


}

class utama{
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        L_interface LI = new L_interface();
        
        System.out.println("Masukan Bilangan Pertama");
        double a = masukan.nextDouble();
        System.out.println("Masukan Bilangan Kedua");
        double b= masukan.nextDouble();
         LI = new L_interface(a, b);
         
         //Output
         System.out.println("Penjumlahan");
         LI.penjumlahan();
         System.out.println("");
         System.out.println("Pengurangan");
         LI.pengurangan();
         System.out.println("");
         System.out.println("Perkalian " +LI.perkalian());
         System.out.println("");
         System.out.println("Pembagian " +LI.pembagian());
         System.out.println("");
        
    }


}