package PBO;
abstract class Bentuk{
protected int panjang;
protected int lebar;

public String getBentuk(){
return "bentuk dasar";

}
public abstract int HitungLuas();
}
class BujurSangkar extends Bentuk{

    public BujurSangkar(int panjang,int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public String getBentuk(){
    return "bentuk bujur sangkar";
    }
    
    @Override
    public int HitungLuas(){
    return panjang * lebar;
    
    }
     
}
class Lingkaran extends Bentuk {
 public Lingkaran(){
 System.out.println("Kelas Lingkatan turunan kelas abstrak bentuk");
 }
 @Override
 public String getBentuk(){
 return "Bentuk Lingkatan";
 }
    @Override
    public int HitungLuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
class segitiga extends Bentuk{

        public segitiga(int panjang,int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

    
        @Override
        public String getBentuk(){
        return "bentuk segitiga";
    
        }
        @Override
        public int HitungLuas(){
        return (panjang * lebar)/2;
        
        }
    }
class TestAbstrak2{
public static void CetakLuasBentuk(Bentuk btk){
    System.out.println(btk.getBentuk()+ "Dengan Luas : " + btk.HitungLuas() );
}
    public static void main(String[] args) {
        BujurSangkar bj = new BujurSangkar(10,20);
        segitiga st = new segitiga(5, 10);
        CetakLuasBentuk(bj);
        CetakLuasBentuk(st);
//        Bentuk bt = new Bentuk(); // Karena Kelas Bentuk Adalah Abstrack
         Bentuk geometri = new BujurSangkar(2,4);
        
    }
    
}


