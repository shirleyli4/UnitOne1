package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number please!");
        double decinum = input.nextDouble();
        double after =((int) ((decinum - (int)decinum)*10+0.5))/10;
        System.out.println(decinum+" rounded to the nearest tenth is "+ after);
    }
}
