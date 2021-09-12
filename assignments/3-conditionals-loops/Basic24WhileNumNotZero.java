package com.assignments;

import java.util.Scanner;

public class Basic24WhileNumNotZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers below:-");
        int num= sc.nextInt();
        int sum=0;
        while (num!=0){
            sum+=num;
            int n= sc.nextInt();
            num=n;
        }
        System.out.println("The sum of all numbers is "+sum);
    }
}
