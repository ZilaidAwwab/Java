/**
 * Demonstration of Type Inference on User-defined Data Type
 */

package com.zilaidawwab.javalang.classes.typeinference;

public class MyClass {

    private int i;
    MyClass(int k) { i = k; }
    int getI() { return i; }
    void setI(int k) { if (k >= 0) i = k; }

    public static void main(String[] args) {

        // Using inference type on local variable
        // We must have to initialize a value when using var
        var mc = new MyClass(10);

        System.out.println("Value of I in my class is " + mc.getI()); // 10
        mc.setI(19);
        System.out.println("Value of I in my class now is " + mc.getI()); // 19
    }
}
