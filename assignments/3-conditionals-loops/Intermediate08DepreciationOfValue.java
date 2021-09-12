package com.assignments;

import java.util.Scanner;

public class Intermediate8DepreciationOfValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price and age of your car in years: ");
        int price = sc.nextInt();
        float age = sc.nextFloat();
        int dep_rate = 0;
        if (age<=0.5){
            dep_rate = 5;
        }
        else if (age>0.5 && age<=1){
            dep_rate = 15;
        }
        else if (age>1 && age<=2){
            dep_rate = 20;
        }
        else if (age>2 && age<=3){
            dep_rate = 30;
        }
        else if (age>3 && age<=4){
            dep_rate = 40;
        }
        else if (age>4 && age<=5){
            dep_rate = 50;
        }
        else{
            dep_rate = 60;
        }
        int final_price = price - (price*dep_rate/100);
        System.out.println("The price "+price+" after depreciation of Car "+age+" years later is at "+dep_rate+"% and has value = "+price+" - "+price*dep_rate/100f+" = "+final_price);



    }
}
