package com.assignments;

import java.util.Scanner;

public class Functions08Marks {
    static String checkGrade(int score){
        String grade=null;
        if (score>90&&score<=100){
            grade = "AA";
        }
        else if(score>80&&score<=90){
            grade = "AB";
        }
        else if(score>70&&score<=80){
            grade = "BB";
        }
        else if(score>60&&score<=70){
            grade = "BC";
        }
        else if(score>50&&score<=60){
            grade = "CD";
        }
        else if(score>40&&score<=50){
            grade = "DD";
        }
        else{
            grade = "Fail";
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        System.out.println("Your grade is: "+checkGrade(marks));
    }
}
