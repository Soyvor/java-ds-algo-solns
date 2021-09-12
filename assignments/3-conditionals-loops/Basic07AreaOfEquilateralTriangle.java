package com.assignments;

import java.util.Scanner;

public class Basic7AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side of Equilateral Triangle: ");
        int a = sc.nextInt();
        double EqTriangle = ((Math.sqrt(3)*a*a)/4f);
        System.out.println("Area of EquilateralTriangle with side "+a+" = "+EqTriangle);
    }
}
