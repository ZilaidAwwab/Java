/**
 * Demonstrate the use of Compound Assignment Operator (var op= var)
 */

package com.zilaidawwab.javalang.basics.operators.arithmetic;

public class OpEquals {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        // Using compound assignment operator
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
