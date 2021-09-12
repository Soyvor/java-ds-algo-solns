package com.assignments;

import java.util.Scanner;

public class Basic12PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        int a = sc.nextInt();
        System.out.println("The area of Square of side "+a+" = "+a*a);
    }
}
