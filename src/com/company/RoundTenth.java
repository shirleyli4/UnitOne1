package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number please!");
        double decinum = input.nextDouble();
        double after =(int) ((decinum - (int)decinum)*10+0.5);
        double afterafter = after/10;
        double decinum1 =(int)(decinum)+afterafter;
        System.out.println(decinum+" rounded to the nearest tenth is "+ decinum1);


    }
}
