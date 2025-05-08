/**
 * An object variable referred to another variable
 */

package com.zilaidawwab.javalang.classes.fundamentals;

public class ObjectReference {
    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = b1;

        // b1 has been set to null, but b2 still points to the original object
        b1 = null;
    }
}

// When you assign one object reference variable to another object reference
// variable, you are not creating a copy of the object, you are only making a
// copy of the reference
