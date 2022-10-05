
package Responsi;

public class Person {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}

class Myclass {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setNama("Johakim");
        System.out.println(myObj.getNama());
    }

}
