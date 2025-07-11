/**
 * Use an array to pass variable number of arguments to a method.
 * This is the old-style approach for variable length args (might be found in legacy code)
 */

package com.zilaidawwab.javalang.classes.variableargs;

public class Varargs {

    static void vaTest(int[] v) {
        System.out.print("Number of args: " + v.length + " contents: ");

        for (int x: v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
