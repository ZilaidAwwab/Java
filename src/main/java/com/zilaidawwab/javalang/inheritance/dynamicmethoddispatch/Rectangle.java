package com.zilaidawwab.javalang.inheritance.dynamicmethoddispatch;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2; // These vars are coming from the parent class
    }
}
