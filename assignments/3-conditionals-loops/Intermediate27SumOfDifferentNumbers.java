package com.assignments;

import java.util.Scanner;

public class Intermediate27SumOfDifferentNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of numbers:");
        int num = 1;
        int sumNegative=0, sumOdd=0, sumEven=0;
        while (num!=0){
            num = sc.nextInt();
            if (num>0){
                if (num%2==0){
                    sumEven+=num;
                }
                else{
                    sumOdd+=num;
                }

            }
            else{
                sumNegative+=num;
            }
        }
        System.out.println("Sum of Odd +ve integers is = "+sumOdd);
        System.out.println("Sum of Even +ve integers is = "+sumEven);
        System.out.println("Sum of -ve integers is = "+sumNegative);
    }
}
