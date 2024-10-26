package com.zilaidawwab.javalang.basics.additionalconcepts;

public class TypeConversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Conversion of int into byte");
        // Here we are converting the int type into byte explicitly because it int is a bigger data type (32 bit), while byte is a small (8 bit), so here automcatic type conversion doesnt happens
        b = (byte) i;
        
        System.out.println("i and b: " + i + " " + b); // 257 1
        // The range of byte is 256, so its here reduced modulo is performed internally and 257 % 256 = 1 (1 was left as remainder)
        
        System.out.println("Conversion of double into int");
        // Conversion of double into int (here again double is a bigger type than int so explicit casting would be done)
        i = (int) d;
        
        System.out.println("d and i: " + d + " " + i); // 323.142 142
        
        System.out.println("Conversion of double into byte");
        // Conversion of double to byte (again explicit casting would be done, because double is bigger than byte)
        b = (byte) d;

        System.out.println("d and b: " + d + " " + b); // 323.142 67
        // Again here 323.142 % 256 = 67 (67 was remainder, and fractional part was truncated)
    }
}
