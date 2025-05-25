/**
 * Demonstration of variable-length arguments (varargs)
 */

package com.zilaidawwab.javalang.classes.variableargs;

public class VarargsNew {

    // vaTest() is now using varargs
    static void vaTest(int ...v) {
        System.out.print("Number of args: " + v.length + " Contents: ");

        for (int x: v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        // Notice how the args passing is now done
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}

// v in vaTest() is treated as an array, because it is an array

/**
 * A method can have “normal” parameters along with a variable-length parameter. However, the
 * variable-length parameter must be the last parameter declared by the method, for example
 * int doit(int a, int b, int c, int ...z) {}
 *
 * The varargs parameter must be last
 * int doit(int a, int b, int c, int ...y, int z) {} (This would give an error)
 *
 * There must only be one varargs parameter in a method
 * int doIt(int ...a, double ...b) {} (This is also invalid)
 */
