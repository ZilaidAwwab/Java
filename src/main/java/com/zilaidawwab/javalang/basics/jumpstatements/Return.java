/**
 * The return statement is used to explicitly return from a method
 * It causes program control to transfer back to the caller of the method
 */

package com.zilaidawwab.javalang.basics.jumpstatements;

public class Return {
    public static void main(String[] args) {

        boolean t = true;
        System.out.println("Before the return");

        if (t) return; // return to caller
        System.out.println("This won't execute");
    }
}
