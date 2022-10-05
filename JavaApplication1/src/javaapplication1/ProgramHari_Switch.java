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
public class ProgramHari_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NomorHari = 3;
        switch (NomorHari){
            case 1 : 
                System.out.println("Hari Ke - " + NomorHari + " : Senin");
                break;
            case 2 : 
                System.out.println("Hari Ke - " + NomorHari + " : Selasa");
                break;
            case 3 : 
                System.out.println("Hari Ke - " + NomorHari + " : Rabu");
                break;
                
                default:
                    System.out.println("Tidak Ada Hari Ke- " + NomorHari);
        }
                
        
    }
    
}
