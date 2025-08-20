package com.company;
import java.util.Scanner;
public class cwh_25_ps5_pr5 {
    public static void main(String[] args) {

        //Question 5
        //// Factorial using For loop
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to calculate factorial: ");
        int n= sc.nextInt();
        int fact =1;
        for(int i=1; i<=n; i++){
            fact = fact*i;

        }

        System.out.println(fact);


//        int n=5;
//         int i=1;
//        int fact =1;
//        for(i=1;i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+n+" is: "+fact);



}
}
