/**
 * Left Shift as a quick way to multiply by 2
 *
 * Catch:  If you shift a 1 bit into the high-order position (which is sign it)
 * (bit 31 or 63), the value will become negative.
 */

package com.zilaidawwab.javalang.basics.operators.bitwise;

public class MultByTwo {
    public static void main(String[] args) {

        int i;
        // Binary (32-bit): 0000 1111 1111 1111 1111 1111 1111 1110 Decimal: 268435454
        int num = 0xFFFFFFE;

        // Since the last bit is the sign bit and here it is 0 (which means num is positive)
        // After 4 shift it will be 1 (means negative) (0000 will be 1111 after 4 shifts)
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}

/**
 * Outputs
 * 536870908
 * 1073741816
 * 2147483632 (this is the highest positive value that an integer can hold)
 * -32
 *
 * The starting value was carefully chosen so that after being shifted left 4 bit
 * positions, it would produce –32. As you can see, when a 1 bit is shifted into bit
 * 31, the number is interpreted as negative.
 */
