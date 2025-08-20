package com.company;

class CellPhone{
    static void ring(){
        System.out.println("Ringing...");
    }

    static void vibrate(){
        System.out.println("Vibrating...");
    }

    static void callFriend(){
        System.out.println("Calling Farukh...");
    }
}

public class cwh_39_ps8_pr2 {
    public static void main(String[] args) {

        //Question 2
        //Create a class cellphone with methods to print "ringing... " , "vibrating..." etc.

        CellPhone km= new CellPhone();
        km.ring();
        km.vibrate();
        km.callFriend();

    }
}
