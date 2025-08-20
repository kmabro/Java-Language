package com.company;

public class cwh_35_ps7_pr7 {
    static void fig1(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            fig1(n - 1);
        }
    }

    public static void main(String[] args) {

        //Question 7
        //Repeat question 4 using recursion

        fig1(7); // Pass the number of rows as argument
    }
}





