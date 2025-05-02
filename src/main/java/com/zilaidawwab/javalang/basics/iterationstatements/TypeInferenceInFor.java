/**
 * In JDK 10, a feature called "local variable type inference" was introduced, which allows the
 * type of local variable to be inferred from the type of its initializer. To use local variable
 * type inference, the type of the variable is specified as var and the variable must be initialized.
 * Local variable type inference can be used in a for loop when declaring and initializing the
 * loop control variable inside a traditional for loop, or when specifying the iteration variable
 * in a for-each for.
 */

package com.zilaidawwab.javalang.basics.iterationstatements;

public class TypeInferenceInFor {
    public static void main(String[] args) {

        // Use type inference with the loop control variable
        System.out.println("Value of x: ");
        for (var x = 2.5; x < 100.0; x = x * 2) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Use type inference with iteration variable
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Values in nums array: ");
        for (var v: nums) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}

/**
 * In first example the var is inferred to double, because that is the type of its initializer
 * In second example the var is inferred to int, because that is the element type in the array
 */

// So, if we are not sure about the type, then using var is useful (Post JDK 10)
