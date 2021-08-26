package com.bishwajeet;

import com.bishwajeet.algorithms.Meeting;
import com.bishwajeet.algorithms.MeetingRoom;
import com.bishwajeet.dataStructures.array.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
//        System.out.println(maxSubArraySum(new int[]{1,2,3,-2,5}, 5));
//        System.out.println(new ContainsDuplicate(new int[]{110, 100, 90, 80, 70, 110, 50, 40, 30, 20, 10}).containsDuplicate_ByHashSet());
//        System.out.println(new MissingNumber(new int[]{9,6,4,2,3,5,7,0,1}).missingNumber());
//        System.out.println(new MissingNumberList(new int[]{4,3,2,7,8,2,3,1}).missingNumbers());
//        System.out.println(new EvenDigits().findNumbers(new int[]{580,317,640,957,718,764}));
//        printArray(new SquaresArray().sortedSquares(new int[]{-5, -4, -3, -2, -1, 2, 4, 5}));
//        printArray(new DuplicateZeros().duplicateZeros(new int[]{1,0,2,3,0,4,5,0}));
//        printArray(new MergeSortedArray().merge(new int[]{2, 0}, 1, new int[]{1}, 1));
//        printArray(new MergeSortedArray().merge(new int[]{0}, 0, new int[]{1}, 1));
//        System.out.println(new RemoveElement().removeElement(new int[]{3,2,2,3}, 3));
//        System.out.println(new CloudJumps().jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0))); //4

        List<Meeting> meetings = new ArrayList<>();
//        meetings.add(new Meeting(1, 2));
//        meetings.add(new Meeting(3, 4));
//        meetings.add(new Meeting(2, 3));
//        meetings.add(new Meeting(3, 5));

        meetings.add(new Meeting(1, 2));
        meetings.add(new Meeting(2, 3));
        meetings.add(new Meeting(3, 4));
        meetings.add(new Meeting(1, 5));
        meetings.add(new Meeting(2, 5));
        meetings.add(new Meeting(4, 5));

        System.out.println(new MeetingRoom().findMeetingRooms(meetings));
    }


    /* Prints the array */
    private static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}