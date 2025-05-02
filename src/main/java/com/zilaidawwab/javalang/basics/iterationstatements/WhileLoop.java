/**
 * Simple demonstration of while loop
 */

package com.zilaidawwab.javalang.basics.iterationstatements;

public class WhileLoop {
    public static void main(String[] args) {

        // ** 1st Demonstration**
        int n = 10;
        while (n > 0) {
            System.out.println("Tick: " + n);
            n--;
        }

        // ** 2nd Demonstration**
        // We can also have an empty while loop.
        // This is because null statement is syntactically valid in Java
        int i, j;
        i = 100;
        j = 200;

        // find midpoint between "i" and "j"
        // There's nothing in this loop, and semicolon is demonstration of null statement here
        while (++i < --j) ;

        // This will find the midpoint between "i" and "j"
        System.out.println("Midpoint is " + i); // 150
    }
}
