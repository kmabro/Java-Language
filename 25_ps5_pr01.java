package com.company;

public class cwh_25_ps5_pr01 {
    public static void main(String[] args) {

        //Question 1
        // Print the following
//        ****
//        ***
//        **
//        *
//
//        int n = 4;
//        for(int i= n; i>0; i--){
//            for (int j=0; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//
//        }

//
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        int row=4;
//        for(int i=0; i<row; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }


        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
