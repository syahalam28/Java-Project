/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author user
 */


import java.util.Scanner;


public class Bentuk {
private String warna;

    public Bentuk(String warna1) {
       warna = warna1;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna1) {
        warna = warna1;
    }
    
public void printinfo(){
    System.out.println("Bentuk Warna " +warna);
    
}
}
class bujursangkar extends Bentuk{
    private double sisi;

    public bujursangkar(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
    public double getHitungLuas(){
  return sisi * sisi;
    
    }
public void printinfo(){
    System.out.println("BujurSangkar berwarna " +getWarna());
    System.out.println("Luas "+getHitungLuas());
}
}
class lingkaran extends Bentuk{
private double radius;

    public lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getHitungLuas1(){
    double total;
    total = Math.PI*radius*radius;
    return total;
    
    
    }
public void printinfo(){
    System.out.println("Lingkaran Berwarna : " +getWarna());
    System.out.println("Luas Lingkaran : " +getHitungLuas1());
}       
}
class silinder extends lingkaran{
private double tinggi;

    public silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getHitungVolume(){
    return getHitungLuas1()*tinggi;
    
    }
    
    public void printinfo(){
        System.out.println("Silinder warna " +getWarna());
        System.out.println("Luas " +getHitungVolume());
    
    }



}
class Utama{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("*******BUJURSANGKAR********");
        System.out.println("Masukan Warna");
        String b = a.nextLine();
        System.out.println("Masukan Sisi");
        double c = a.nextDouble();
        bujursangkar bj = new bujursangkar(c,b);
        bj.printinfo();
        System.out.println("");
        
       Scanner e = new Scanner(System.in);
        System.out.println("*********LINGKARAN*********");
        System.out.println("Masukan Warna");
        String bb = e.nextLine();
        System.out.println("Masukan Jari Jari ");
        double r = e.nextDouble();
        lingkaran lg = new lingkaran(r,bb);
        lg.printinfo();
        System.out.println("");
        
       Scanner ee = new Scanner(System.in);
        System.out.println("*********SILINDER*********");
        System.out.println("Masukan Warna");
        String bbb = ee.nextLine();
        System.out.println("Masukan Jari Jari ");
        double rr = ee.nextDouble();
        System.out.println("Masukan Tinggi Silinder");
        double t=ee.nextDouble();
        silinder ss = new silinder(t, rr, bbb);
        ss.printinfo();
        
        
        
        
    }


}
