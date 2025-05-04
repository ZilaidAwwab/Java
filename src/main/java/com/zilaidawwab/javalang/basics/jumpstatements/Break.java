/**
 * Break Statement has 3 uses in Java.
 * 1. It terminates a statement sequence in a "switch" statement (already seen)
 * 2. It can be used to exit the loop
 * 3. It can be used as a "civilized" form of goto
 */

package com.zilaidawwab.javalang.basics.jumpstatements;

public class Break {
    public static void main(String[] args) {

        // *** Using break to exit the loop (Same can be done in while loop) ***
        for (int i = 0; i < 100; i++) {
            if (i == 10) break;
            System.out.println("i: " + i);
        }
        System.out.println("Loop Complete");
        // The for loop is designed from 0 to 99, the break statement causes it to terminate early

        // When used inside a set of nested loops, the break statement will only break
        // out of the innermost loop
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");

            for (int j = 0; j < 100; j++) {
                if (j == 10) break; // Only this 2nd loop will be terminated
                System.out.print(j + " ");
            }

            System.out.println();
        }
        System.out.println("Loops Complete");

        // *** Using break as a civilized form of goto ***
        // Labeled Break (label is any valid Java identifier followed by a colon)
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break");
                    if (t) break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block");
        }

        // Another example
        outer: {
            for (int i = 0; i < 3; i++) {
                System.out.println("Pass " + i + ": ");
                for (int j = 0; j < 100; j++) {
                    if (j == 10) break outer; // exit both loops
                    System.out.println(j + " ");
                }
                System.out.println("This will not print");
            }
            System.out.println("Loop Complete");
        }
    }
}

/**
 * ** First Example
 * Pass 0: 0 1 2 3 4 5 6 7 8 9
 * Pass 1: 0 1 2 3 4 5 6 7 8 9
 * Pass 2: 0 1 2 3 4 5 6 7 8 9
 * Loops complete
 */

/**
 * Another Example
 * Pass 0: 0 1 2 3 4 5 6 7 8 9 Loops complete.
 */

// The label break statement will only work if they are used inside the labeled block
