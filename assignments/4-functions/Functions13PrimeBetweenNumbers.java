package com.assignments;

import java.util.Scanner;

public class Functions13PrimeBetweenNumbers {
    static void isPrime(int num){
        if (num==1){
            return;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return;
            }
        }
        System.out.println(num);
        return;
    }

    static void printPrimes(int a,int b){
        int max = a>b?a:b;
        int min = a<b?a:b;
        for (int i=min;i<=max;i++){
            isPrime(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        printPrimes(a,b);
    }
}
