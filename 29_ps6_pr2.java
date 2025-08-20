package com.company;

public class cwh_29_ps6_pr2 {
    public static void main(String[] args) {

        //Question 2
        //Java program to find out whether a given integer is present in an array or not


        float[] numbers = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false ;
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
    }
}
