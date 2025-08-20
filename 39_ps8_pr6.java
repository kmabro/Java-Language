package com.company;

class circle{
double radius;
//int width;

public double area(){
    return 3.14*((radius)*(radius));
}

public double perimeter(){
    return 2*(3.14*radius);
}
}

public class cwh_39_ps8_pr6 {
    public static void main(String[] args) {

        //Question 6
        //Repeat 4 for a circle


        circle km = new circle();
        km.radius= 5.0;
        //km.width= 5;
        System.out.println(km.area());
        System.out.println(km.perimeter());

    }
}
