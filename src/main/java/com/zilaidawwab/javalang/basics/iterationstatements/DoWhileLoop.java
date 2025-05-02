/**
 * Example of a simple do-while loop
 */

package com.zilaidawwab.javalang.basics.iterationstatements;

public class DoWhileLoop {
    public static void main(String[] args) {

        int n = 10;
        do {
            System.out.println("Tick " + n);
            n--;
        } while (n > 0) ;


        // There's a better version of the above loop
        int i = 20;
        do {
            System.out.println("Tick " + i);
        } while (--i > 10) ;
    }
}
