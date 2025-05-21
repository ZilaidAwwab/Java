/**
 * Testing the Access Modifiers in Java
 */

package com.zilaidawwab.javalang.classes.accessmodifiers;

public class AccessTest {
    public static void main(String[] args) {

        Test ob = new Test();

        // A and B can be accessed directly
        ob.a = 10;
        ob.b = 20;

        // This will cause error
        // ob.c = 30; (ERROR)

        // We can only access the private members via methods in other classes
        ob.setC(30);

        // We can set and get the public and no modifiers directly, while for private the
        // get and set methods are necessary
        System.out.println("A, B and C: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
