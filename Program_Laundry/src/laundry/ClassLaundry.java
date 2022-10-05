/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author Acer
 */
public class ClassLaundry {
    public String namaPelanggan;
    public String jenisCucian;
    public String kategori;
    public float harga;

    
    @Override
    public String toString(){
        return namaPelanggan +" - " + jenisCucian +" - " + kategori + " - " + harga ;
    }
    

    
}
