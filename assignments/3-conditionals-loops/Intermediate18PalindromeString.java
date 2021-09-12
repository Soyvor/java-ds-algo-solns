package com.assignments;

import java.util.Scanner;

public class Intermediate18PalindromeString {
    static String reverse(String str, int n){
        String reverse = null;
        for (int i=0;i<n;i++){
            reverse=reverse.concat(Character.toString(str.charAt(i)));
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();
        String rev = reverse(str,n);
        int palindrome = 1;
        for (int i=0;i<n;i++){
            if (str.charAt(i)==rev.charAt(n-1-i)){
                continue;
            }
            else{
                palindrome = 0;
                break;
            }
        }
        if (palindrome==1){
            System.out.println("String '"+str+"' is a palindrome");
        }
        else{
            System.out.println("String '"+str+"' is not palindrome");
        }
    }
}
