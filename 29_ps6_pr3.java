package com.company;

public class cwh_29_ps6_pr3 {
    public static void main(String[] args) {

        //Question 3
        //Calculate the average marks from an array containing marks of
        //all students in Physics using for-each loop

        float [ ] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element : marks){
            sum = sum+ element;
       }
       System.out.println("The value of average marks is: " + sum/ marks.length);


    }
}
