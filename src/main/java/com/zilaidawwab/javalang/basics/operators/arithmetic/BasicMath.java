/**
 * Demonstrate the basic arithmetic operators
 */

package com.zilaidawwab.javalang.basics.operators.arithmetic;

public class BasicMath {
    public static void main(String[] args) {

        // arithmetic using integers
        System.out.println("Integer Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 6
        System.out.println("c = " + c); // 1
        System.out.println("d = " + d); // -1
        System.out.println("e = " + e); // 1

        // arithmetic using doubles
        System.out.println("/nFloating point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        System.out.println("da = " + da); // 2.0
        System.out.println("db = " + db); // 6.0
        System.out.println("dc = " + dc); // 1.5
        System.out.println("dd = " + dd); // -0.5
        System.out.println("de = " + de); // 0.5
    }
}
