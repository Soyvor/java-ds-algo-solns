package com.assignments;

import java.util.Scanner;

public class Functions09Factorial {
    static void fact(int num){
        int result = 1;
        System.out.print(num+"! = ");
        for (int i=num;i>=1;i--){
            result*=i;
            if (i!=1)
                System.out.print(i+" * ");
            else
                System.out.print(i+" = ");
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        fact(num);
    }
}
