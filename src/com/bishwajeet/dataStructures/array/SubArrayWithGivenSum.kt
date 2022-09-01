package com.bishwajeet.dataStructures.array;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {

        ArrayList<Integer> output = new ArrayList<>();
        for (int startingPosition = 0; startingPosition <= arr.length;  startingPosition++) {
            int sum = 0;
            int slidingPosition = startingPosition;
            while(sum <= s && slidingPosition < n) {
                sum = sum + arr[slidingPosition];
                if (sum == s) {
                    output.add(startingPosition + 1);
                    output.add(slidingPosition + 1);
                    return output;
                }
                slidingPosition++;
            }
        }

        output.add(-1);
        return output;
    }
}
