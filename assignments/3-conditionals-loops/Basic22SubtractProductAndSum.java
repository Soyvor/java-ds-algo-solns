package com.assignments;

import java.util.Scanner;

public class Basic22SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int a = sc.nextInt();
        int length = String.valueOf(a).length();
        int sum=0;
        int product=1;
        for (int i=0;i<length;i++){
            sum+=(a%10);
            product*=(a%10);
            a/=10;
        }
        int result = product - sum;
        System.out.println(result);
    }
}
