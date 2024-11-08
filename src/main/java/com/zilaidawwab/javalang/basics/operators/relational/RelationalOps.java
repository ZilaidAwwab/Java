/**
 * Demonstration of Relational Operators
 */

package com.zilaidawwab.javalang.basics.operators.relational;

public class RelationalOps {
    public static void main(String[] args) {

        /**
         * This includes:
         * == (Equal to)
         * != (Not Equal to)
         * > (Greater than)
         * < (Smaller than)
         * >= (Greater than or Equal to)
         * <= (Smaller than or Equal to)
         */

        int a = 4;
        int b = 1;
        boolean c = a < b; // false

        // If we want to check if a is equal to 0 (zero) or not
        if (a == 0) System.out.println("A is equal to Zero");
        else if (a != 0) System.out.println("A is not equal to Zero");

        // In C/C++ we can do this like
        // if (a) ... (In C/C++ 0 means false and 1 means true, but that's not valid in Java)
    }
}
