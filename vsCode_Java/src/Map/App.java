package Map;

import java.util.HashMap;

// Materi
// Class HashMap Inheritance AbstractMap Implement Map
// Map - AbstarctMap - HashMap
// Hash Map Sebuah Class yang berisikan sekumpulan pasangan nilai (value) dan kunci (key) Seperti Array Associative
// "Name" => "Izaaz"
// Object HashMap (K) = Key && (V) = Value
// HashMap <K,V> object(Nama_Bebas) = new HashMap<K,V>
// HashMap<Integer, String> days = new HashMap<Integer,String>

// clear() untuk membersihkan isi HashMap;
// isEmpty() untuk mengecek apakah HashMap dalam keadaan kosong atau tidak;
// size() untuk mengambil ukuran HashMap (jumlah item di dalam hashmap);
// values() untuk mengambil semua nilai yang ada di dalam HashMap;
// keySet() untuk mengambil semua key yang ada di dalam HashMap;
// clone() untuk menggandakan objek HashMap;

public class App {
    public static void main(String[] args) {
        // Membuat Object HashMap
        HashMap <Integer, String> days = new HashMap<Integer,String>();
        
        // Mengisikan Nilai Ke Objek Days
        days.put(1, "Senin");
        days.put(2, "Selasa");
        days.put(3, "Rabu");
        days.put(4, "Kamis");
        days.put(5, "Jumat");

        System.out.println("Isi Object :" +days);

        // Mengambil Nilai HashMap
        System.out.println("Hari Kedua : " +days.get(2));
        // Menghapus Nilai dari HasiMao
        // remove (Menghapus Salah Satu Nilai)
        // clear(Menghapus Semua Nilai)

        days.remove(1);
        System.out.println("Isi Object Setelah Index 1 dihapus : " +days);

        days.clear();
        System.out.println("Isi Object Setelah di Clear : " +days);

        // Mengubah Nilai Pada HashMap (put) || (replace)

        days.put(1, "Sunday");
        System.out.println(days);
        
    }
}
