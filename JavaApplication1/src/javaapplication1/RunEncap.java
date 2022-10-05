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
public class RunEncap {
     public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Izaaz");
        encap.setAge(19);
        encap.setIdNum("5180411386");
        System.out.println("Name : " + encap.getName() + "\n Age : " + encap.getAge());
        
    }
    
}
