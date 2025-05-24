/**
 * A field can be declared as final. Doing so prevents its contents from being
 * modified, making it, essentially, a constant. This means that we must initialize
 * a final field when it is declared. We can do this in one of two ways: First, we
 * can give it a value when it is declared. Second, we can assign it a value within
 * a constructor. The first approach is probably the most common.
 */

package com.zilaidawwab.javalang.classes.finalkeyword;

public class UseFinal {

    final int FILE_NEW = 1;
    final int FILE_OPEN = 2;
    final int FILE_SAVE = 3;
    final int FILE_SAVEAS = 4;
    final int FILE_QUIT = 5;
}

// It is a common coding convention to choose all uppercase identifiers for final
// Declaring a parameter final prevents it from being changed within the method
// Declaring a local variable final prevents it from being assigned a value more than once
// The keyword final can also be applied to methods, but its meaning is substantially different
// from when it is applied to variables
