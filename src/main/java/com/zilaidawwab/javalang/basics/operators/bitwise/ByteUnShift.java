/**
 * Unsigned Shifting of a byte value
 * We know that in the right shift the sign bit is preserved, and the previous value of sign bit
 * is restored. But when we don't want this behavior we use unsigned shift (>>>).
 * This is specific to right shift, as signed are not preserved in left shift
 */

package com.zilaidawwab.javalang.basics.operators.bitwise;

public class ByteUnShift {
    public static void main(String[] args) {

        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4); // 0xff (Right Shift)
        byte d = (byte) (b >>> 4); // 0xff (No affect of sign due to Right Unsigned Shift)
        byte e = (byte) ((b & 0xff) >> 4); // 0x0f

        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println("b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
    }
}
