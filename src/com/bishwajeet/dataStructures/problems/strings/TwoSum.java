package com.bishwajeet.dataStructures.problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static List<List<Integer>> twoSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(nums[0], 0);
        for (int count = 0; count < nums.length; count++) {
            int reqVal = nums[count] * -1;
            if (hashmap.containsKey(reqVal)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(hashmap.get(reqVal));
                tempList.add(count);
                result.add(tempList);
            } else {
                hashmap.put(nums[count], count);
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(nums[0], 0);
        for (int count = 0; count < nums.length; count++) {
            int reqVal = target - nums[count];
            if (hashmap.containsKey(reqVal)) {
                return new int[]{hashmap.get(reqVal), count};
            } else {
                hashmap.put(nums[count], count);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println("Result: " + Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
    }
}
