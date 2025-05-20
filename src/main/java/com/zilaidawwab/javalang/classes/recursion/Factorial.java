/**
 * A Simple example of Recursion
 */

package com.zilaidawwab.javalang.classes.recursion;

public class Factorial {

    // Recursive Method
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

// When writing recursive methods, you must have an if statement somewhere
// to force the method to return without the recursive call being executed
