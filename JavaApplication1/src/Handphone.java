/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Handphone {
 // deklarasi
    private String merk,tipe,warna;
    private double harga;
    
    //setter
    public void setMerk(String merk) {
        this.merk=merk;
        }
    
    public void setTipe(String tipe) {
        this.tipe=tipe;
        }
    
    public void setWarna(String colour) {
        warna=colour;
        }
    
    public void setHarga(double harga) {
        this.harga=harga;
        }
    
    //getter
    public String getMerk() {
        return merk;
         }
    
    public String getTipe() {
        return tipe;
         }
    
    public String getWWarna() {
        return warna ;
         }
    
    public double getHarga() {
        return harga;
         }
    
    //Methode Tambahan
    
    public double HargaDiskon() {
        double diskon = 0.1 * getHarga();
        double total = getHarga() - diskon;
        return total;
        
    }
    public void keterangan(){
        System.out.println("Harga Hape Sesudah Didiskon (10%) = Rp." +HargaDiskon());
    }    
}
