package com.assignments;

import java.util.Scanner;

public class Basic9PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Equilateral Triangle: ");
        int a = sc.nextInt();
        System.out.println("The Perimeter of Equilateral Triangle with side "+a+" = "+3*a);
    }
}
