/**
 * Masking Sign Extension
 */

package com.zilaidawwab.javalang.basics.operators.bitwise;

public class HexByte {
    public static void main(String[] args) {

        // This is an array of hexadecimal characters (0 to f)
        // Each index corresponds to a hexadecimal digit: hex[0] = '0', hex[10] = 'a', etc.
        // This array is used to convert integer values to their hexadecimal string representation.
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        // 0xf1 is hexadecimal. In Binary (8 Bits) this is: 1111 0001
        // 0x represents hexadecimal(f is 1111, 1 is 0001)
        // Since b is the signed byte, the leftmost bit (1) represents the sign bit.
        // In 2s complement this makes "b", a negative value = -15
        byte b = (byte) 0xf1; // (byte ranges from -128 to 127)

        // Now we want to print the hexadecimal string representation of byte `b`.
        // To do that, we isolate the high 4 bits and low 4 bits using bitwise operations:

        // Solving (b >> 4) & 0x0f
        // (b >> 4) & 0x0f. Shifting right by 4 makes binary (1111 0001) => (1111) -> -1
        // In decimal it becomes -1 (1111) as last bit is sign bit
        // To get a valid index (0 to 15), we apply `& 0x0f`:
        // 1111 & 0000 1111 -> 1111 (15 in hex (as they are enclosed in hex[])

        // Solving b & 0x0f
        // b (1111 0001) & 0x0f (0000 1111) -> 0001 (1 as in hex)
        // Now evaluating the last addition ((15 as f)1111 + (1 as 1)0001) => f1 -> 0xf1 in hex
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]); // 0xf1
    }
}
