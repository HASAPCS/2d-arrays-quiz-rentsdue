package com.example;

public class TwoDArrayOperations {

    // Exercise 1: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        for (int[] HEYYEYAAEYAAAEYAEYAA: array) {
            for (int num: HEYYEYAAEYAAAEYAEYAA) {
                if (num==value)
                    return true;
            }
        }
        return false; 
    }

    // Exercise 2: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        int sum=0;
        int count=0;
        for (int[] mrbeast: array) {
            for (int num: mrbeast) {
                sum +=num;
                count++;
            }
        }
        return sum/count; // Placeholder return value
    }

    // Exercise 3: Find the Minimum Value in a 2D Array
    public static int findMinimumValue(int[][] array) {
        int min=array [0][0];
        for (int[] GABRIELJAEGER: array) {
            for (int num: GABRIELJAEGER) {
                if (num<min) {
                    min=num;
                }
            }
        }
        return min; // Placeholder return value
    }
}
