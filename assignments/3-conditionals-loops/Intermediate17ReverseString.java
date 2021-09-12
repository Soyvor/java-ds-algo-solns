package com.assignments;

import java.util.Scanner;

public class Intermediate17ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n=str.length();
        String reverse = null;
        for (int i=0;i<n;i++){
            reverse=reverse.concat(Character.toString(str.charAt(i)));
        }
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+reverse);
    }
}