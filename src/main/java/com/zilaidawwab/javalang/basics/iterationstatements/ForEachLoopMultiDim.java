/**
 * For-Each style for a two-dimensional array
 */

package com.zilaidawwab.javalang.basics.iterationstatements;

public class ForEachLoopMultiDim {
    public static void main(String[] args) {

        int sum = 0;
        int[][] nums = new int[3][5];

        // give nums some value
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i+1) * (j+1);
            }
        }

        // use for each to for display and sum the values
        for (int[] x: nums) {
            for (int y: x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}

/**
 * Value is: 1
 * Value is: 2
 * Value is: 3
 * Value is: 4
 * Value is: 5
 * Value is: 2
 * Value is: 4
 * Value is: 6
 * Value is: 8
 * Value is: 10
 * Value is: 3
 * Value is: 6
 * Value is: 9
 * Value is: 12
 * Value is: 15
 * Summation: 90
 */
