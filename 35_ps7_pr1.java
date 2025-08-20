package com.company;
import java.util.Scanner;

public class cwh_35_ps7_pr1 {
    static void multiply(int n){
        for(int i=1; i<=10; i++){ //{
            System.out.format("%d X %d = %d\n", n,i,n*i);
        }
//            System.out.println(n +" X "+ i+ " = " + n*i);
//        }

    }
    public static void main(String[] args) {

        //Question 1
        // Java method to print multiplication table

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print multiplication table: ");
       int n=  sc.nextInt();
        multiply(n);


    }
}
