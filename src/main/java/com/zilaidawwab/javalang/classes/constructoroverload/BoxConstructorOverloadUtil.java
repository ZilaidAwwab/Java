/**
 * Utilizing the Overloaded Constructors
 */

package com.zilaidawwab.javalang.classes.constructoroverload;

public class BoxConstructorOverloadUtil {
    public static void main(String[] args) {

        // Creating Boxes using various constructors
        BoxConstructorOverload myBox1 = new BoxConstructorOverload(10, 20, 50);
        BoxConstructorOverload myBox2 = new BoxConstructorOverload();
        BoxConstructorOverload myCube = new BoxConstructorOverload(7);

        double vol;

        // Get the volume of all boxes
        vol = myBox1.volume();
        System.out.println("Volume of 1st Box is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of 2nd Box is " + vol);

        vol = myCube.volume();
        System.out.println("Volume of Cube is " + vol);
    }
}
