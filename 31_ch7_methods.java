package com.company;

public class cwh_31_ch7_methods {
     static int logic(int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {

        int a = 5;
        int b= 7;
        int c;
        c= logic(a,b);
//        cwh_31ch7_methods obj= new cwh_31ch7_methods();
//        c= obj.logic(a,b);
        System.out.println(a+" "+ b);
        System.out.println(c);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1= logic(a1,b1);
//        c1= obj.logic(a1,b1);

        System.out.println(c1);


    }
}
