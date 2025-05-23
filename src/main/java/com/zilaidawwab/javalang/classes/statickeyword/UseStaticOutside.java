/**
 * Using static methods and variables from another class
 */

package com.zilaidawwab.javalang.classes.statickeyword;

public class UseStaticOutside {
    public static void main(String[] args) {

        // Calling the Static Variables
        System.out.println(UseStatic.a);
        System.out.println(UseStatic.b);

        // Calling the Static Method
        UseStatic.meth(10);
    }
}
