package com.company;
import java.util.Scanner;

public class cwh_19_ps4_pr06 {
    public static void main(String[] args) {

        //Question 6
        //Java Program to find out the type of website

        // .com --> Commertial website
        // .org --> Organization website
        // .in --> Indian website
        // .edu --> Education website


        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a URL of website: ");
        String web = sc.nextLine();

        if(web.endsWith(".com")){
            System.out.println("Commertial website");
        }
       else if(web.endsWith(".org")){
            System.out.println("Organization website");
        }
       else if(web.endsWith(".in")){
            System.out.println("Indian website");
        }else if(web.endsWith(".edu")){
            System.out.println("Education website");
        }
       else{
            System.out.println("This website is not specified in this program");
        }


    }
}
