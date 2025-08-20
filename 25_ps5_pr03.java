package com.company;
import java.util.Scanner;
public class cwh_25_ps5_pr03 {
    public static void main(String[] args) {

        //Question 3
        // print multiplication table

      //  int n= 5;
      //  for (int i=0; i<10; i++) - i=0 to i=9
        //for(int i=1; i<=10; i++ ){
            //System.out.printf("%d X %d = %d\n" , n ,i, n*i);
          //  System.out.println(n + " X " + i + " = " + (n * i));
        //}


        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();

        for(int i= 1; i<11; i++){
            System.out.println(i + "X" + n + "= "+ n*i);
        }


    }
}
