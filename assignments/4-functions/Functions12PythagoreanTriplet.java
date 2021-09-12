package com.assignments;

import java.util.Scanner;

public class Functions12PythagoreanTriplet {
    static void tripletCheck(int num1, int num2, int num3){
        int max = num1>num2?Math.max(num1,num3):Math.max(num2,num3);
        int min = num1<num2?Math.min(num1,num3):Math.min(num2,num3);
        int mid = num1!=max&&num1!=min?num1:num2!=max&&num2!=min?num2:num3;

        if (max==Math.sqrt((Math.pow(min,2))+(Math.pow(mid,2)))){
            System.out.println("The numbers "+num1+","+num2+","+num3+" are a Pythagorean triplet");
        }
        else
            System.out.println("The numbers "+num1+","+num2+","+num3+" are not a Pythagorean triplet");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        tripletCheck(a,b,c);
    }

}
