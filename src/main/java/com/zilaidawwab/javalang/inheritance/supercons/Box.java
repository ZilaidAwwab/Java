/**
 * Simple Java Class (that we are going to use to inherit in other class)
 */

package com.zilaidawwab.javalang.inheritance.supercons;

public class Box {

    double width;
    double height;
    double depth;

    // constructor clone for an existing object
    Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    // constructor for all args
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // constructor for no args
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor to create a cube
    Box(double len) {
        width = height = depth = len;
    }

    // computing volume
    double volume() {
        return width * height * depth;
    }
}
