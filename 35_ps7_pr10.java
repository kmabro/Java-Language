package com.company;

public class cwh_35_ps7_pr10 {
    static int sumIter(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        //Question 10
        //Repeat question 3 using iterative approach


        int c = sumIter(4);
        System.out.println(c);
    }
}


