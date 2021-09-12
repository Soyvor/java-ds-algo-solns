package com.assignments;

import java.util.Scanner;

public class Basic13PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Rhombus: ");
        int a = sc.nextInt();
        System.out.println("The area of Rhombus of side "+a+" = "+a*a);
    }
}
