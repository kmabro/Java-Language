package com.company;
import java.util.Scanner;

public class cwh_19_ps4_pr02 {
    public static void main(String[] args) {

        //Question 2
        //Java program to check whether student is Pass or Fail 33% is required in each subject
        //and average of three subjects should be greater than 40%
        //Assume three subjects and take marks as input from a user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in C++: ");
        int Cpp = sc.nextInt();
        System.out.println("Enter your marks in EDC: ");
        int EDC = sc.nextInt();
        System.out.println("Enter your marks in LCA: ");
        int LCA = sc.nextInt();

        float avg = Cpp+EDC+LCA/3.0f;


        if(avg>=40 && Cpp>=33 && EDC>= 33 && LCA>=33 ){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
        }

    }
}
