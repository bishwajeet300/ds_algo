package com.bishwajeet.dataStructures.problems.array;

public class MultiplyStrings {

    public static void main(String[] args) {
        System.out.println("multiply = " + multiply("123456789", "987654321"));
        System.out.println("multiply = " + multiply("12", "34"));
    }

    public static String multiply(String num1, String num2) {

        int result = 0;
        int total = num1.length() + num2.length() - 2;

        for (int m = num1.length() - 1; m >= 0; m--) {
            for (int n = num2.length() - 1; n >= 0; n--) {
                int n1 = (num1.charAt(m) - '0');
                int n2 = (num2.charAt(n) - '0');
                int mul = n1 * n2;
                result += mul * Math.pow(10, total - (m + n));
            }
        }
        return String.valueOf(result);
    }
}
