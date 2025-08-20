package com.company;

public class cwh_29_ps6_pr6 {
    public static void main(String[] args) {

        //Question 6
        //Find maximum element in an array

        int []  arr= {1,2,3,4,5,6};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
