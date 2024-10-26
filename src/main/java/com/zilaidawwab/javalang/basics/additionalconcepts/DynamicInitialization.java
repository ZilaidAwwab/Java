/**
 * Java allows variables to be initialized dynamically using an expression
 * valid at the time the variable is declared
 */

package com.zilaidawwab.javalang.basics.additionalconcepts;

public class DynamicInitialization {
    public static void main(String[] args) {
        
        double a = 3.0, b = 5.0;

        // Here c variable is dynamically initialized
        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse is " + c);
    }
}
