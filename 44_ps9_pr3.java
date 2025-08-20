package com.company;

class Cylindere{
    private int radius;
    private int height;

    public Cylindere(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

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


public class cwh_44_ps9_pr3 {
    public static void main(String[] args) {

        //Question 1
        //create a class cylinder and use and setters to set its radius and height.

        Cylindere cyl = new Cylindere(9,12);

       // cyl.setHeight(12);
        System.out.println(cyl.getHeight());
      //  cyl.setRadius(5);
        System.out.println( cyl.getRadius());



    }
}
