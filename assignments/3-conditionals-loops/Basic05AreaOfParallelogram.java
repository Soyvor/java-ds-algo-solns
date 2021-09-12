package com.assignments;

import java.util.Scanner;

public class Basic5AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and perpendicular height of parallelogram: ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("The area of parallelogram with base "+b+" and height "+h+" = "+(b*h));
    }


}
