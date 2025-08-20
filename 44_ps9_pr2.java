package com.company;

class Cylinderr{
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
    public double SurfaceArea(){
        return 2* 3.14 * radius * radius + 2*3.14* radius* height;
    }
 public double Volume(){
        return 3.14*radius*radius*height;
    }

}


public class cwh_44_ps9_pr2 {
    public static void main(String[] args) {

        //Question 1
        //create a class cylinder and use and setters to set its radius and height.

        Cylinderr cyl = new Cylinderr();

        cyl.setHeight(12);
        System.out.println(cyl.getHeight());
        cyl.setRadius(9);
        System.out.println( cyl.getRadius());

        System.out.println(cyl.SurfaceArea());
        System.out.println(cyl.Volume());
    }
}
