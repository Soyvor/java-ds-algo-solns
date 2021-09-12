package com.assignments;

import java.util.Scanner;

public class Basic16VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of cylinder: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double cylinder = Math.PI*r*r*h;
        System.out.println("The volume of cylinder of radius "+r+" and height "+h+" = "+cylinder);
    }
}
