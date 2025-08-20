package com.company;
import java.util.Scanner;
public class cwh_18_ch4_else_if_and_switch {
    public static void main(String[] args) {
//        int age;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your age: ");
//        age = sc.nextInt();
//
//        switch (age) {
//            case 18:
//                System.out.println("You are going to become an adult");
//                break;
//            case 23:
//                System.out.println("You are going to join a job");
//                break;
//            case 60:
//                System.out.println("You are going to get retired");
//                break;
//            default:
//                System.out.println("Enjoy your life");
//        }
//
//        System.out.println("Thanks");
//


       /* if(age>56){
            System.out.println("You are experienced");
        }else if(age>46){
            System.out.println("You are semi-experienced");
        } else if (age>36) {
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("You are not experienced");
        }    */

        char var ='d';
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a,b,c or d");
//        var = sc.next;

        switch (var) {
            case 'a':
                System.out.println("You are going to become an adult");
                break;
            case 'd':
                System.out.println("You are going to join a job");
                break;
            case 'b':
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }

        System.out.println("Thanks");

    }
}
