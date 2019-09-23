/*Shirley Shuzhou Li, 9/23/19
this program's input is how many cents
the output is how many dollar, quaters, dime, nickels, and pennies
 */
package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int dollar;
        int quater;
        int dime;
        int nickel;
        int penny;
        System.out.println("Please enter a whole number of cents: ");
        int cent = input.nextInt();
        dollar = cent/100;//how many dollar
        int dollarRem = cent%100; // the left over cents after the dollar divisiom
        quater = dollarRem/25;//how many quater
        int quaterRem = dollarRem%25;//the leftover cents after the quater division
        dime = quaterRem/10;//how many dime
        int dimeRem = quaterRem%10;//the leftover cents after the dime division
        nickel = dimeRem/5;//how many dimes
        penny = dimeRem%5;//left over cents after the nickel division, so basically  the pennies
        System.out.println("You have " + dollar + " dollars, " + quater + " quater, " + dime + " dimes, " + nickel + " nickels, and " + penny + " pennies.");


    }
}
