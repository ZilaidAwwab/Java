/**
 * Class utilizing the method that returns Object
 */

package com.zilaidawwab.javalang.classes.returningobjects;

public class ReturnObj {
    public static void main(String[] args) {

        Test obj1 = new Test(2);
        Test obj2;

        obj2 = obj1.incrByTen(); // new object assigned which is 10 greater

        System.out.println("obj1.a: " + obj1.a);
        System.out.println("obj2.a: " + obj2.a);

        obj2 = obj2.incrByTen(); // again new object assigned which is 10 greater
        System.out.println("obj2.a after second increase: " + obj2.a);
    }
}

// Each time incrByTen() is invoked, a new object is created, and a reference to it is
// returned to the calling routine.

// Objects are allocated dynamically using the "new" keyword
