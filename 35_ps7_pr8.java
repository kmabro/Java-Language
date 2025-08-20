package com.company;

public class cwh_35_ps7_pr8 {
    static void fig1(int n) {
        if (n > 0) {
            fig1(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Question 8
        //Repeat question 2 using recursion

       fig1(7);
    }
}
