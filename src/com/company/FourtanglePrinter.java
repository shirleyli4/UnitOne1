package com.company;

import java.awt.*;

public class FourtanglePrinter {
    public static void main (String[] args){
        Rectangle rec = new Rectangle(0,0,2,3);
        System.out.println(rec);
        rec.translate(2,0);
        System.out.println(rec);
        rec.translate(2,3);
        System.out.println(rec);
        rec.translate(0,3);
        System.out.println(rec);


        }
    }


