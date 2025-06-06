/**
 * Using Run-Time Polymorphism
 */

package com.zilaidawwab.javalang.inheritance.dynamicmethoddispatch;

public class Figure {

    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        System.out.println("Area for figure is undefined.");
        return 0;
    }
}
