package com.assignments;

import java.util.Scanner;

public class Basic1AreaOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        float r = scn.nextFloat();
        float circle = (float) (r*r*(Math.PI));
        System.out.println("The area of circle of radius "+r+" = "+circle);

    }
}
