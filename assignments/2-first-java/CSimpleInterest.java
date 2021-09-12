package com.assignments;

import java.util.Scanner;

public class CSimpleInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Principal, Interest, Time: ");
        int P = scn.nextInt();
        int R = scn.nextInt();
        int T = scn.nextInt();
        float SI = (P*R*T)/100;
        System.out.println("The Simple Interest is "+SI);
    }
}
