/**
 * Parent class with an original method definition
 */

package com.zilaidawwab.javalang.inheritance.methodoverriding;

public class A {

    int i, j;

    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // display method
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

/**
 * In a class hierarchy, when a method in a subclass has the same name and type
 * signature as a method in its superclass, then the method in the subclass is said
 * to override the method in the superclass.
 */
