package com.company;

import java.util.Scanner;

public class cwh_25_ps5_pr02 {
    public static void main(String[] args) {

        //Question 2
        //Java program to sum first n even numbers using For loop
//
//        int sum =0;
//        int n=4;
//        for(int i=0; i<n; i++){
//            sum = sum+(2*i);
//        }
//
//        System.out.println("Sum of even numbers is "+ sum);


        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter a number to calculate sum: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
        System.out.println("sum is: " + sum);
//
//        int i= 0;
//        while (i<=n){
//            sum = sum+(2*n);
//            i++;
//
//        }
//        System.out.println(sum);


    }
}
