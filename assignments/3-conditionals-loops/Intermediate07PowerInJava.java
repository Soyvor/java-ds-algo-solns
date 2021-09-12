package com.assignments;

import java.util.Scanner;

public class Intermediate7PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponential power: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double power = Math.pow(a,b);
        System.out.println("The value of "+a+" to the power "+b+" = "+power);
    }


}
