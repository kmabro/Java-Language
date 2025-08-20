package com.company;

import java.util.Scanner;

public class cwh_25_ps5_pr9 {
    public static void main(String[] args) {

        //Question 9
        //Java program to calculate the sum of numbers accuring  in the multipilication table of 8
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number");
//        int n= sc.nextInt();
         int n= 8;
        int sum = 0;

        for(int i= 1; i<=10; i++){
           sum= sum+i*n;

        }
        System.out.println(sum);
    }
}
