package com.company;
import java.util.*;
public class cwh_81_specific_exceptions {
    public static void main(String[] args) {

        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Please enter the number you want to divide the value with: ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is : " + marks[ind]);
            System.out.println("The value of array value/number is : " + marks[ind]/number);


        } catch (ArrayIndexOutOfBoundsException a) {

            System.out.println("Some exceptions occured");
            System.out.println(a);
        }


    catch (Exception a) {

        System.out.println("Some other exceptions occured");
        System.out.println(a);
    }


}
}
