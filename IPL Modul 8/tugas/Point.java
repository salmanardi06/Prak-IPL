/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Point {
   private int x; private int y;

   public Point(int x, int y) { this.x = x;
      this.y = y;
   }

   public int getX() { 
      return x;
   }

   public int getY() { 
      return y;
   }

   public void setX(int x) { 
      this.x = x;
   }

   public void setY(int y) { 
      this.y = y;
   }

   @Override
   public String toString() {
      return "(" + x + ", " + y + ")";
   } 
}