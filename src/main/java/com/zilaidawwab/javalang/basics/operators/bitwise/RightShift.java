/**
 * Right Shifting bytes
 */

package com.zilaidawwab.javalang.basics.operators.bitwise;

public class RightShift {
    public static void main(String[] args) {

        int a = 32; // 0010 0000 (32)
        // Right Shift not only divides the number by 2 but also get rids of remainder
        a = a >> 2; // 0000 1000 (8) (here 2 shifts divides 2 times so, first 16 then 8)

        // Here the demonstration of getting rid of remainder
        int b = 35; // 0010 0011 (35)
        b = b >> 2; // 0000 1000 (8) The remainder 3 above 32 is also gone

        /**
         * Sign Extension
         * When you are shifting right, the top (leftmost) bits exposed by the right shift
         * are filled in with the previous contents of the top bit. This is called sign
         * extension and serves to preserve the sign of negative numbers when you shift
         * them right
         */
        int c = -8; // 1111 1000 (-8)
        // Here the last bit carried the previous content and didn't affect the sign bit
        c = c >> 1; // 1111 1100 (-4)

        System.out.println("a: " + a); // From 32 to 8
        System.out.println("b: " + b); // From 35 to 8
        System.out.println("c: " + c); // From -8 to -4
    }
}
