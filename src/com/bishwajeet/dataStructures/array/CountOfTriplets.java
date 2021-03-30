package com.bishwajeet.dataStructures.array;

import java.util.HashMap;

public class CountOfTriplets {

    public static int countTriplet(int[] arr, int n) {
        // code here
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int tripletCount = 0;

        for (int i : arr) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (frequencyMap.containsKey(arr[i] + arr[j]) && frequencyMap.get(arr[i] + arr[j]) > 0) {
                    tripletCount++;
                }
            }
        }

        return tripletCount;
    }
}
