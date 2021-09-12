package com.assignments;

import java.util.Scanner;

public class Intermediate22VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char c = sc.next().charAt(0);
        if (c>='A'&&c<='Z'){
            c+=32;   //convert to lowercase in case it's in CAPS
        }
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println(c+" is a Vowel");
        }
        else {
            System.out.println(c+" is a Consonant");
        }
    }
}
