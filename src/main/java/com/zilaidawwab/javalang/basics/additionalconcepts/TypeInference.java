/**
 * A simple demonstration of local variable type inference
 */

package com.zilaidawwab.javalang.basics.additionalconcepts;

public class TypeInference {
    public static void main(String[] args) {

        // Use type inference to determine the type of variable named avg.
        // In this case, double is inferred.
        var avg = 10.0;
        System.out.println("Value of avg: " + avg); // 10.0

        // In the following context, var is not the pre-defined identifier.
        // It is simply a user-identified variable name.
        int var = 1;
        System.out.println("Value of var: " + var); // 1

        // Interestingly, in the following sequence, var is used as both the type of
        // the declaration and as variable name in the initializer
        var k = -var; // Here -var is the variable named var not type
        System.out.println("Value of k: " + k); // -1

        // We can declare an array with var type
        // Here myArray is inferred to be int[]
        var myArray = new int[10]; // valid

        // We cannot use brackets to the left side of var declaration
        // var[] array = new int[10]; // wrong
        // var array[] = new int[10]; // wrong

        // It is important to emphasize that var can be used to declare a variable only
        // when that variable is initialized.
        // var counter; // wrong. Initializer required

        // This is again not valid (we can declare array with var, but can't initialize it)
        // var myArray = {1, 2, 3};

        //  var can be used only to declare local variables. It cannot be used when
        //  declaring instance variables, parameters, or return types
    }
}
