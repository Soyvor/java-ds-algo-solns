package com.assignments;

import java.util.Scanner;

public class Functions14SumOfNaturalNos {
    static int naturalSum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = naturalSum(num);
        System.out.println("The sum of "+num+" natural numbers = "+sum);
    }
}
