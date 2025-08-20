package com.company;

public class cwh_12_ps2_pr02 {
    public static void main(String[] args) {

        //Question 2
        // write a java program for grade and add 8 to it and then show the correct grade

        char grade = 'B';
        grade = (char) (grade+8);
        System.out.println(grade);

        //Decrypting the grade
        grade = (char) (grade-8);
        System.out.println(grade);
    }
}
