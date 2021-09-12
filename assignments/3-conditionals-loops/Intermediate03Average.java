package com.assignments;

import java.util.Scanner;

public class Intermediate3Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers you want to input: ");
        int n = sc.nextInt();
        int sum=0;
        System.out.println("Enter the list of Integers: ");
        for (int i=1;i<=n;i++){
            int num=sc.nextInt();
            sum+=num;
        }
        System.out.print("The average of "+n+" numbers is = "+sum/n);
    }
}
