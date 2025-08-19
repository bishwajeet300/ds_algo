package com.bishwajeet.dataStructures.problems.array;

import java.util.List;

public class CloudJumps {

    public int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;
        int i = 0;
        while (i < c.size() - 1) {
            if (c.get(i+1) == 0) {
                if ((i+2) < c.size() && c.get(i+2) == 0) {
                    i = i + 2;
                } else {
                    i++;
                }
            } else {
                i = i + 2;
            }
            jumps++;
        }

        return jumps;
    }
}
