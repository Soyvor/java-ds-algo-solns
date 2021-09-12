package com.assignments;

import java.util.Scanner;

public class Basic20TSAOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side of cube: ");
        int a = sc.nextInt();
        double tsa_cube = 6*a*a;
        System.out.println("TSA of cube with side length "+a+" = "+tsa_cube);
    }
}
