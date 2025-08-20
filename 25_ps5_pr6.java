package com.company;
import java.util.Scanner;
public class cwh_25_ps5_pr6 {
    public static void main(String[] args) {

        //Question 6
        // Factorial using while loop


       // int n =5;

      //  what is factorial --> n = n*n-1*n-2......
        // 5! = 5*4*3*2*1
//
//        int i= 1;
//        int factorial =1;
//        while(i<=n){
//        factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to calculate factorial: ");
        int n= sc.nextInt();
        int fact =1;
        int i=1;
        while(i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);


    }
}
