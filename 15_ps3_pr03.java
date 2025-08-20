package com.company;

public class cwh_15_ps3_pr03 {
    public static void main(String[] args) {

        //Question 3
        //Java program to fill in a letter template

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", " Khan Muhammad");
        System.out.println(letter);

    }
}
