package com.assignments;

import java.util.Scanner;

public class Intermediate13SumOf2Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+a+"+"+b+" = "+sum);
    }
}
