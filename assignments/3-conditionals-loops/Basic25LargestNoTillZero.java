package com.assignments;

import java.util.Scanner;

public class Basic25LargestNoTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number below:-");
        int num = sc.nextInt();
        int big = 0;
        System.out.println("Now enter other numbers to compare:-");
        while (num != 0) {
            big = num>big?num:big;
            int n = sc.nextInt();
            num=n;
        }
        System.out.println("The greatest number is "+big);
    }
}
