package com.assignments;

import java.util.Scanner;

public class Intermediate14SumOfNNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();
        int num,sum=0;
        System.out.println("Enter n nos. below: ");
        for (int i=0;i<n;i++){
            num = sc.nextInt();
            sum+=num;
        }
        System.out.println("the sum of "+n+" numbers = "+sum);
    }
}
