package com.bishwajeet;

import java.util.Scanner;

import static com.bishwajeet.dataStructures.array.CountOfTriplets.countTriplet;
import static com.bishwajeet.dataStructures.array.SubArrayWithGivenSum.subArraySum;
import static com.bishwajeet.dataStructures.array.SubArrayWithMaximumSum.maxSubArraySum;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number to search from 110, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10");
//        int userInput = scanner.nextInt();
//
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//	      System.out.println("Index of " + userInput + ": " + new LinearSearch(arr).getPositionOf(userInput));
//        System.out.println("Index of " + userInput + ": " + new BinarySearch(new BubbleSort(arr).sort()).getPositionOf(userInput));
//        System.out.println("Index of " + userInput + ": " + new BinarySearch(new SelectionSort(arr).sort()).getPositionOf(userInput));
//
//        System.out.println(subArraySum(new int[]{1,2,3,4,5,6,7,8,9,10}, 10, 15));
//        System.out.println(subArraySum(new int[]{1,2,3,7,5}, 5, 12));

//        System.out.println(countTriplet(new int[]{1, 5, 3, 2}, 4));

        System.out.println(maxSubArraySum(new int[]{1,2,3,-2,5}, 5));
    }


    /* Prints the array */
    private static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}