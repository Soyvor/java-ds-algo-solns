package com.assignments;

import java.util.Scanner;

public class BGreetName {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scn.next();
        System.out.println("Hello there "+name);
    }
}
