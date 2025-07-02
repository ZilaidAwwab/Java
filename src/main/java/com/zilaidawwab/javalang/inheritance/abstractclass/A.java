/**
 * Simple demonstration of Abstract Class
 * An abstract class can have method initialization with or without definition, but it must
 * have one or more abstract method
 */

package com.zilaidawwab.javalang.inheritance.abstractclass;

public abstract class A {

    abstract void callMe();

    // concrete methods are still allowed in abstract classes
    void callMeToo() {
        System.out.println("This is a concrete method");
    }
}

/**
 * We can not make an object from abstract class, although we can declare a reference variable
 * that we can then combine with a subclass object, as this A could be used as a type for any
 * of its subclass like
 * A a = new A(); // Not Acceptable
 * A a = new B(); // Acceptable (Here B is any subclass of A, B can not be abstract)
 */
