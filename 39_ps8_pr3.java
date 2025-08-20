package com.company;

class square{
     int side;

     public int area(){
         return side*side;
     }

     public int perimeter(){
         return 4*side;
     }
}

public class cwh_39_ps8_pr3 {
    public static void main(String[] args) {

        //Question 3
        //Create a class square with a method to initialize its side , calculating area , perimeter etc.

        square km = new square();
        km.side= 3;
        System.out.println(km.area());
        System.out.println(km.perimeter());

    }
}
