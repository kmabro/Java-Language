package com.company;

public class cwh_32_ch7_method_overloading {
    static void foo(){
        System.out.println("Good morning bro! ");
    }
    static void foo(int a){
        System.out.println("Good morning "+a+" bro! ");

    }
    static void foo(int a, int b){
        System.out.println("Good morning "+a+" bro! ");
        System.out.println("Good morning "+b+" bro! ");

    }

    static void km(){
        System.out.println("Hahaha who am i");
    }

    static void change(int a){
        a= 98;
    }
    static void change2(int[] arr){
        arr[0]= 98;
    }


    public static void main(String[] args) {

       // km();


        // Case - I Changing the integer
//        int x= 45;
//        change(x);
//        System.out.println("The value of x after running change is -->> "+ x);


//        Case - II Changing the Array
//        int[] marks = { 52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The value of x after running change is -->> "+ marks[0]);


        // Method Overloading

        foo();
        foo(3000);
        foo(3000, 4000);
        //Arguments are actual! 3000, 4000  & a and b are parameters
    }
}
