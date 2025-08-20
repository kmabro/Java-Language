package com.company;
import java.util.Scanner;

public class cwh_19_ps4_pr04 {
    public static void main(String[] args) {

        //Question 4
        //Java program to find out the day of the week give number 1 for Monday,
        // 2 for Tuesday .... and so on!

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a case to find the day of week (you can enter 1-7)");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a case 1 to 7 (There are 7 days in a week)");

        }
        System.out.println("This code is made by Khan Muhammad");
    }
}
