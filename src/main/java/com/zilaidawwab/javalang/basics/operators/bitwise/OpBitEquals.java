/**
 * In Bitwise Operators as well, we can use the compound assignments.
 */

package com.zilaidawwab.javalang.basics.operators.bitwise;

public class OpBitEquals {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;

        System.out.println("a = " + a); // 3
        System.out.println("b = " + b); // 1
        System.out.println("c = " + c); // 6
    }
}
