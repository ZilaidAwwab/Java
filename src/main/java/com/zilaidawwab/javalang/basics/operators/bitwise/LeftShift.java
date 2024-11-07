/**
 * Left Shifting a byte value
 */

package com.zilaidawwab.javalang.basics.operators.bitwise;

public class LeftShift {
    public static void main(String[] args) {

        byte a = 64, b;
        int i;

        // When we left shit a byte value, it is first promoted to int for purpose of evaluation
        // So, when 64 is left shifted twice, it becomes 256 (with type int)
        // 0100 0000 (64) "Before Shifting"
        // 1 0000 0000 (256) "After Shifting"
        i = a << 2;

        // Java do automatic casting in such cases as we saw in the above example
        // Here we are casting byte to remain byte and then shifting
        // Since byte can store a max of 255 value so, double shift right will result in 0
        // 0100 0000 (64) "Before Shifting"
        // 0000 0000 (0) "After Shifting"
        b = (byte) (a << 2);

        System.out.println("Original Value of a: " + a); // 64
        System.out.println("i and b: " + i + " " + b); // 256 0
    }
}
