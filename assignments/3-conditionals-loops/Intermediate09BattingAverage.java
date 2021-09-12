package com.assignments;

import java.util.Scanner;

public class Intermediate9BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of runs and no.of times you have been out: ");
        int runs = sc.nextInt();
        int out = sc.nextInt();
        double battingAverage = runs/out;
        System.out.println("Your batting average is = "+battingAverage);
    }
}
