package com.assignments;

import java.util.Scanner;

public class Intermediate23PerfectNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            int sum=0;
            for (int i=1;i<num;i++){
                if (num%i==0){
                    sum+=i; //if number is divisible, it is a factor, we add such factors to sum one-by-one
                }
            }
            if (sum==num){
                System.out.println("The number "+num+" is a perfect number.");
            }
            else{
                System.out.println("The number "+num+" is not a perfect number.");
            }
    }
}
