/**
 * Simple class with a method that takes an object as input so to demonstrate pass by reference
 */

package com.zilaidawwab.javalang.classes.passbyreference;

public class Test {

    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // pass by object
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
