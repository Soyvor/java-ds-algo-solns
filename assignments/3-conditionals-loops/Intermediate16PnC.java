package com.assignments;

import java.util.Scanner;


public class Intermediate16PnC {
    static int Factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact ;
    }
    static double nPr(int n, int r){
        int result = Factorial(n)/(Factorial(n-r));
        return result;
    }
    static double nCr(int n, int r){
        int result = Factorial(n)/(Factorial(r)*Factorial(n-r));
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        double NPR = nPr(n,r);
        double NCR = nCr(n,r);
        System.out.println("NPR = "+NPR);
        System.out.println("NCR = "+NCR);
    }
}
