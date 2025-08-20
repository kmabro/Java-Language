package com.company;

public class cwh_35_ps7_pr2 {
//    static void pattern1( int n){
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    static void fig1(){

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        //Question 2
        // Java program using function to print :

        /*

        *
        **
        ***
        ****

         */

//       pattern1(4);


        fig1();

    }
}

