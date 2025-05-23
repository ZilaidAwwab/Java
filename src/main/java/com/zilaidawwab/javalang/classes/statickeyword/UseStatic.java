/**
 * Demonstration of static variable, method and block
 */

package com.zilaidawwab.javalang.classes.statickeyword;

public class UseStatic {

    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // If we need to do computation in order to initialize the static variables, we
    // can declare a static block that gets executed exactly once, when the class is
    // first loaded.
    static {
        System.out.println("Static Block Initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}

// Outside the class in which they are defined, static methods and variables
// can be used independently of any object
