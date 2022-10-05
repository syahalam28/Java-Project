/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class EncapTest {
private String name; // Artinya method yang digunakan hanya dapat diakses oleh kelas yang memiikinya
private String idNum;// Untuk nama variabel yang dikenai privat  hanya bisa diberikan nilai oleh method yang di akses oelh kelas yang memilikinya
private int age; // akses dasar terhadap variabel


public int getAge(){ // Akses dasar public pada method yang artinya dapa di akses dari mana saja 
    return age; //Mengembalikan nilai Age
    //method get untuk mengembalikan nilai dari age
}
public String getName(){ // Akses dasar public pada method yang artinya dapa di akses dari mana saja 
    return name; //Mengembalikan nilai name
    //method get untuk mengembalikan nilai dari name
    
}
public String getIdNum(){ // Akses dasar public pada method yang artinya dapa di akses dari mana saja 
    return idNum; //Mengembalikan Nilai idNum
    //method get untuk mengembalikan nilai dari idNum
    
}

public void setName(String newName){ //Akses dasar public pada method dengan (void yang tidak mengembalikan nilai) set(Untuk memberikan nilai atau mengubah suatu nilai)
name = newName; 
}
public void setAge(int newAge){ //Akses dasar public pada method dengan (void yang tidak mengembalikan nilai) set(Untuk memberikan nilai atau mengubah suatu nilai)
age = newAge;
}
public void setIdNum(String newId){ //Akses dasar public pada method dengan (void yang tidak mengembalikan nilai) set(Untuk memberikan nilai atau mengubah suatu nilai)
idNum = newId;
}
   
}
