package com.company;

public class cwh_35_ps7_pr5 {
    static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {

        // Question 5
        // Java program to find nth term of fibonacci series

        int result = fib(7);
        System.out.println(result);
    }
}
