/**
 * 3rd Layer (Subclass of BoxWeight, inherits everything that its parent contains)
 * So, combined functionalities of Box and BoxWeight
 */

package com.zilaidawwab.javalang.inheritance.multilevelhierarchy;

public class Shipment extends BoxWeight {

    double cost;

    // clone constructor
    Shipment(Shipment ob) {
        super(ob);
        this.cost = ob.cost;
    }

    // all args constructor
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        this.cost = c;
    }

    // no args constructor
    Shipment() {
        super();
        this.cost = -1;
    }

    // constructor to create cube
    Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}


// Super will always refer to the closest parent
// In a class hierarchy, constructors complete their execution in order of derivation,
// from superclass to subclass, So, if C extends B which extends A. First A -> B -> C
// constructors are executed
