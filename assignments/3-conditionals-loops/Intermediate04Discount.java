package com.assignments;

import java.util.Scanner;

public class Intermediate4Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of Product: ");
        int price = sc.nextInt();
        int discount = price>=10000?30*price/100:price>=5000?15*price/100:10*price/100;
        int Final = price-discount;
        System.out.println("The value of Rs."+price+" after discount of Rs."+discount+" = Rs."+Final);
    }
}
