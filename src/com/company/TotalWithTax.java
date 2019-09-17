package com.company;
import java.util.Scanner;
public class TotalWithTax {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the tax rate.");
        final double TAXRATE = input.nextDouble();
        double price,tax,total;
        System.out.println("Please enter the price.");
        price =input.nextDouble();
        tax = TAXRATE*price;
        total = price + tax;
        System.out.println("Price: $"+ price);
        System.out.println("Sales Tax: $"+ tax);
        System.out.println("Total: $"+ total);
    }
}
