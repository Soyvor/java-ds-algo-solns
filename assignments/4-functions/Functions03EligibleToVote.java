package com.assignments;

import java.util.Scanner;

public class Functions03EligibleToVote {
    static void AgeCheck(int age){
        if (age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        AgeCheck(age);
    }
}
