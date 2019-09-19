package com.company;
import java.util.Scanner;
public class RoundNegatives {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a negaive decimal number");
        double decinum = input.nextDouble();
        double decinum1 = (int)(decinum+0.5);
        System.out.println(decinum+" rounded to a whole number is "+ decinum1);
    }
}
