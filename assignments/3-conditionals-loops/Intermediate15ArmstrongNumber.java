package com.assignments;

import java.util.Scanner;

public class Intermediate15ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp=n,digit_count=0,last=0,sum=0;
        while (temp>0){ //while loop to get digit count
            temp/=10;
            digit_count++;
        }
//        System.out.println(digit_count);
        temp = n;
        while (temp>0){
            last=temp%10; //getting a digit
//            System.out.println(last);
            sum+=Math.pow(last,digit_count); //adding as + lastDigit^number_of_digits
            temp/=10; //for adding next digit
        }
        if (sum==n){
            System.out.println("The number "+n+" is Armstrong number");
        }
        else{
            System.out.println("The number "+n+" is not an Armstrong number");
        }


    }
}
