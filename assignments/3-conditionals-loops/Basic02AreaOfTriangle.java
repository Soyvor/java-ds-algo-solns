package com.assignments;

import java.util.Scanner;

public class Basic2AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the three sides of Triangle: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        float s = (a+b+c)/2;
        double Triangle = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of Triangle with sides "+a+" "+b+" "+c+" = "+Triangle);
    }
}
