package com.bishwajeet.dataStructures.problems.array;

import java.util.HashMap;
import java.util.List;

public class Pairs {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> entryMap = new HashMap();
        int pairs = 0;
        for(Integer i : ar) {
            if (entryMap.containsKey(i)) {
                if (entryMap.get(i) == 1) {
                    entryMap.put(i, 0);
                    pairs++;
                } else {
                    entryMap.put(i, 1);
                }
            } else {
                entryMap.put(i, 1);
            }
        }
        return pairs;
    }
}
