package com.assignments;

import java.util.Scanner;

public class Basic17VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Sphere: ");
        int r = sc.nextInt();
        double Sphere = 4*Math.PI*Math.pow(r,3)/3f;
        System.out.println("The volume of sphere with radius "+r+" = "+Sphere);
    }
}
