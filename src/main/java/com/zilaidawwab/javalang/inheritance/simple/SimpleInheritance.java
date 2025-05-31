/**
 * Class utilizing the Parent and Child Classes
 * This class demonstrates that we can have objects of parent and child classes separately,
 * and they won't affect each other
 */

package com.zilaidawwab.javalang.inheritance.simple;

public class SimpleInheritance {
    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        // The super class maybe used by itself
        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Contents of SuperOb: ");
        superOb.showIJ();
        System.out.println();

        // The subclass has access to all public member of its super class
        // Here i and j are referred directly as they are part of this class
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.print("Contents of SubOb:");
        subOb.showIJ();
        subOb.showK();
        System.out.println();

        System.out.println("Sum of I, J and K in SubOb is");
        subOb.sum();
    }
}
