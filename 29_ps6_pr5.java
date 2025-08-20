package com.company;

import java.util.jar.JarOutputStream;

public class cwh_29_ps6_pr5 {
    public static void main(String[] args) {

        //Question 5
        //Java program to reverse an Array


        //Solved by me

        int [] marks = {1,2,3,4,5,6,7,8,9,10};
         for(int i=0; i<marks.length; i++){
             System.out.print(marks[i]+" ");
         }
        System.out.println();
         for(int i= 9; i>=0 ;i--){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();

//
//        int [] arr = {1,2,3,4,5,6};
//        int l =arr.length;
//       int n=  Math.floorDiv(arr.length,2);
//       int temp;
//        for(int i= 0; i<n; i++){
//            temp= arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element: arr){
//            System.out.print(element+ " ");
//        }







    }
}
