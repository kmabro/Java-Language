package com.company;

public class cwh_35_ps7_pr9 {
    static int temp(int n) {
        // Correct formula with floating-point division
        int result = (int) ((9.0/5.0) * n + 32);
        return result;
    }

    public static void main(String[] args) {
        // Question 9
        // Celsius to Fahrenheit conversion

        int celsius = 5; // You can change this value to test different temperatures
        int fahrenheit = temp(celsius);
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
