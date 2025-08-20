package com.company;
import java.util.Scanner;
public class cwh_12_ps2_pr03 {
    public static void main(String[] args) {
        //Question 3
        // USe comparison operator to find out whether a assign number is greater than the user entered number or not

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        System.out.println(a>10);
    }
}
