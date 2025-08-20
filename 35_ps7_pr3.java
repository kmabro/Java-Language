package com.company;

public class cwh_35_ps7_pr3 {
    static int sumRec(int n ){
        if(n==1){
            return 1;
        }
        else{
            return n+sumRec(n-1);
        }

    }
    public static void main(String[] args) {

        //Question 3
        // Write a recursive function to calculate the sum of first n natural numbers.

        int c = sumRec(4);
        System.out.println(c);


    }
}
