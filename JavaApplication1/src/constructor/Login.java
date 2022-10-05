package constructor; //Kumpulan dari class yang sama

/**
 *
 * @author user
 */
public class Login { // Akses dasar public pada class, sehingga isi dari class dapat diakses oleh class lain
    
    private String username, password; // Akses dasar private terhadap variabel
    //Untuk nama variabel yang dikenai privat hanya bisa diberikan nilai oleh method yang di akses oleh kelas yang memilikinya
    
    public Login(){ //Constructor yaitu nama method yang sama dengan nama classnya bertujuan untuk memberikan inisialisasi awal (Nilai awal)
        username = "admin"; // Niali awal dari username adalah "admin"
        password = "12345";// Nilai awal dari password adalah "12345"
        
    }
    
    public Login(String username, String password){ //Constructor yaitu nama method yang sama dengan nama classnya bertujuan untuk memberikan inisialisasi awal (Nilai awal) dengan parameter
    this.username = username; 
    this.password = password;
    
    }

    public void setUsername(String username) { //Akses dasar public pada method dengan (void yang tidak mengembalikan nilai) set(Untuk memberikan nilai atau mengubah suatu nilai)
        this.username = username; //this (menunjuk nama variabel yang digunakan untuk membedakan dengan nama variabel pada class) memberi nilai pada username
    }

    public void setPassword(String password) {//Akses dasar public pada method dengan (void yang tidak mengembalikan nilai) set(Untuk memberikan nilai atau mengubah suatu nilai)
        this.password = password;//this (menunjuk nama variabel yang digunakan untuk membedakan dengan nama variabel pada class) memberi nilai pada password
    }

    public String getUsername() { // Akses dasar public pada method yang artinya methode tersebut dapat diakses dari class lain
        return username;//Mengembalikan nilai username
        
        //method get untuk mengembalikan nilai dari username
    }

    public String getPassword() {// Akses dasar public pada method yang artinya methode tersebut dapat diakses dari class lain
        return password;//Mengembalikan nilai password
        //Method get untuk mengembalikan nilai dari password
    }
    
    
    
    
    
}
