/**
 * 2nd Layer (Subclass of Box and Super class for Shipment)
 */

package com.zilaidawwab.javalang.inheritance.multilevelhierarchy;

public class BoxWeight extends Box {

    double weight;

    // clone of the object
    BoxWeight(BoxWeight ob) {
        super(ob);
        this.weight = ob.weight;
    }

    // constructor when all parameters are specified
    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    // default constructor
    BoxWeight() {
        super();
        this.weight = -1;
    }

    // constructor to create cube
    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}
