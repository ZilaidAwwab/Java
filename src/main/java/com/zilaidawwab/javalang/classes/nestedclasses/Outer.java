/**
 * Demonstration of a nested (inner) class
 */

package com.zilaidawwab.javalang.classes.nestedclasses;

public class Outer {

    int outer_x = 100;

    void test() {
        // Inner classes can only be accessed by creating their object first (inner classes can't
        // be accessed directly)
        Inner inner = new Inner();
        inner.display();
    }

    // Inner Class (A nested class without static modifier is an inner class)
    class Inner {
        // This is the local var of inner class, and not accessible anywhere but this inner class
        int y = 10;

        void display() {
            // This shows that a non-static inner class can access all the vars and methods of
            // the enclosing class without creating its object
            System.out.println("Display: outer_x: " + outer_x);
        }
    }

    // int x = inner.y; (Can't do this either)

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.test();
    }
}
