package com.assignments;

import java.util.Scanner;

public class Basic10PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter both sides of Parallelogram: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The perimeter of parallelogram of sides "+a+" and "+b+" = "+2*(a+b));
    }
}
