package com.company;

public class cwh_8_ch2_Operators {
    public static void main(String[] args) {

        // Arithmetic operators
        int a = 4;
        int b = 6 - a;
        int c = 6 + a;
        int d = 6 * a;
        int e = 6 / a;
        int f = 6 % a; // module operator
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // Assignment operators
        int b1 = 9;
        b1 += 3;
        int c1 = 9;
        c1 -= 3;
        int d1 = 9;
        d1 *= 3;
        int e1 = 18;
        e1 /= 9;
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);

        // Comparison operators
        int a1 = 4;
        int b2 = 9;
        System.out.println(b2);
        System.out.println(8 == 6);
        System.out.println(8 == 8);
        System.out.println(8 > 6);
        System.out.println(8 < 6);

        // Logical operators
        int a2 = 4;
        int b3 = 9;
        System.out.println(64 > 5 && 64 > 8);
        System.out.println(64 > 5 && 64 < 8);
        System.out.println(64 > 5 || 64 < 8);
        System.out.println(64 > 5 || 64 < 8);
        System.out.println(64 < 5 || 64 < 8);

        // Bitwise operator
        System.out.println(2 & 3);

        // 2 --> 10
        // 3 --> 11
        //       10
    }
}
