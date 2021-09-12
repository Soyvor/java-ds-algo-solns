package com.assignments;

import java.util.Scanner;

public class Basic4AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base of this triangle(The unequal side) and then the height of the triangle: ");
        int b = scn.nextInt();
        int h = scn.nextInt();
        float IsoTriangle = (b*h)/2f;
        System.out.println("The area of Isosceles Triangle with base "+b+" and height "+h+" = "+IsoTriangle);
    }
}
