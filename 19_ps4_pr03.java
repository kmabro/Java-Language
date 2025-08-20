package com.company;
import java.util.Scanner;
public class cwh_19_ps4_pr03 {
    public static void main(String[] args) {

        //Question 3
        //Calculate income tax paid by an employee to the government as per the slabs mentioned below
        //below 2.5 there is no tax

//        Income sale       tax
//        2.5L - 5.0L         5%
//        5.0L - 10.0L        20%
//        Above 10.0L         30%


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        float tax =0;
        float income = sc.nextFloat();
        if(income<= 2.5){
            tax = tax + 0;
        }
       else if(income>2.5f && income <= 5.0f){
            tax = tax+ 0.05f *(income - 2.5f);
        }
       else if(income>5.0f && income <= 10.0f){
            tax = tax+ 0.05f *(5.0f - 2.5f);
            tax = tax+ 0.2f *(income - 5.0f);
        }
        else if(income>10.0f){
            tax = tax+ 0.05f *(5.0f - 2.5f);
            tax = tax+ 0.2f *(10.0f - 5f);
            tax = tax+ 0.3f *(income - 10.0f);
        }
        System.out.println("Total tax paid by the employee is: "+tax);


    }
}
