package com.company;

class Sphere {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class cwh_44_ps9_pr5 {
    public static void main(String[] args) {
        // Question 1: Create a class Cylinder and use setters to set its radius and height.
        Cylinder cyl = new Cylinder();

        cyl.setHeight(12);
        System.out.println("Cylinder Height: " + cyl.getHeight());
        cyl.setRadius(5);
        System.out.println("Cylinder Radius: " + cyl.getRadius());

        // Repeat this for Sphere
        Sphere sph = new Sphere();
        sph.setRadius(7);
        System.out.println("Sphere Radius: " + sph.getRadius());
    }
}



