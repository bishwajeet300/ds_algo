package com.bishwajeet.dataStructures.array;

/*
* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
* Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
* */
public class MissingNumber {

    private final int[] numbers;

    public MissingNumber(int[] numbers) {
        this.numbers = numbers;
    }

    public int missingNumber() {
        int missingNumber = ((numbers.length) * (numbers.length + 1))/2;

        for (int number : numbers) {
            missingNumber -= number;
        }

        return missingNumber;
    }
}