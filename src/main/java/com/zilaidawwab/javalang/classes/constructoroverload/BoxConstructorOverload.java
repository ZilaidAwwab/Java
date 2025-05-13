/**
 * Example of Constructor Overloading demonstrated
 */

package com.zilaidawwab.javalang.classes.constructoroverload;

public class BoxConstructorOverload {

    double width;
    double height;
    double depth;

    // All Args Constructor (with all arguments (dimension here) specified)
    BoxConstructorOverload(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // No Args Constructor (when no dimension is specified)
    BoxConstructorOverload() {
        // using -1 to indicate uninitialized box
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is created (1 arg for all sides)
    BoxConstructorOverload(double len) {
        width = height = depth = len;
    }

    // Computing and returning volume
    double volume() {
        return width * height * depth;
    }
}
