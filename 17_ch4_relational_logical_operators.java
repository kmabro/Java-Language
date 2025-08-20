package com.company;

public class cwh_17_ch4_relational_logical_operators {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
       // boolean c = true;
        if(a && b ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        System.out.println("For Logical OR...");

        if(a || b ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        System.out.println("For Logical NOT...");
        System.out.print("Not(A) is: ");
        System.out.println(!a);
        System.out.print("Not(B) is: ");
        System.out.println(!b);
    }
}
