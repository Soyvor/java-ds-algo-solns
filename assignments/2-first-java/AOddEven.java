package com.assignments;

import java.util.Scanner;

public class AOddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        if (num%2==0){
            System.out.println(num + " is an Even Number");
        }
        else{
            System.out.println(num + " is an Odd Number");
        }
    }
}
