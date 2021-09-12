package com.assignments;

import java.util.Scanner;

public class Functions06Circle {
    static void circumference(int r){
        System.out.println("The circumference of circle with radius "+r+" = "+2*Math.PI*r);
    }
    static void area(int r){
        System.out.println("The area of circle with radius "+r+" = "+Math.PI*Math.pow(r,2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        circumference(r);
        area(r);

    }

}
