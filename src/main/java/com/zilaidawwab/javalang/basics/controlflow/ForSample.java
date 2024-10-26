package com.zilaidawwab.javalang.basics.controlflow;

public class ForSample {
    public static void main(String[] args) {
        
        int x ;
        for (x = 0; x <= 10; x++) {
            System.out.println(x); // Prints from 0 to 10
        }

        // Code block
        int y, z;
        z = 20;
        for (y = 0; y < 10; y++) {
            System.out.println("This is y: " + y);
            System.out.println("This is z: " + z);
            z = z - 2;
        }
    }
}
