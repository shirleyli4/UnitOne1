package com.company;
import java.util.Scanner;
public class FindTheAverage {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter four values.");
        System.out.println("Value 1: ");
        double val1 = input.nextDouble();
        System.out.println("Value 2: ");
        double val2 = input.nextDouble();
        System.out.println("Value 3: ");
        double val3 = input.nextDouble();
        System.out.println("Value 4: ");
        double val4 = input.nextDouble();
        double total = 0;
        total += val1;
        total += val2;
        total += val3;
        total += val4;
        double ave = (total)/4;
        System.out.println("Average = "+ave);
    }
}
