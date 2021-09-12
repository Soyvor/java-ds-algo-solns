package com.assignments;

import java.util.Scanner;

public class DSimpleCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers ka Operation: ");
        int num1 = scn.nextInt();
        char operator = scn.next().charAt(0);
        int num2 = scn.nextInt();
        if (operator == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Invalid operation");
        }

    }
}
