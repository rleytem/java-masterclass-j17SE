package com.ryne.testpackage;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //create program using arrays that sorts a list of integers in descending order(highest to lowest)
        //array has values 50,25,80,5 and 15, your program should return array with values: 80,50,25,15,5

        //First create array of randomly generated integers
        //print array before your sort it
        //print array after you sort it

        //construct new random object
        Random random = new Random();

        //declare new Array object with length of 10 elements
        int[] randomArray = new int[10];

        //for loop adding 10 random elements to randomArray;
        //random numbers anywhere from 0 - 100
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(101);
        }

        //print array with first numbers initialized using toString
        System.out.println("Random array: " +Arrays.toString(randomArray));

        //sort into new array so we dont lose our information
        int[] sortedArray = Arrays.copyOf(randomArray, randomArray.length);
        sortedArray = sortHighestToLowest(sortedArray);

        //print out new highest to lowest Array using toString
        //the benefit of the way we coded this, protects information so we dont lose it
        //it also created a method we can reuse
        //it also isnt hardcoded based on array length, we could create a 100 length array and it would still run;
        System.out.println("Highest to Smallest: " +Arrays.toString(sortedArray));

        System.out.println("-".repeat(30));

        int[] randomArray2 = new int[10];
        for(int i = 0; i < randomArray2.length; i++) {
            randomArray2[i] = random.nextInt(101);
        }

        System.out.println("randomArray2: " + Arrays.toString(randomArray2));
        reverse(randomArray2);
        System.out.println("randomArray2 Reversed: " + Arrays.toString(randomArray2));


    }

    //reverse method to take in an array and mutate it by reversing the actual array passed through
    //create a copy to store the numbers
    //counter variable
    //set each element of the parameter array to the last element of the copied array
    //increase the count each loop so we're moving downward
    //these methods may not be ideal as we're creating new arrays in memory

    private static void reverse(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        int count = 1;

        for (int i = 0; i < copyArray.length; i++) {
            array[i] = copyArray[copyArray.length - count];
            count++;
        }
    }

    private static int[] sortHighestToLowest(int[] array) {

        //this function creates a copy of the array to manipulate, so we dont sort it in memory as well
        //we sort the copied array from smallest to largest using Arrays.sort
        //it also creates a second array that we're going to return, which starts off as a copy of the first copy
        //we have a counter integer initialized at 1, we will use this to go backwards in our array
        //the for loop initializes i at 0, goes as long as length of our array and increments once;
        //we set whatever the current element of the array2 we're on in the loop to the whatever the length - count element is of our copied array
        //increase count by one
        //effectively were starting at the last element of a sorted array and placing the element into our new array from the start to the end.
        //essentially flip flopping the arrays
        //return array2


        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);
        int[] array2 = Arrays.copyOf(copyArray, copyArray.length);
//        System.out.println("Sorted array: " + Arrays.toString(array2));
        int count = 1;

        for (int i = 0; i < copyArray.length ; i++) {
            array2[i] = copyArray[copyArray.length - count];
            count++;
        }

        return array2;
    }
}