/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author user
 */
import java.io.*;
public class Overriding {
    private double TinggiBadan;

    public Overriding(double TB) {
        TinggiBadan = TB;
    }

    public double getTB() {
        return TinggiBadan;
    }
    
    public double HtgBBI(){
    
    return 0.0;
    
    }
    
}

class Laki extends Overriding{

    public Laki(double TB) {
        super(TB);
    }

    @Override
    public double HtgBBI(){
return (super.getTB()-100)*0.9;

}


}

class Perempuan extends Overriding{

    public Perempuan(double TB) {
        super(TB);
    }
    @Override
    public double HtgBBI(){

return (super.getTB()-100)*0.8;
}

}

class utama{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Overriding [] o = new Overriding [2];
        
        int x=0;
        do{
            System.out.println("User "+ (x+1));
            System.out.println("Masukan Tinggi Badan Anda (cm) = ");
            double t = Double.parseDouble(br.readLine());
            System.out.println("Masukan Jenis Klamin (L/P)");
            String jk = br.readLine();
            
            if (jk.toUpperCase().equals("L")){
                o[x]=new Laki(t);
                System.out.println("Berat Badan Ideal laki - laki adalah " +o[x].HtgBBI());
                System.out.println("");
            
            }
            
            else {
            o[x]= new Perempuan(t);
                System.out.println("Berat Badan Ideal Perempuan adalah "+o[x].HtgBBI());
                System.out.println("");
            
            
            }
        
        x++;
        
        }while (x<2);
    }
}