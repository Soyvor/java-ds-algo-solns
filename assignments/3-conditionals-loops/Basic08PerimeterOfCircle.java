package com.assignments;

import java.util.Scanner;

public class Basic8PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        System.out.println("The area of circle with Radius "+r+" = "+(2*Math.PI*r));
    }
}
