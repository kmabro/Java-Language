package com.company;

public class cwh_33_ch7_variable_arguments {
//    static int sum(int a, int b){
//        return a+b;
//    }
//
//    static int sum(int a, int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b,int c, int d){
//        return a+b+c+d;
//    }

    static int sum(int x, int ...arr){
      //Available as  int [] arr;
        int result = x;
        for(int a: arr){
            result += +a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("welcome");
        System.out.println(sum(4,5));
        System.out.println(sum(4,5, 6));
        System.out.println(sum(4,5, 6,7));
      //  System.out.println(sum());
    }
}
