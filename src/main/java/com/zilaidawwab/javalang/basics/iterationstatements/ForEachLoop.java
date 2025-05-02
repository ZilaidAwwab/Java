/**
 * Simple for-each loop demonstration
 * Breaking the for-each loop (without iterating the whole array)
 * Application: Finding a value in an unsorted array
 */

package com.zilaidawwab.javalang.basics.iterationstatements;

public class ForEachLoop {
    public static void main(String[] args) {

        // General Form
        // for (type itr-var : collection) statement-block
        // Here, type specifies the type and itr-var specifies the name of an iteration
        // variable that will receive the elements from a collection, one at a time, from
        // beginning to end

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x: nums) {
            sum += x;
        }

        System.out.println("Summation = " + sum);

        // The for-each for loop iterates until all elements in an array have been examined, it is
        // possible to terminate the loop early by using a break statement
        for (int x: nums) {
            sum += x;
            // Stopping the loop after summation of first 5 elements
            if (x == 5) break;
        }

        System.out.println("Summation after first 5 elements is: " + sum);

        // The for each loop is read-only
        for (int x: nums) {
            x = x * 10; // This won't do anything
        }

        // Application: Finding a value via for each loop in an unsorted array
        int[] vals = {3, 7, 1, 9, 2, 6, 5};
        int val = 6;
        boolean found = false;

        for (int i: vals) {
            if (i == val) found = true; break;
        }
        if (found) System.out.println("Value Found!");
    }
}
