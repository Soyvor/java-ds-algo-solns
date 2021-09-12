package com.assignments;

import java.util.Scanner;

public class Basic3AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of your Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The area of Rectangle with length "+l+" width "+b+" = "+(l*b));

    }
}
