package com.assignments;

import java.util.Scanner;

public class Functions01MinMax {
    static void minMax(int a,int b, int c){
        int max = a>b?Math.max(a,c):Math.max(b,c);
        int min = a<b?Math.min(a,c):Math.min(b,c);
        System.out.println("Greatest of "+a+","+b+","+c+" = "+max);
        System.out.println("Smallest of "+a+","+b+","+c+" = "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        minMax(num1,num2,num3);

    }

}
