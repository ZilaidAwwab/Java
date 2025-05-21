/**
 * This program demonstrates the difference between public, private and no-modifier
 */

package com.zilaidawwab.javalang.classes.accessmodifiers;

public class Test {

    int a;              // default access (no modifier)
    public int b;       // public access
    private int c;      // private access

    // Method to access c
    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}
