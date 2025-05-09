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
        // Most importantly, the instance values of one object won't affect the other object

        // ***********************************
        // ** Methods **

        // After creating the volume calculator method in the box class we can use it like
        // It will print the volume of the box based on params defined here
        myBox.volume();

        System.out.println("Volume is " + myBox.volume());

        // ***********************************
        // ** Parameterized Methods **

        // Using the parameterized method to set the dimensions of the box
        Box myBox1 = new Box();
        myBox1.setDim(10, 10, 20);

        System.out.println("Volume of another box is " + myBox1.volume());

        // ***********************************
        // ** Constructor **

        // this will be initialized using the constructor with the default values defined
        // in the constructor
        Box myBox2 = new Box();

        // ***********************************
        // ** Parameterized Constructor **
        Box myBox3 = new Box(20, 15, 20);
    }
}
