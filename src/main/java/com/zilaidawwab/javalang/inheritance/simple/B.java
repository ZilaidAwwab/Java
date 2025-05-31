/**
 * A child/sub Class, inheriting Class A
 */

package com.zilaidawwab.javalang.inheritance.simple;

// The extends Keyword is crucial for inheriting a Class
public class B extends A {

    int k;

    void showK() {
        System.out.println("k is " + k);
    }

    // In this method, we are using variables defined in class A (Parent Class)
    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}

/**
 * Child class has access to all the public fields of its parent class and not private
 * A sub/child class, can be a super class for another class
 *
 * You can only specify one superclass for any subclass that you create. Java does not support
 * the inheritance of multiple superclasses into a single subclass. You can, as stated, create
 * a hierarchy of inheritance in which a subclass becomes a superclass of another subclass.
 * However, no class can be a superclass of itself.
 */
