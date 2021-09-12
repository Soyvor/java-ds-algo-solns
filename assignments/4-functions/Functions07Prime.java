package com.assignments;

import java.util.Scanner;

public class Functions07Prime {
    static void isPrime(int num){
        if (num==1){
            System.out.println("The number "+num+" is not prime.");
            return;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                System.out.println("The number "+num+" is not prime.");
                return;
            }
        }
        System.out.println("The number "+num+" is prime.");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isPrime(num);
    }
}
