/**
 * These are Boolean operators not found in some other languages.
 * These are secondary versions of the Boolean "AND" and "OR" operators, and are commonly known
 * as "short-circuit logical operators".
 * The OR operator results in true when A is true, no matter what B is.
 * Similarly, AND operator results in false when A is false, no matter what B is.
 * If you use the || and && forms, rather than the | and & forms of these operators, Java will not
 * bother to evaluate the right-hand operand when the outcome of the expression can be determined
 * by the left operand alone.
 * This is very useful when the right-hand operand depends on the value of the left one in order to
 * function properly.
 */

package com.zilaidawwab.javalang.basics.operators.ShortCircuit;

public class ShortCircuitLogicalOperator {
    public static void main(String[] args) {

        int denom = 0;
        int num = 20;

        // Using Short-Circuit Operator
        // Since the short-circuit form of AND (&&) is used, there is no risk of causing a
        // run-time exception when denom is zero. If this line of code were written using
        // the single & version of AND, both sides would be evaluated, causing a runtime
        // exception when denom is zero.
        if (denom != 0 && num / denom > 10) System.out.println("No error");

        // Without using Short-Circuit
        // Using a single & ensures that the increment operation will be applied to num
        // whether denom is equal to 1 or not
        if (denom == 1 & num++ < 100) num = 100;

        System.out.println(num); // 21 (Shows that second condition was evaluated here)

        // Attribute about "Assignment" Operator (chain of assignments)
        int x, y, z;
        x = y = z = 100; // Here x, y, z are all set to 100 (But we have to first initialize them)
    }
}
