/**
 * Creating an Object (instance of a class), Utilizing a self-created Class (data type)
 */

package com.zilaidawwab.javalang.classes.fundamentals;

public class BoxDemo {
    public static void main(String[] args) {

        // Object Creation
        Box myBox = new Box();
        double vol;

        // Assign values to myBox's instance variables
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // compute volume of box
        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume is " + vol);

        // Here we created just one box object, although we can have as much we want.
        // Most importantly, the instance values of one object won't affect the other
    }
}
