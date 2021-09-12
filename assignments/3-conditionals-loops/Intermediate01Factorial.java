package com.assignments;

import java.util.Scanner;

public class Intermediate1Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("To find factorial, enter number n: ");
        int n = sc.nextInt();
        int fact=1;
        System.out.print("Factorial("+n+")= ");
        for (int i=n;i>=1;i--){
            fact*=i;
            if (i!=1)
                System.out.print(i+" x ");
            else
                System.out.print(i);
        }
        System.out.println(" = "+fact);

    }
}
