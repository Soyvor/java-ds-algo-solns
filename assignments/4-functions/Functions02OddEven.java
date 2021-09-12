package com.assignments;

import java.util.Scanner;

public class Functions02OddEven {
    static String OddEven(int num){
        if (num%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = OddEven(num);
        System.out.println("The number "+num+" is "+result);
    }
}
