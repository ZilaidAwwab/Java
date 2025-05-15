/**
 * Demonstration of a Class that contains a method whose argument is that class
 */

package com.zilaidawwab.javalang.classes.objectsasparams;

public class Test {

    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
    // Here we could've written o.a == this.a, as "this" refers to the invoking object
    // and o is the invoked (passed) object.
}

/**
 * This is most useful while creating a constructor for class, so to provide functionality
 * for creating a copy of the same object
 *
 * class Box {
 *     double width;
 *     double height;
 *     double depth;
 *
 *     // Copy Constructor
 *     Box(Box ob) {
 *         width = ob.width;
 *         height = ob.height;
 *         depth = ob.depth;
 *     }
 *
 *     // Other constructors (No args, All args, and single value for all)
 * }
 *
 * // Utilization
 * class BoxUtil {
 *     public static void main(String[] args) {
 *
 *         Box myBox1 = new Box(10, 20, 10);
 *         Box myBox2 = new Box(myBox1); // copy of myBox1 object
 *         ...
 *     }
 * }
 */
