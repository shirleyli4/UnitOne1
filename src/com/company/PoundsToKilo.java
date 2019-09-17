package com.company;
import java.util.Scanner;
public class PoundsToKilo {
    public static void main (String[] args){
        Scanner theInput = new Scanner(System.in);
        System.out.println("Please enter the number of pounds");
        double lbs = theInput.nextDouble();
        double kg = lbs/2.205;
        System.out.println(lbs + " pounds"+ " = "+ kg+ " kilograms");

    }
}
