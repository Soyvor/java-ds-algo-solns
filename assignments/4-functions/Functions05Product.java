package com.assignments;

import java.util.Scanner;

public class Functions05Product {
    static int product(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int product = product(num1,num2);
        System.out.println(num1+" x "+num2+" = "+product);
    }
}
