/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author user
 */
public class polimorphisme {
    public static void main(String[ ] args) {
 
      cetakObyek(new Balok());
      cetakObyek(new PersegiPanjang());
      cetakObyek(new BangunDatar());
      cetakObyek(new Object());
   }
    public static void cetakObyek(Object obyek){
        System.out.println(obyek);
    
    }
}
class Balok extends PersegiPanjang {
   @Override
   public String toString() {
      return "Mempunyai sisi panjang, lebar dan tinggi";
   }
}
 
class PersegiPanjang extends BangunDatar {
   @Override
   public String toString() {
      return "Mempunyai sisi panjang dan lebar";
   }
}
 
class BangunDatar extends Object {
   @Override
   public String toString() {
      return "Mempunyai berbagai bentuk";
   }
    
}



