package com.company;

public class cwh_29_ps6_pr8 {
    public static void main(String[] args) {

        //Question  8
        //find whether array is sorted or not.

        boolean isSorted = true;
        int[] arr = {700, 250, 400, 2100, 300, 100};
        for(int i =0; i<arr.length-1; i++){
           if( arr[i]>arr[i+1]){
               isSorted = false;
               break;
           }
        }
        if(isSorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }

    }
}
