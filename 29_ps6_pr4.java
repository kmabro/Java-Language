package com.company;

public class cwh_29_ps6_pr4 {
    public static void main(String[] args) {

        //Question 4
        //Java program to add two matrices of size 2*3


        int [][] mat1= {{1, 2, 3},
                       {4, 5, 6},};
        int [][] mat2= {{2, 6, 13},
                       {3, 7, 1},};
        int [][] result= {{0, 0, 0},
                       {0, 0, 0},};

        for(int i=0; i<mat1.length; i++){
        for(int j=0; j<mat1[i].length; j++) {
            System.out.format("Setting value for i=%d and j =%d\n", i, j);
         result [i][j] = mat1[i][j]+mat2[i][j];
        }
             }


        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++) {
                System.out.print(result[i][j]+ " ");
                result [i][j] = mat1[i][j]+mat2[i][j];
            }
            System.out.println();
        }


    }
}
