
package com.company;
import java.util.Scanner;

public class CWH_07_ExerciseOfPercentageQuestion {
    public static void main(String[] args) {
        int total = 500;
        Scanner km = new Scanner(System.in);
        System.out.println("Enter Physics marks: ");
        int Physics = km.nextInt();
        System.out.println("Enter ICT marks: ");
        int ICT = km.nextInt();
        System.out.println("Enter FE marks: ");
        int FE = km.nextInt();
        System.out.println("Enter PS marks: ");
        int PS = km.nextInt();
        System.out.println("Enter CEW marks: ");
        int CEW = km.nextInt();

        double sum = Physics+ICT+FE+PS+CEW;

        double per = ((double)sum/total )*100;

        System.out.println(per);



    }
}