package com.assignments;

import java.util.Scanner;

public class Basic19CSAOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of Cylinder: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double Cylinder = 2*Math.PI*r*h;
        System.out.println("CSA of Cylinder with radius "+r+" and height "+h+" = "+Cylinder);
    }
}
