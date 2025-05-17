/**
 * Class to test the "pass by reference" in Java
 */

package com.zilaidawwab.javalang.classes.passbyreference;

public class CallByReference {
    public static void main(String[] args) {

        Test ob = new Test(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b); // 15 20

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b); // 30 10
    }
}

// Here the method call (which takes an object as arg) has altered the values showing
// call by reference in case of object passing
