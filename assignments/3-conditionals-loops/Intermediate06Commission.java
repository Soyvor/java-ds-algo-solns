package com.assignments;

import java.util.Scanner;

public class Intermediate6Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 1000;
        System.out.print("Enter number of policies sold: ");
        int n = sc.nextInt();
        int total = n*price;
        int commission = total>=100000?total*20/100:total>=50000?total*10/100:total*5/100;
        System.out.println("The commission you get after selling "+n+" number of policies for Rs."+price+" = Rs."+commission);
    }
}
