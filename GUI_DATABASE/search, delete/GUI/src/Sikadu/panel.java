/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sikadu;

/**
 *
 * @author user
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;



public class panel extends JPanel{
   private Color warna;
   public panel(){
   //Membuat sebuah warna yang diambil dari warna background RGB
   //Dengan tingkat transparansi =125
   
   warna = new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),125);
   
   }
   @Override
  public void setBackground(Color bg) {
  super.setBackground(bg);
  warna = new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),125);
  repaint();
  }
   @Override
   protected void paintComponent(Graphics g) {
   super.paintComponent(g);
   Graphics2D gd = (Graphics2D)g.create();
   //mengatur warna gd dengan warna
   gd.setColor(warna);
   //mengecat kotak dengan warna gd
   gd.fillRect(0,0,getWidth(),getHeight());
   gd.dispose();
   
   
   }
}
