package com.company;

public class cwh_35_ps7_pr6 {
    public static double calculateAverage(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {

        //Question 6
        // Write a function to find average of a set of numbers passed as argument

                double average = calculateAverage(10.5, 20.0, 30.5, 40.0);
                System.out.println("The average is: " + average);
            }
        }




