//Shirley 9/30 perimeter of a rectangle
package com.company;
import java.awt.*;
import java.util.Scanner;
public class rectangleFun {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("width:");
        int width = input.nextInt();
        System.out.println("height:");
        int height = input.nextInt();
        System.out.println("x:");
        int x = input.nextInt();
        System.out.println("y:");
        int y = input.nextInt();
        Rectangle rec = new Rectangle (x,y,width,height);
        double perimeter = 2*(rec.getWidth() + rec.getHeight());
       rec.setLocation((int) (rec.getX()-4),(int)(rec.getY()+2));
       System.out.println("perimeter = "+ perimeter);
        System.out.println("New location is ("+rec.getX()+","+rec.getY()+")");
    }




}
