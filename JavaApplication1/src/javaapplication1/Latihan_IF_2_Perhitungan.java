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
public class Latihan_IF_2_Perhitungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        a =6;
        b=-3;
        
        if ((a + b)>= (b - a)) {
            a += 2;
            b +=a;
            if (a % 2 == 0) {
                a=b;
            }else{
                b += a+1;
            }
             
            
        }
        a = -b - a;
        System.out.println(a);
    }
    
}
