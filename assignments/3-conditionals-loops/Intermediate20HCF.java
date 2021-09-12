package com.assignments;

import java.util.Scanner;

public class Intermediate20HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a < b ? a : b;
        int HCF = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                HCF = i;
            }
        }
        System.out.println("The HCF of " + a + " and " + b + " = " + HCF);
    }
}
