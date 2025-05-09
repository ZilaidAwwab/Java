/**
 * Demonstration of a Simple Class
 */

package com.zilaidawwab.javalang.classes.fundamentals;

public class Box {

    double width;
    double height;
    double depth;

    // ***********************************
    // ** Defining Methods in the class **

    // computing and displaying volume of the box (Bad Approach)
    /**
     * void volume() {
     *     double volume = width * height * depth;
     *     System.out.print("Volume is ");
     *     System.out.println(volume);
     * }
     */

    // computing and returning volume of the box (Better Approach)
    double volume() {
        return width * height * depth;
    }

    // ***********************************
    // ** Parameterized Methods **

    // Setting the dimensions via a parameterized method
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // ***********************************
    // ** Constructors **
    // A constructor initializes an object immediately upon creation
    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    // ***********************************
    // ** Parameterized Constructors **
    /**
     * Box(double w, double h, double d) {
     *     width = w;
     *     height = h;
     *     depth = d;
     * }
     */

    // ***********************************
    // ** this keyword **
    // this can be used inside any method to refer to the current object
    // this is always a reference to the object on which the method was invoked
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

/**
 * Garbage Collection in Java
 * Objects are dynamically allocated by using the new operator, so when no references to an
 * object exist, that object is assumed to be no longer needed, and the memory occupied by
 * the object can be reclaimed (which we explicitly do in C++, using delete)
 */
