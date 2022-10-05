/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class Latihan_IF_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a = -7;
     
     if((a > 0) && (a % 2 == 0)) {
         System.out.println(a + "Adalah bilangan genap Positif");
      }
     else if ((a < 0) && (a % 2 == 0) ){
         System.out.println(a + "Adalah bilangan genap negatif");    
     }
     else if ((a > 0) && (a % 2 != 0) ){
         System.out.println(a + "Adalah bilangan ganjil positif");    
     }
     else { System.out.println(a + " Adalah bilangan Ganjil Negativ");}
    
  }
    
}
