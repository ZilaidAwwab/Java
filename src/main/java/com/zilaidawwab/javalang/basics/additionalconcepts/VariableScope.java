package com.zilaidawwab.javalang.basics.additionalconcepts;

// This demonstrates the class block scope
public class VariableScope {
    public static void main(String[] args) {
        // This is the method block scope
        
        // This variable is defined in the method block scope, so this will be known to all the blocks in the main method
        int x;

        x = 10;

        // Here we started a new conditional block scope inside the method
        if (x == 10) {
            // This variale will only be available in this block and not outside of it
            int y = 20;

            // Here x and y both are known
            System.out.println("x + y = " + (x+y));

            x = y * 2;
        }

        // Y here gives error, and not accessible outside its scope block
        // y = 10;

        // X is still known, as it was declared here
        System.out.println("x is " + x); // prints 40

        // Moreover, we cannot use a variable, or define it before it is initialize
        // count = 100;
        // int count; (This is not acceptable)
    }
}
