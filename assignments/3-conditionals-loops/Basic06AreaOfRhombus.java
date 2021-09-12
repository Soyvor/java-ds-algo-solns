package com.assignments;

import java.util.Scanner;

public class Basic6AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of both the diagonals of Rhombus: ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        float Rhombus = (d1*d2)/2f;
        System.out.println("The are of rhombus with diagonals "+d1+" and "+d2+" = "+Rhombus);
    }
}
