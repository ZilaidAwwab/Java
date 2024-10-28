/**
 * Demonstrates the modulus(%) operator
 */

package com.zilaidawwab.javalang.basics.operators.arithmetic;

public class Modulus {
    public static void main(String[] args) {

        int x = 42;
        double y = 42.25;

        // mod on int gives int, and on double gives double
        System.out.println("x mod 10 = " + (x % 10)); // 2
        System.out.println("y mod 10 = " + (y % 10)); // 2.25
    }
}
