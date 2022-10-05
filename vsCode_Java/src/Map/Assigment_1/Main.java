package Map.Assigment_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
         // membuat objek hashmap
         HashMap<String, Buku> books = new HashMap<String, Buku>();
        
         // membuat objek buku
         Buku bukuJava = new Buku("Tutorial Java", "Petani Kode");
         Buku bukuKotlin = new Buku("Pemrograman Kotlin", "Petani Kode");
         Buku bukuAndroid = new Buku("Pemrograman Android", "Petani Kode");
         
         // mengisi objek hashmap dengan objek buku
         books.put("java", bukuJava);
         books.put("kotlin", bukuKotlin);
         books.put("android", bukuAndroid);
         
         // cetak semua buku
         for(Map.Entry b: books.entrySet()){
             Buku buku = (Buku) b.getValue();
             System.out.println(b.getKey() + ": "+ buku.getTitle() +" "+ buku.getAuthor());
         }
}   
}
