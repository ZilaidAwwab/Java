/**
 * A Simple Java Class with variables and methods (Parent/Super Class)
 * Parent class do not have access to any of its child class, or any member of it
 * A parent class exists and can be used independently
 */

package com.zilaidawwab.javalang.inheritance.simple;

public class A {

    // This can be accessed by the child class directly
    int i, j;

    // This cannot be accessed directly, unless there's a setter or getter method for this
    private int f;

    void showIJ() {
        System.out.println("i and j are " + i + " " + j);
    }
}

/**
 * A class member that has been declared as private will remain private to its
 * class. It is not accessible by any code outside its class, including subclasses.
 */
