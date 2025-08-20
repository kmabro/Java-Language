package com.company;
import java.util.Scanner;
public class cwh_25_ps25_pr11 {
    public static void main(String[] args) {

    // Question 11
        //Java program to sum first n even numbers using while loop


                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter a number to calculate sum: ");
                int n = sc.nextInt();
                int sum = 0;
                int i = 0;

                while (i < n) {
                    sum = sum + (2 * i);
                    i++;
                }

                System.out.println("Sum is: " + sum);
            }
        }

