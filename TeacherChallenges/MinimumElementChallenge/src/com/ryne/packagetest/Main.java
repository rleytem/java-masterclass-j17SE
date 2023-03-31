package com.ryne.packagetest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //use readIntegers method to get integers from user and print them out using method found in java.util.Arrays
    //use findMin method, passing array in from readIntegers method
    //print min element in the array passed through from findMin method
    //user will only enter numbers, no need for validation

    public static void main(String[] args) {

    System.out.println(findMin(readIntegers()));


    }
    //readIntegers method returns a String array and passes in nothing
    //create new Scanner object to take in user input
    //we take user inputted string (which is assumed to be entered correct, no validations needed)
    //user inputted string is numbers separated by comma
    //we then create a new string array object and initialize it with the user entered string, split using .split method
    //return splitString array

    public static String[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers to enter in an array, separated by commas: ");
        String nums = scanner.nextLine();
        String[] splitString = nums.split(",");
//        System.out.println(Arrays.toString(splitString));

        return splitString;
    }

    //find min returns an int and takes in a String array
    //intArray created to house the new parsed array
    //for loop to take elements from our passed in array and parse them into an integer
    //sort the array afterwards and return the first element because we know the first element of a sorted array will
    //be the minimum of an array

    public static int findMin (String[] array) {
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(intArray);
        return intArray[0];
    }
}
