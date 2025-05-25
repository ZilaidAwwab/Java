/**
 * Demonstration of overloading varargs
 */

package com.zilaidawwab.javalang.classes.variableargs;

public class VarargsOverload {

    // Here we have multiple varargs based method overloaded (of the same name, different types)
    static void vaTest(int ...v) {
        System.out.println("vaTest(int...): " + "Number of args: " + v.length + " Contents: ");

        for (int x: v) System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ...v) {
        System.out.println("vaTest(boolean...): " + "Number of args: " + v.length + " Contents: ");

        for (boolean x: v) System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int ...v) {
        System.out.println("vaTest(String, int ...): " + "Number of args: " + v.length + " Contents: ");

        for (int x: v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3);
        vaTest(true, false, false);
        vaTest("Testing", 10, 20);
        // vaTest(); (This will result in an ERROR) This call is inherently Ambiguous
    }
}
