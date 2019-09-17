package com.company;
import java.util.Scanner;
public class RectangleArea1 {
    public static void main (String[] args) {
        Scanner theInput = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle");
        double length = theInput.nextDouble();
        System.out.println("Please enter the width of the rectangle");
        double width = theInput.nextDouble();
        double area = length * width;
        System.out.println("Area = " + area);
    }
}
