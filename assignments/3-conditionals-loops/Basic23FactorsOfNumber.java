package com.assignments;

import java.util.Scanner;

public class Basic23FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int num = sc.nextInt();

        System.out.println("Factors of number "+num+" are:-");

        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+" ");
            }
        }

       /* for (int i=num;i>=1;i--){
            if (num%i==0){
                System.out.print(i+" ");
            }
        }*/
    }
}
