/**
 * A child class demonstrating the use of super constructor
 */

package com.zilaidawwab.javalang.inheritance.supercons;

public class BoxWeight extends Box {

    double weight;

    BoxWeight(double width, double height, double depth, double weight) {

        // super constructor should be the first thing defined in the child constructor
        // Since we had overloaded constructors (more than one constructor) in the parent class
        // It makes total sense to call anyone of that here, that'll work
        super(width, height, depth);
        this.weight = weight;
    }

    // We can even overload this constructor as well
    BoxWeight() {
        super();
        this.weight = -1;
    }

    // constructor used to create a cube
    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    // ***** Special Consideration *****
    // Notice that super is passed object of type BoxWeight and not Box but the superclass
    // variable can be used to reference any object derived from that class, so all the
    // extensions on the Box class can be typed Box as well as they can take their object
    // Like it happened here
    BoxWeight(BoxWeight ob) {
        super(ob);
        this.weight = ob.weight;
    }

    // If we have variables in the super class whose name is same to a variable name in subclass
    // then we implement super() like this
    /**
     * BoxWeight(int a, int b) {
     *     super.i = a;
     *     i = b;
     * }
     */
}

/**
 * Since this child class is not directly accessing the members of parent class, so it doesn't
 * matter if those members are declared private, this functionality would work just fine
 *
 * ***
 * When a subclass calls super(), it is calling the constructor of its immediate superclass.
 * Thus, super() always refers to the superclass immediately above the calling class. This is
 * true even in a multilevel hierarchy
 *
 */
