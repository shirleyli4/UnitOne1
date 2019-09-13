package com.company;
import java.util.Scanner;
public class Painting1 {
    public static void main (String[] args){
        final int canCover = 350; //1 gallon
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the length of your room.");
        double length = input.nextDouble();
        System.out.println("Please enter the width of your room.");
        double width = input.nextDouble();
        System.out.println("Please enter the height of your room.");
        double height = input.nextDouble();
        int numDoor = 2;
        int numWindow = 4;
        int areaDoor = 20;
        int areaWindow = 15;
        double surfaceRoom = length*width + 2*length*height + 2*width*height;
        int areaRoomWindows = numDoor*areaDoor + numWindow*areaWindow;
        double totalArea = surfaceRoom - areaRoomWindows;
        double neededPaint = totalArea/canCover;
        double determine = totalArea%canCover;
        if (determine != 0){
            neededPaint = (int)neededPaint +1;
        }
        System.out.println("Hi! You will need "+ neededPaint+ " gallon to cover your room.");
        System.out.println("Have a nice day!");

    }
}
