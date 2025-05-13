/**
 * Demonstration of Method Overloading in Java
 */

package com.zilaidawwab.javalang.classes.methodoverload;

public class MethodOverload {

    void test() {
        System.out.println("No Parameters");
    }

    // Overload test (method) for one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
    // If a function has return type other than void, then it must return a val of that type
    // Moreover, we can only save a value of the method/function in a variable, if it has a return value
}
