
package Inheritance;
import java.util.Scanner;

class Enemy { //Class Induk
String nama;
int hp,attack;

    public Enemy(String nama, int hp, int attack) { //Constructor Pemberian inisialisasi awal 
        this.nama = nama;
        this.hp = hp;
        this.attack = attack;
    }

    public String getNama() { //Akses dasar publik pada method getter untuk mengemballikan nilai dari nama
        return nama;
    }

    public int getHp() { //Akses dasar publik pada method getter untuk mengemballikan nilai dari hp
        return hp;
    }

    public int getAttack() { //Akses dasar publik pada method getter untuk mengemballikan nilai dari attack
        return attack;
    }

    public void setNama(String nama) { //Akses dasar publik pada method setter untuk memberikan nilai dari nama
        this.nama = nama;
    }

    public void setHp(int hp) { //Akses dasar publik pada method setter untuk memberikan nilai dari hp
        this.hp = hp;
    }

    public void setAttack(int attack) { //Akses dasar publik pada method setter untuk memberikan nilai dari attack
        this.attack = attack;
    }
void atack(){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    System.out.println("Serang ");

}
}
class Pocong extends Enemy{ // Constructor Memberikan inisiallisasi awal

    public Pocong(String nama, int hp, int attack) {
        super(nama, hp, attack);
    }
    
void jumpt(){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    System.out.println("Nama Enemy : "+getNama());
    System.out.println("Hp Enemy :"+getHp());
    System.out.println("Kemampuan "+getAttack());
    System.out.println("Melompat - Lompat");
}
}

class Zombie extends Enemy{ //class turunan

        public Zombie(String nama, int hp, int attack) { //Constructor memberikan nilai awal
            super(nama, hp, attack);
        }
void walk(){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    System.out.println("Nama Enemy : "+getNama());
    System.out.println("Hp Enemy :" +getHp());
    System.out.println("Kemampuan "+getAttack());
    System.out.println("Zombie Jalan Jalan");
    

}
}    



class Burung extends Enemy{ // Class Turunan

    public Burung(String nama, int hp, int attack) { //Constructor
        super(nama, hp, attack);
    }
    

void walk(){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    System.out.println("Burung Berjalan");

}

void jumpt(){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    System.out.println("Burung Meloncat - Loncat");

}

void fly(){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    System.out.println("Burung Terbang");

}
void info(){ //Method tanpa mengembaikan nilai yang langsung menampilkan nilai
    System.out.println("Nama Enemy : "+getNama());
    System.out.println("Hp Enemy :"+getHp());
    System.out.println("Kemampuan" +getAttack());

}
}

class utama{ 

    public static void main(String[] args) { //Class Utama
        while (true) {  // Perulangan While jika steatmen true maka perulangan akan diulang        
            
        
                   
        Scanner a = new Scanner(System.in);
        System.out.println("Choice Your Enemy");
        System.out.println("1. Zombie");
        System.out.println("2. Pocong");
        System.out.println("3. Burung");
         int inputan = a.nextInt();
         
            switch (inputan) {
                case 1:
                    {
                        Scanner b = new Scanner(System.in);
                        System.out.println("Your Enemy Is Zombie");
                        System.out.println("Input Your Zombie Hp :");
                        int hp = a.nextInt();
                        System.out.println("Input Zombie's name :");
                        String nama = b.nextLine();
                        Zombie zom = new Zombie(nama, hp, 1000 );
                        zom.atack();
                        zom.walk();
                        break;
                    }
                case 2:
                    {
                        Scanner c = new Scanner(System.in);
                        System.out.println("Your Enemy Is Pocong");
                        System.out.println("Input Your Pocong Hp :");
                        int hp = a.nextInt();
                        System.out.println("Input Pocong's name :");
                        String nama = c.nextLine();
                        Pocong pc = new Pocong(nama, hp, 999);
                        pc.atack();
                        pc.jumpt();
                        break;
                    }
                default:
                    {
                        Scanner d = new Scanner(System.in);
                        System.out.println("Your Enemy Is Burung");
                        System.out.println("Input Your Burung Hp :");
                        int hp = a.nextInt();
                        System.out.println("Input Burung's name :");
                        String nama = d.nextLine();
                        Burung br = new Burung(nama, hp, 500);
                        br.info();
                        br.fly();
                        br.jumpt();
                        br.walk();
                        break;
                    }
            }
        }
    }
}