package com.assignments;

import java.util.Scanner;

public class Intermediate21LCM {
    static  int HCF(int a,int b){
        int min = a < b ? a : b;
        int HCF = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                HCF = i;
            }
        }
        return HCF;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = HCF(a,b);
        int lcm = a*b/hcf;
        System.out.println("the lcm of "+a+" and "+b+" = "+lcm);
    }
}
