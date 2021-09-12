package com.assignments;

import java.util.Scanner;

public class Basic14VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of cone: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double Cone = (Math.PI*r*r*h)/3f;
        System.out.println("The volume of cone of radius "+r+" and height "+h+" is = "+Cone);
    }
}
