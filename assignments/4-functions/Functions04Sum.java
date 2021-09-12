package com.assignments;

import java.util.Scanner;

public class Functions04Sum {
    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = sum(num1,num2);
        System.out.println(num1+" + "+num2+" = "+sum);
    }
}
