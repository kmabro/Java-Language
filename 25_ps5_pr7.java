package com.company;

public class cwh_25_ps5_pr7 {
    public static void main(String[] args) {

        //Question 7
        // Print the following using while loop
//        ****
//        ***
//        **
//        *
                int rows = 4; // Number of rows in the pattern

                // Initialize variables
                int i = rows;

                // Loop until i becomes 0
                while (i > 0) {
                    // Inner loop to print asterisks
                    int j = i;
                    while (j > 0) {
                        System.out.print("*");
                        j--;
                    }
                    System.out.println(); // Move to the next line after each row
                    i--; // Decrement i for the next row
                }
            }
        }

