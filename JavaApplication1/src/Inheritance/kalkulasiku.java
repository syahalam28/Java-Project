package Inheritance;


class kalkulasi { // Merupakan Parent Class (Class Induk)
    int z; 
    public void penambahan(int x, int y){ //Akses dasar public pada method yang berfungsi melakukan operasi penjumlahan
        z = x + y;
        System.out.println("Hasil Penambahan : " +z);
        
        
    }
    
    public void pengurangan(int x, int y){ //Akses dasar public pada method yang berfungsi melakukan operasi pengurangan
        z = x - y;
        System.out.println("Hasil Penambahan : " +z);
        
        
    }
    
    
}

public class kalkulasiku extends kalkulasi{ // Class anak, class yang mewarisi attribut dan method dari kelas induk, disini class Kalkulasiku mewarisi attribute dan methode dari class kalkulasi
public void  perkalian(int x,int y){ //Akses dasar public pada method yang berfungsi melakukan operasi perkalian
    z=x*y;
    System.out.println("Hasil Perkalian :" +z); 
}

    public static void main(String[] args) { // Class Utama
        int a = 10;
        int b = 5;
        kalkulasiku tes = new kalkulasiku(); //Inisialisasi Objek
        tes.penambahan(a, b); // Pemanggilan Method Penjumlahan dengan objek 
        tes.pengurangan(a, b);// Pemanggilan Method Pengurangan dengan objek 
        tes.perkalian(a, b);// Pemanggilan Method Perkalian dengan objek 
    }

}