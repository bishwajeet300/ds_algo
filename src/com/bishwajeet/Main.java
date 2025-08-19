package com.bishwajeet;

import com.bishwajeet.algorithms.Meeting;
import com.bishwajeet.algorithms.MeetingRoom;

import java.util.ArrayList;
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