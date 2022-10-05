
package polymorphism;

public class Shape {
    protected float luas;
 float getluas (){
     System.out.println("Menghitung Luas");
     return luas;
}   
 
}

class Rectangle extends Shape{
float panjang;
float lebar;

@Override
float getluas(){
luas = panjang * lebar;
    System.out.println("*****PERSEGI PANJANG*****");
    System.out.println("Luas PersegI Panjang :" +luas);
    return luas;
}  
}

class Triangle extends Shape{
float alas,tinggi;
@Override
float getluas(){
luas = (alas * tinggi)/2;
    System.out.println("*****SEGITIGA*****");
    System.out.println("Luas Segitiga :" +luas);
return luas;
}
}
class Circle extends Shape{
float r;
@Override
float getluas(){
luas = (float) (Math.PI * r * r);
    System.out.println("*****LINGKARAN*****");
    System.out.println("Luas Lingkaran :" +luas);
return luas;

}

}
class main{
    public static void main(String[] args) {
       Triangle segitiga = new Triangle();
       segitiga.alas = 2; 
       segitiga.tinggi = 4;
       
       Circle ling = new Circle();
       ling.r = 5;
       
       Rectangle pp = new Rectangle();
       pp.panjang=10;
       pp.lebar=10;
       
       
        segitiga.getluas();
        System.out.println("");
        ling.getluas();
        System.out.println("");
        pp.getluas();
        System.out.println("");
    }

  
}