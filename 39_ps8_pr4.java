package com.company;

class rectangle{
    int length;
    int width;

    public int area(){
        return length*width;
    }

    public int perimeter(){
        return 2*(length+width);
    }
}

public class cwh_39_ps8_pr4 {
    public static void main(String[] args) {

        //Question 4
        //Create a class rectangle and repeat 3.

        rectangle km = new rectangle();
        km.length= 5;
        km.width= 5;
        System.out.println(km.area());
        System.out.println(km.perimeter());
    }
}
