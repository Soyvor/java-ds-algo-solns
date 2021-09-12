package com.assignments;

import java.util.Scanner;

public class Intermediate19FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value, interest rate and time of investment: ");
        int presentAmt = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();
        double finalAmt = (presentAmt*(1+(rate*time)));
        System.out.println("the final value of an investment of Rs."+presentAmt+"/- with interest rate "+rate+"% after "+time+" years = "+finalAmt);
    }
}
