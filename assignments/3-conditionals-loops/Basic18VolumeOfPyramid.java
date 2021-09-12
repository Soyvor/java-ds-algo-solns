package com.assignments;

import java.util.Scanner;

public class Basic18VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, width and height of Pyramid: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        double Pyramid = l*b*h/3;
        System.out.println("Volume of Pyramid with length "+l+" width "+b+" height "+h+" = "+Pyramid);
    }
}
