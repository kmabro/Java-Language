



package com.company;

class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    // Making the derived class static so it can be instantiated without an instance of Base
    static class Derived extends Base {
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}

public class chw_45_ch10_inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Instantiating the Derived class correctly
        Base.Derived a = new Base.Derived();
        a.setX(4);
        System.out.println(a.getX());
    }
}
