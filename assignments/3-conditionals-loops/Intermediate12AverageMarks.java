package com.assignments;

import java.util.Scanner;

public class Intermediate12AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int marks = 0,sum = 0;
        for (int i=1;i<=n;i++){
            System.out.print("Enter Marks for subject "+i+": ");
            marks = sc.nextInt();
            sum+=marks;
        }
        float average = (sum/n);
        System.out.println("The average is = "+average);
    }
}
