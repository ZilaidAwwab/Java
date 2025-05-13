package com.zilaidawwab.javalang.classes.methodoverload;

public class MethodOverloadUtil {
    public static void main(String[] args) {

        MethodOverload mo = new MethodOverload();
        double result;

        // call all versions of test()
        mo.test();
        mo.test(10);
        mo.test(10, 20);

        result = mo.test(123.25);
        System.out.println("Result of mo.test(123.25) is: " + result);

        // Java can also perform automatic conversion from lower to higher data types at times
        // If we didn't have the method with single int param, then the second call we made here
        // would've handled by the double param method (since int is small and double is higher)
    }
}
