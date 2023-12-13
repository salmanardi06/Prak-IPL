/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Rectangle extends Shape {
   private int width;
   private int height;

   public Rectangle(String title, int width, int height, DrawingContext drawingContext) {
      super(title, width, height, drawingContext); this.width = width;
      this.height = height;
   }

   @Override
   public void draw() {
      System.out.println("Menggambar persegi panjang " + " lebar " + width + " dan tinggi " + height);
   }

   @Override
   public void erase() {
      System.out.println("Menghapus persegi panjang ");
   }

   @Override
   public void resize(int width, int height) { 
      this.width = width;
      this.height = height;
   } 
}