package com.company;
import java.util.Scanner;
public class Painting {
    public static void main (String[] args){
        final int canCover = 350; //1 gallon
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the length of your room.");
        int length = input.nextInt();
        System.out.println("Please enter the width of your room.");
        int width = input.nextInt();
        System.out.println("Please enter the height of your room.");
        int height = input.nextInt();
        int numDoor = 2;
        int numWindow = 4;
        int areaDoor = 20;
        int areaWindow = 15;
        int surfaceRoom = length*width + 2*length*height + 2*width*height;
        int areaRoomWindows = numDoor*areaDoor + numWindow*areaWindow;
        int totalArea = surfaceRoom - areaRoomWindows;
        int neededPaint = totalArea/canCover;
        int determine = totalArea%canCover;
        if (determine != 0){
            neededPaint = neededPaint +1;
        }
        System.out.println("Hi! You will need "+ neededPaint+ " gallon to cover your room.");
        System.out.println("Have a nice day!");

    }
}
