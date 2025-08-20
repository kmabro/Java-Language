package com.company;
import java.util.Scanner;

public class cwh_19_ps4_pr05 {
    public static void main(String[] args) {

        // Question 5
        // Java program to find whether a year entered by user is leap year pr not

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year to find whether a year is leap or not");
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println(year +" is a Leap year");
        }
        else if(year % 4 == 0 && year % 100 !=0){
            System.out.println(year +" is a Leap year");
        }
        else{
            System.out.println(year +" is not a Leap year");
        }

    }
}
