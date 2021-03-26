package com.bishwajeet;

import com.bishwajeet.algorithms.search.BinarySearch;
import com.bishwajeet.algorithms.search.LinearSearch;
import com.bishwajeet.algorithms.sort.BubbleSort;
import com.bishwajeet.algorithms.sort.SelectionSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to search from 110, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10");
        int userInput = scanner.nextInt();

        int[] arr = new int[]{110, 100, 90, 80, 75, 66, 50, 40, 30, 20, 10};
	    System.out.println("Index of " + userInput + ": " + new LinearSearch(arr).getPositionOf(userInput));
        System.out.println("Index of " + userInput + ": " + new BinarySearch(new BubbleSort(arr).sort()).getPositionOf(userInput));
        System.out.println("Index of " + userInput + ": " + new BinarySearch(new SelectionSort(arr).sort()).getPositionOf(userInput));
    }


    /* Prints the array */
    private static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}