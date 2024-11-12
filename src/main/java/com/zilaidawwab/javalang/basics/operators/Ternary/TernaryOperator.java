/**
 * Ternary (?) Operator
 * Used as an alternate to if-else-then statement
 */

package com.zilaidawwab.javalang.basics.operators.Ternary;

public class TernaryOperator {
    public static void main(String[] args) {

        /**
         * expression1 ? expression2 : expression3
         * Here, expression1 can be any expression that evaluates to a boolean value. If
         * expression1 is true, then expression2 is evaluated; otherwise, expression3 is
         * evaluated.
         */
        int i, k;
        i = 10;
        // Here we want absolute value of i (means i's value shouldn't be -ive, and if so,
        // multiply it with (-) to make it +ive.
        /**
         * This is equal to
         * if (i < 0) -i;
         * else i
         */
        k = i < 0 ? -i : i;

        System.out.println("Absolute Value of " + i + " is: " + k); // 10 is 10

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Absolute Value of " + i + " is: " + k); // -10 is 10
    }
}
