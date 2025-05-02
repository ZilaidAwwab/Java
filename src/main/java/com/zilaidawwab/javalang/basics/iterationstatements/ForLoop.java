/**
 * Demonstration of simple for loop with example
 * For Loops that depends on multiple conditions
 * Using Commas, initializing multiple statements inside the for block
 * Variations in Loops
 */

package com.zilaidawwab.javalang.basics.iterationstatements;

public class ForLoop {
    public static void main(String[] args) {

        int n;

        for (n = 10; n > 0; n--) {
            System.out.println(n);
        }

        // Loop controlling variable ("n" here) could be declared inside the loop as well,
        // and it will work the same
        // for (int n = 10; n > 0; n--) ...

        // There's a difference in these 2 approaches. When the variable is declared inside the
        // for block, then the scope of the variable ends with the loop (as it is, in 2nd case)
        // While when declared outside (like in 1st case), the scope is not limited to the for loop

        // ** Examples **
        int num;
        boolean isPrime;
        num = 14;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            // since we don't want a number to be completely divisible by any number other than 1
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");

        // When the loop depends upon multiple conditions
        int a, b;
        b = 4;

        for (a = 1; a < b; a++) {
            System.out.println("A: " + a);
            System.out.println("B: " + b);
            b--;
        }

        // Using Commas, this could be written as,
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("A: " + a);
            System.out.println("B: " + b);
        }

        // ** Variations in Loops **
        // Until the expression generates a boolean expression, we are good to use that
        /**
         * boolean done = false;
         * for (int i = 0; !done; i++) {
         *     // ...
         *     if (interrupted()) done = true;
         * }
         */

        // Parts of the loop can be empty (the initialization and iteration parts are absent and
        // moved out of the for loop)
        int s;
        boolean done = false;
        s = 0;
        for ( ; !done; ) {
            System.out.println("S is " + 1);
            if (s == 10) done = true;
            s++;
        }
        // This is in fact a bad practice, only use this if the initial condition is
        // set through a complex expression elsewhere in the program or if the loop
        // control variable changes in a non-sequential manner determined by actions that
        // occur within the body of the loop

        // An intentional infinite loop
        for ( ; ; ) {
            System.out.println("Leaving all the fields empty results in an infinite loop");
        }
    }
}
