package com.assignments;

import java.util.Scanner;

public class Basic15VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of base and height of Prism: ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int H = sc.nextInt();
        double Prism = (b*h*H)/2f;
        System.out.println("The volume of cone of dimensions "+b+" "+h+" and height "+H+" is = "+Prism);
    }
}
