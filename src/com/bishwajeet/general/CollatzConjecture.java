package com.bishwajeet.general;

public class CollatzConjecture {
    public static Long solve(int A, int B) {
        long valueA = A;
        for (int i = 0; i < B - 1; i++) {
            if (valueA % 2 == 0) {
                valueA /= 2;
            } else {
                valueA = 3 * valueA + 1;
            }
            System.out.println(valueA);
        }
        return valueA;
    }
}
