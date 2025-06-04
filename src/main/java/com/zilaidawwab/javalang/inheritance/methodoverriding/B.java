/**
 * Child class overriding the method defined in the parent class
 */

package com.zilaidawwab.javalang.inheritance.methodoverriding;

public class B extends A {

    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // overriding the show method defined in the parent class A
    // This method will now be shown everytime show() is called on an object of B
    // Unless we call the super class method in it so that both are shown (which we normally don't do)
    void show() {
        super.show();
        System.out.println("k: " + k);
    }

    // Testing the overridden method
    public static void main(String[] args) {

        B subOb = new B(1,2, 3);
        subOb.show(); // 3
    }
}

// Method of same name, with difference in parameters when defined in the same class is
// method overloading

/**
 * Method of same name with same arguments when defined in the child class is method overriding,
 * if the methods in inheritance setting contains different params then they are not overridden,
 * they are overloaded
 *
 * // If this is defined in the parent class
 * void show() {
 *     System.out.println("Hi");
 * }
 *
 * // And this is defined in the child class
 * void show(String name) {
 *     System.out.println("Hi, " + name);
 * }
 * Then this is method overloaded, not overridden, as the params are different, and for overriding
 * the params, and the return type has to be same
 *
 * So, these could be called on object of B, and depending upon the params, one will be called
 */


// Method overriding occurs only when the names and the type signatures of
// the two methods are identical. If they are not, then the two methods are simply overloaded
