package com.company;

public class cwh_29_ps6_pr1 {
    public static void main(String[] args) {

        //Question 1
        //create an array of 5 floats and calculate the sum

        float [ ] numbers = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);

//        for(float element : numbers){
//            sum = sum+ element;
//        }
//        System.out.println(sum);


    }
}
