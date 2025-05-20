/**
 * This example of recursive method prints the first i elements in array
 */

package com.zilaidawwab.javalang.classes.recursion;

public class RecursionEx {
    int[] values;

    RecursionEx(int i) {
        values = new int[i];
    }

    // display array --recursively
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }

    public static void main(String[] args) {

        RecursionEx ob = new RecursionEx(10);
        int i;

        // Populating the array with data (from 0 to 9)
        for (i = 0; i < 10; i++) ob.values[i] = i;

        // Recursively printing the array content
        ob.printArray(8);
    }
}

// Think in terms of stack piling up here. First 8 goes in, then above it comes 7 (as the func
// is again called), then 6 above it, then 5 and so on till 0. And then the stack starts to get
// empty and by LIFO rule, first 0 comes out, then 1, 2 and so on till 8 (in this case), until
// the stack is empty again
