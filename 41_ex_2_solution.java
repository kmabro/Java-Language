package com.company;
import java.util.Scanner;
import java.util.Random;

public class cwh_41_ex_2_solution {
    public static void main(String[] args) {

        // O for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter O for Rock, 1 for Paper, 2 for Scissor: " );
        int ui = sc.nextInt();

        Random rand = new Random();
        int ci = rand.nextInt(3);
        if(ui==ci){
            System.out.println("Draw");
        }
        else if(ui==0 && ci ==2 || ui==1 && ci==0 || ui==2 && ci==1){
            System.out.println("You win!");
        }else{
            System.out.println("Computer win!");
        }
        //System.out.println("Computer choice: "+ ci);
        if(ci==0){
            System.out.println("Computer choice: Rock");
        }
        else if(ci==1){
            System.out.println("Computer choice: Paper");
        }
        else if(ci==2){
            System.out.println("Computer choice: Scisor");
        }
    }
}
