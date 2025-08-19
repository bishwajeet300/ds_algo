package com.bishwajeet.dataStructures.problems.array;

public class MountainAndValley {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleyCount = 0;
        int step = 0;
        boolean isValley = false;
        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'D') {
                if (step == 0) {
                    isValley = true;
                }
                step--;
            } else {
                step++;
                if (step == 0 && isValley) {
                    valleyCount++;
                    isValley = false;
                }
            }
        }
        return valleyCount;
    }
}
