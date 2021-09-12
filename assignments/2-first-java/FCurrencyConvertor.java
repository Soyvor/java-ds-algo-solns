package com.assignments;

import java.util.Scanner;

public class FCurrencyConvertor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Money in INR: ");
        int INR = scn.nextInt();
        int USD = INR*80;
        System.out.println("The value of "+INR+" Rs. in USD is = "+USD);
    }
}
