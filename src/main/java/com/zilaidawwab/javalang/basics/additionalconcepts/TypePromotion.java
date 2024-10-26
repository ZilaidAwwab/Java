/* all byte, short, and char values are promoted to int, as just described. 
 * Then, if one operand is a long, the whole expression is promoted to long. 
 * If one operand is a float, the entire expression is promoted to float. 
 * If any of the operands are double, the result is double.
 */

package com.zilaidawwab.javalang.basics.additionalconcepts;

public class TypePromotion {
    public static void main(String[] args) {
        
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = .1234;

        // Here the largest data type is double, so all the others types will be automatically promoted to type double (only if double is involved in computation)
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("Result: " + result);
    }
}

/*
 * In the first subexpression, f * b, b is promoted to a float and the result of the
 * subexpression is float. Next, in the subexpression i/c, c is promoted to int, and
 * the result is of type int. Then, in d * s, the value of s is promoted to double,
 * and the type of the subexpression is double. Finally, these three intermediate
 * values, float, int, and double, are considered. The outcome of float plus an int
 * is a float. Then the resultant float minus the last double is promoted to double,
 * which is the type for the final result of the expression.
 */
