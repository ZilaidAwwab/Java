/**
 * This is the child class of abstract class
 * This can also be declared as an abstract class, if we have at least one abstract method in it
 * If the parent class have 5 methods, 2 defined and 3 abstract, it means that the child has to
 * define those 3 methods, but if the child is itself declared abstract, then it can define 1 or
 * 2 methods and leave others as abstract, that works as well
 */

package com.zilaidawwab.javalang.inheritance.abstractclass;

public class B extends A {

    void callMe() {
        System.out.println("B's implementation of call me");
    }

    public static void main(String[] args) {
        B b = new B();

        b.callMe();
        b.callMeToo();
    }
}
