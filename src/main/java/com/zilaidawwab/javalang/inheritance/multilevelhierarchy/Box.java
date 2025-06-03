/**
 * Demonstration of Multi-level Hierarchy (Having more than one child classes)
 *
 * 1st Layer
 */
package com.zilaidawwab.javalang.inheritance.multilevelhierarchy;

public class Box {

    double width;
    double height;
    double depth;

    // construct a clone of an object
    Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    // constructor with all dimensions specified
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth  =d;
    }

    // constructor with no dimensions specified
    Box() {
        this.width = -1;
        this.height = 1;
        this.depth = -1;
    }

    // constructor for cube
    Box(double len) {
        width = height = depth = len;
    }

    // computing volume
    double volume() {
        return width * height * depth;
    }
}
