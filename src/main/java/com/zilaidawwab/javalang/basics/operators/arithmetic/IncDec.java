package com.zilaidawwab.javalang.basics.operators.arithmetic;

public class IncDec {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b; // b is incremented first, then assigned to c
        d = a++; // a is first assigned to d, then incremented (but d stays same, not incremented with a)
        c++; // c is incremented

        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 3
        System.out.println("c = " + c); // 4
        System.out.println("d = " + d); // 1
    }
}
