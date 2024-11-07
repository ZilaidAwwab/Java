/**
 * Demonstrates the bitwise logical operators
 */

package com.zilaidawwab.javalang.basics.operators.bitwise;

public class BitLogic {
    public static void main(String[] args) {

        String[] binary = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b; // 0011 OR 0110 => 0111 (7)
        int d = a & b; // 0011 AND 0110 => 0010 (2)
        int e = a ^ b; // 0011 AND 0110 => 0101 (6)

        // a = 0011 => ~a = 1100
        // ~a | b => 1100 & 0110 => 0100
        // b = 0110 => ~b = 1001
        // a & ~b => 0011 & 1001 => 0001
        int f = (~a & b) | (a & ~b); // 0100 | 0001 => 0101 (5)

        int g = ~a & 0x0f; // 0011 & 0101

        System.out.println("a = " + binary[a]); // 0011
        System.out.println("b = " + binary[b]); // 0110
        System.out.println("c = " + binary[c]); // 0111
        System.out.println("d = " + binary[d]); // 0010
        System.out.println("e = " + binary[e]); // 0101
        System.out.println("f = " + binary[f]); // 0101
        System.out.println("g = " + binary[g]); // 1100
    }
}
