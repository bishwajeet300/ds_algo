package com.bishwajeet.dataStructures.problems.array;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        // Write your code here
        int occurancePerSegment = 0;
        int occuranceRemainingSegment = 0;
        long wholeSegments = n/(s.length());
        long remainingString = n - (wholeSegments * s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                occurancePerSegment++;
            }
        }

        for (int i = 0; i < remainingString; i++) {
            if (s.charAt(i) == 'a') {
                occuranceRemainingSegment++;
            }
        }

        return (wholeSegments * occurancePerSegment) + occuranceRemainingSegment;
    }
}
