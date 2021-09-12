package com.assignments;

import java.util.Scanner;

public class Intermediate26KunalPermission {
    static void checkPermission(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of month: ");
        int date = sc.nextInt();
        for (int i=1;i<=31;i++){
            if (date<=31){
                if(date%2==0){
                    System.out.println("Kunal can go out on "+date+"-08-2021");
                }
                else{
                    System.out.println("Kunal can not go out on "+date+"-08-2021");
                }
                break;
            }
            else{
                System.out.println("invalid date");
                checkPermission();
            }
        }
    }
    public static void main(String[] args) {
        checkPermission();
    }
}
