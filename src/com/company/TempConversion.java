package com.company;
import java.util.Scanner;
public class TempConversion {
    public static void main (String[] args){
        Scanner theInput = new Scanner(System.in);
        System.out.println("Please enter the number of the fahrenheit");
        double fahren = theInput.nextDouble();
        double celsius = (fahren - 32)/1.8;
        System.out.println(fahren + " Fahrenheit equals "+ celsius +" Celsius.");
    }
}
