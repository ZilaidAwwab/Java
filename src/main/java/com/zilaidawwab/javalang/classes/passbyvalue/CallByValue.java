/**
 * Class to test the "Pass by Value" concept
 */

package com.zilaidawwab.javalang.classes.passbyvalue;

public class CallByValue {
    public static void main(String[] args) {

        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("A and B before the call: " + a + " " + b); // 15 20

        ob.meth(a, b);

        System.out.println("A and B after the call: " + a + " " + b); // 15 20
    }
}

// In Java argument passing is mostly a pass by value (unless it is an object)
