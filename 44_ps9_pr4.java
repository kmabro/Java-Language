package com.company;

class  Rectangle{
    private int len;
    private int bre;

    public Rectangle() {
        this.len = 4;
        this.bre = 5;
    }

    public Rectangle(int len, int bre) {
        this.len = len;
        this.bre = bre;
    }

    public int getLen() {
        return len;
    }

    public int getBre() {
        return bre;
    }
}

public class cwh_44_ps9_pr4 {
    public static void main(String[] args) {

        //Question 4
        //Overload a constructor used to initialize a rectangle of length 4 and breadth for using
        //custom parameters.

        Rectangle r =  new Rectangle();
        System.out.println(r.getLen());
        System.out.println(r.getBre());
    }
}
