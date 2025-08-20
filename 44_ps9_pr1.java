package com.company;

class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


public class cwh_44_ps9_pr1 {
    public static void main(String[] args) {

        //Question 1
        //create a class cylinder and use and setters to set its radius and height.

        Cylinder cyl = new Cylinder();

        cyl.setHeight(12);
        System.out.println(cyl.getHeight());
        cyl.setRadius(5);
        System.out.println( cyl.getRadius());

    }
}
