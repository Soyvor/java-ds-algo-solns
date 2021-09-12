package com.assignments;

import java.util.Scanner;

public class Intermediate11CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal P, Rate R(in %), Time T(in years): ");
        int P = sc.nextInt();
        float R = sc.nextFloat();
        int T  = sc.nextInt();
        int n=1;
        System.out.println("Please select one of the following options: ");
        System.out.println("1. compounded annually");
        System.out.println("2. compounded quarterly");
        System.out.println("3. compounded monthly");
        System.out.print("Write your choice number here: ");
        int choice = sc.nextInt();
        String comp = null;
        switch (choice){
            case 1:
                n = 1;
                comp = "annually";
                break;
            case 2:
                n = 3;
                comp = "quarterly";
                break;
            case 3:
                n = 12;
                comp = "monthly";
                break;
            default:
                System.out.println("ERROR: invalid case");
                System.exit(0);
        }
        double Amt = P*Math.pow((1+(R/(100*n))),(T*n));

        System.out.println("The amount of Principal "+P+" after "+T+" years at interest rate "+R+" = "+Amt);



    }
}
