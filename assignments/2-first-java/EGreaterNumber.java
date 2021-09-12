package com.assignments;

import java.util.Scanner;

public class EGreaterNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int max = a>b?a:b;
        int min = a<b?a:b;
        System.out.println(max + " is greater than " + min);
    }
}
