/**
 * A simple Class whose method returns an Object
 */

package com.zilaidawwab.javalang.classes.returningobjects;

public class Test {

    int a;

    Test(int i) {
        a = i;
    }

    // Method returning Object
    Test incrByTen() {
        return new Test(a + 10);
    }
}
